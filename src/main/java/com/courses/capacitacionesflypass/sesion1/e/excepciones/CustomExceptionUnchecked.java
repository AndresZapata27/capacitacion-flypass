package com.courses.capacitacionesflypass.sesion1.e.excepciones;

public class CustomExceptionUnchecked extends RuntimeException {

    public CustomExceptionUnchecked(String message) {
        super(message);
    }

    public CustomExceptionUnchecked(String message, Throwable cause) {
        super(message,cause);
    }
}
