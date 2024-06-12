package com.courses.capacitacionesflypass.sesion1.e.excepciones.resultpatter.multiplesvalidaciones;

import java.util.ArrayList;
import java.util.List;

public class Result<T> {
    private final T value;
    private final List<String> errorMessages;
    private final boolean isSuccess;

    private Result(T value, List<String> errorMessages, boolean isSuccess) {
        this.value = value;
        this.errorMessages = errorMessages;
        this.isSuccess = isSuccess;
    }

    public static <T> Result<T> success(T value) {
        return new Result<>(value, new ArrayList<>(), true);
    }

    public static <T> Result<T> failure(List<String> errorMessages) {
        return new Result<>(null, errorMessages, false);
    }

    public static <T> Result<T> failure(String errorMessage) {
        List<String> errorMessages = new ArrayList<>();
        errorMessages.add(errorMessage);
        return new Result<>(null, errorMessages, false);
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public T getValue() {
        if (!isSuccess) {
            throw new IllegalStateException("Cannot get value from a failure result.");
        }
        return value;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void addError(String errorMessage) {
        this.errorMessages.add(errorMessage);
    }

    public void addErrors(List<String> errorMessages) {
        this.errorMessages.addAll(errorMessages);
    }
}
