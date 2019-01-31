package thistle.shared.auth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("auth")
public interface AuthController {

    @PostMapping("/sign-up")
    void signUp(@RequestBody SignUp signUp);
}
