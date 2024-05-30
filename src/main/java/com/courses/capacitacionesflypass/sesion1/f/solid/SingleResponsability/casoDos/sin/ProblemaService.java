package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.sin;

import com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.cons.entity.Problema;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProblemaService {
    public static final String MENSAJE_EXISTEN_PRODUCTOS = " Te dejaremos estos productos como recomendacion a continuación";
    public static final String MENSAJE_NO_EXISTEN_PRODUCTOS = "No tenemos productos para recomendarte pero podemos darte el siguiente consejo: ";

    public Problema obtenerRecomendacionYSugerencia(SugerenciaRequest sugerenciaRequest) {

        var sugerencia = getSugerenciaProblemaDto();

        List<Integer> productIds = new ArrayList<>();

        String sugerenciaFinalAAudio = obtenerMensajeSugerencia(sugerencia, productIds);
        InputStream sugerenciaAudio = generarAudio(sugerenciaFinalAAudio);
        String audioUrl = guardarAudio(sugerenciaAudio);

        String ids = productIds.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        var problema = guardarProblema(new Problema(sugerenciaRequest.getProblema(),
                sugerenciaRequest.getEdadCliente(),
                sugerenciaRequest.getGeneroCliente(),
                sugerencia.getTipoProblema(),
                sugerencia.getComponentesSugeridosCliente(),
                sugerencia.getRutinaSugeridaCliente(),
                audioUrl,
                ids));

        return problema;

    }

    private static SugerenciaProblemaDto getSugerenciaProblemaDto() {
        var sugerencia = SugerenciaProblemaDto.builder()
                .tipoProblema("Tipo")
                .componentesSugeridosCliente("Componentes")
                .rutinaSugeridaCliente("Rutina")
                .build();
        /**
         *
         *  Algoritmo super complejo de recomendacion de mas de 40 lineas
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         */return sugerencia;
    }

    private InputStream generarAudio(String sugerenciaFinalAAudio) {
        return new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }

    private String guardarAudio(InputStream sugerenciaAudio) {
        return "";
    }

    private Problema guardarProblema(Problema problema) {
        return problema;
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

}
