package org.dretez.riichijava.model.exceptions;

public class EmptyWallDrawException extends IllegalStateException {
    public EmptyWallDrawException() {
        super();
    }

    public EmptyWallDrawException(String message) {
        super(message);
    }

    public EmptyWallDrawException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyWallDrawException(Throwable cause) {
        super(cause);
    }
}
