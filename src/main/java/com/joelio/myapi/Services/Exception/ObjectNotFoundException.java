package com.joelio.myapi.Services.Exception;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID =1L;

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(Throwable cause) {
        super(cause);
    }
}
