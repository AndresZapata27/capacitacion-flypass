package com.courses.capacitacionesflypass.sesion1.e.excepciones;

public class CustomExceptionChecked extends Exception {

    public CustomExceptionChecked(String message) {
        super(message);
    }

    public CustomExceptionChecked(String message, Throwable cause) {
        super(message,cause);
    }
}
