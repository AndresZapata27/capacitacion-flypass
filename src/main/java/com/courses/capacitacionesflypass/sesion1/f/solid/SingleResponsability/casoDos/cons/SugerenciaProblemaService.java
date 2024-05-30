package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.cons;


import com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.dto.SugerenciaRequest;
import com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.dto.SugerenciaResponse;
import com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.entity.Problema;
import com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.entity.Sugerencia;
import com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.sin.SugerenciaProblemaDto;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class SugerenciaProblemaService {
    public static final String MENSAJE_EXISTEN_PRODUCTOS = " Te dejaremos estos productos como recomendacion a continuación";
    public static final String MENSAJE_NO_EXISTEN_PRODUCTOS = "No tenemos productos para recomendarte pero podemos darte el siguiente consejo: ";

    private final AlmacenadorAudio almacenadorAudio;
    private final GeneradorAudio generadorAudio;
    private final ProblemaRepository problemaRepository;
    private final SugerenciaRepository sugerenciaRepository;
    private final GenerarSugerencia generarSugerencia;

    public SugerenciaProblemaService(AlmacenadorAudio almacenadorAudio,
                                     GeneradorAudio generadorAudio,
                                     ProblemaRepository problemaRepository,
                                     SugerenciaRepository sugerenciaRepository, GenerarSugerencia generarSugerencia) {
        this.almacenadorAudio = almacenadorAudio;
        this.generadorAudio = generadorAudio;
        this.problemaRepository = problemaRepository;
        this.sugerenciaRepository = sugerenciaRepository;
        this.generarSugerencia = generarSugerencia;
    }

    public SugerenciaResponse obtenerRecomendacionConAudio(SugerenciaRequest sugerenciaRequest) {

        var sugerencia = generarSugerencia.solicitar();

        var problema = this.problemaRepository.crear(new Problema(sugerenciaRequest.getProblema(),
                sugerenciaRequest.getEdadCliente(),
                sugerenciaRequest.getGeneroCliente(),
                sugerencia.getTipoProblema()));

        List<Integer> productIds = new ArrayList<>();

        String sugerenciaCliente = limpiarCaracteresEspecialesSugerencia(sugerencia.getRutinaSugeridaCliente());

        String sugerenciaFinalAAudio = obtenerMensajeSugerencia(sugerencia, productIds);

        InputStream sugerenciaAudio = this.generadorAudio.generarAudioConRecomendacion(sugerenciaFinalAAudio);
        String audioUrl = this.almacenadorAudio.guardarAudio(sugerenciaAudio);

        String ids = productIds.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        this.sugerenciaRepository.crear(new Sugerencia(
                sugerencia.getComponentesSugeridosCliente(),
                sugerencia.getRutinaSugeridaCliente(),
                audioUrl,
                ids,
                problema));

        return new SugerenciaResponse(sugerenciaCliente, audioUrl, productIds);

    }

    private static String obtenerMensajeSugerencia(SugerenciaProblemaDto sugerencia, List<Integer> productosIds) {
        String sugerenciaFinal;

        if(!productosIds.isEmpty()){
            sugerenciaFinal = sugerencia.getRutinaSugeridaCliente().concat(MENSAJE_EXISTEN_PRODUCTOS);
        } else {
            sugerenciaFinal = MENSAJE_NO_EXISTEN_PRODUCTOS.concat(sugerencia.getRutinaSugeridaCliente());
        }
        return sugerenciaFinal;
    }

    public static String limpiarCaracteresEspecialesSugerencia(String problema) {
        problema = problema.replaceAll("<[^>]*>|\\r|\\n|\\t|\n|\r|\t", "");
        return problema;
    }

}
