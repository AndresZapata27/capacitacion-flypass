package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.cons;

import java.io.InputStream;

public interface GeneradorAudio {
    InputStream generarAudioConRecomendacion(String messageToAudio);
}
