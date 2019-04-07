package ml.thistle.soa.shared.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class FeignExceptionHandler implements ErrorDecoder {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Override
    @SneakyThrows
    public Exception decode(String method, Response response) {
        InputStream messageStream = response.body().asInputStream();
        ExceptionMessage exceptionMessage = OBJECT_MAPPER.readValue(messageStream, ExceptionMessage.class);
        return new SoaException(exceptionMessage);
    }
}
