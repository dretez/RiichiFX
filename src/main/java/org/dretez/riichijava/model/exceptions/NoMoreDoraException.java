package org.dretez.riichijava.model.exceptions;

public class NoMoreDoraException extends IllegalStateException {
    public NoMoreDoraException() {
        super();
    }

    public NoMoreDoraException(String message) {
        super(message);
    }

    public NoMoreDoraException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoreDoraException(Throwable cause) {
        super(cause);
    }
}
