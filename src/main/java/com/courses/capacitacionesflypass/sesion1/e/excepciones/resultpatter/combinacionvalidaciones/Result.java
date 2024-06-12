package com.courses.capacitacionesflypass.sesion1.e.excepciones.resultpatter.combinacionvalidaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

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

    public <U> Result<U> flatMap(Function<T, Result<U>> mapper) {
        if (isSuccess) {
            return mapper.apply(value);
        } else {
            return Result.failure(errorMessages);
        }
    }

    public Result<T> combine(Result<?> other) {
        if (this.isSuccess && other.isSuccess()) {
            return this;
        }
        
        List<String> combinedErrors = new ArrayList<>(this.errorMessages);
        combinedErrors.addAll(other.getErrorMessages());
        return Result.failure(combinedErrors);
    }
}
