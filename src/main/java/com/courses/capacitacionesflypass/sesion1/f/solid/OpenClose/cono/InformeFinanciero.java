package com.courses.capacitacionesflypass.sesion1.f.solid.OpenClose.cono;

import com.jamiltonquintero.solid.b.OpenClose.InformeEnum;

import java.util.List;

public interface InformeFinanciero {

    InformeEnum tipo();
    void calcularInteresMensual(List<Long> interesesAcumulados);
}
