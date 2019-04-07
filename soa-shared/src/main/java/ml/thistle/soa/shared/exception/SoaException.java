package ml.thistle.soa.shared.exception;

import lombok.Getter;

@Getter
public class SoaException extends RuntimeException {

    private final ExceptionMessage exceptionMessage;

    public SoaException(String message) {
        this(message, message);
    }

    public SoaException(String userMessage, String developerMessage) {
        super(userMessage);
        this.exceptionMessage = new ExceptionMessage(userMessage, developerMessage);
    }

    public SoaException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage.getUserMessage());
        this.exceptionMessage = exceptionMessage;
    }
}
