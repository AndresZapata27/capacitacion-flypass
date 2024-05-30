package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.cons.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SugerenciaResponse {

    private String sugerenciaCliente;
    private String urlAudio;
    private List<Integer> idsProductosRecomendados;

}
