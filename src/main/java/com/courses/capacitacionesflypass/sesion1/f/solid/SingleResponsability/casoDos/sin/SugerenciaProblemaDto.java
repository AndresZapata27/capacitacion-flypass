package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.sin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class SugerenciaProblemaDto {

    private String rutinaSugeridaCliente;
    private String componentesSugeridosCliente;
    private String tipoProblema;

}
