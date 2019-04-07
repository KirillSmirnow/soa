package ml.thistle.soa.shared.exception;

import lombok.Getter;

import java.beans.ConstructorProperties;

@Getter
public class ExceptionMessage {

    private final String userMessage;
    private final String developerMessage;

    @ConstructorProperties({"userMessage", "developerMessage"})
    public ExceptionMessage(String userMessage, String developerMessage) {
        this.userMessage = userMessage;
        this.developerMessage = developerMessage;
    }
}
