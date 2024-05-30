package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.cons.impl;


import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.polly.AmazonPolly;
import com.amazonaws.services.polly.AmazonPollyClientBuilder;
import com.amazonaws.services.polly.model.*;
import com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.GeneradorAudio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
@Slf4j
public class GeneradorAudioAws implements GeneradorAudio {

    public static final int LIMITE_VOZ_NEURAL = 1000;
    private final String claveAcceso;
    private final String claveSecreta;

    public GeneradorAudioAws(@Value("${aws.polly.access-key}") String claveAcceso,
                                       @Value("${aws.polly.secret-key}")String claveSecreta) {
        this.claveAcceso = claveAcceso;
        this.claveSecreta = claveSecreta;
    }

    @Override
    public InputStream generarAudioConRecomendacion(String mensajeParaAudio) {
        InputStream flujoAudio;

        try {

            BasicAWSCredentials credencialesAws = new BasicAWSCredentials(this.claveAcceso, this.claveSecreta);

            AmazonPolly cliente = AmazonPollyClientBuilder.standard()
                    .withCredentials(new AWSStaticCredentialsProvider(credencialesAws))
                    .withRegion(Regions.US_EAST_1)
                    .build();

            VoiceId idVoz = tipoVozBasadoEnTamanioMensaje(mensajeParaAudio);
            Engine motorVoz = tipoMotorBasadoEnTamanioMensaje(mensajeParaAudio);

            SynthesizeSpeechRequest solicitudSintesis = new SynthesizeSpeechRequest()
                    .withText(mensajeParaAudio)
                    .withVoiceId(idVoz)
                    .withOutputFormat(OutputFormat.Mp3)
                    .withEngine(motorVoz);
            SynthesizeSpeechResult resultadoSintesis = cliente.synthesizeSpeech(solicitudSintesis);
            flujoAudio = resultadoSintesis.getAudioStream();

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        return flujoAudio;
    }

    private static VoiceId tipoVozBasadoEnTamanioMensaje(String mensajeParaAudio) {
        return mensajeParaAudio.length() <= LIMITE_VOZ_NEURAL ? VoiceId.Mia : VoiceId.Penelope;
    }

    private static Engine tipoMotorBasadoEnTamanioMensaje(String mensajeParaAudio) {
        return mensajeParaAudio.length() <= LIMITE_VOZ_NEURAL ? Engine.Neural : Engine.Standard;
    }

}
