package com.courses.capacitacionesflypass.sesion1.f.solid.SingleResponsability.casoDos.cons.impl;


import com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.cons.GenerarSugerencia;
import com.jamiltonquintero.solid.s.metodosyclases.sins.casoDos.sin.SugerenciaProblemaDto;
import org.springframework.stereotype.Service;

@Service
public class GeraraSolicitud implements GenerarSugerencia {


    @Override
    public SugerenciaProblemaDto solicitar() {

        //
        return SugerenciaProblemaDto.builder().build();
    }
}
