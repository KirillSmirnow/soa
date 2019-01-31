package thistle.shared.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class FeignExceptionHandler implements ErrorDecoder {

    @Override
    @SneakyThrows
    public Exception decode(String method, Response response) {
        ObjectMapper mapper = new ObjectMapper();
        ExceptionMessage exceptionMessage = mapper.readValue(response.body().asInputStream(), ExceptionMessage.class);
        return new ThistleException(exceptionMessage);
    }
}
