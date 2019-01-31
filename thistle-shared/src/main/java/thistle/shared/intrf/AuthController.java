package thistle.shared.intrf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import thistle.shared.model.Thistle;

@FeignClient("auth")
public interface AuthController {

    @GetMapping("/hi")
    Thistle getThistle();
}
