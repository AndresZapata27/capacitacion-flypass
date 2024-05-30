package com.courses.capacitacionesflypass.sesion1.f.solid.LiskovSubstitution.casoUno;

public class PatoNormal implements Pato{
    @Override
    public void nadar() {
        System.out.println("nadando");
    }

    @Override
    public void cuac(Integer bateria) {
        System.out.println("Cuac cuac!");
    }

    @Override
    public void caminar() {
        System.out.println("caminando");
    }

}
