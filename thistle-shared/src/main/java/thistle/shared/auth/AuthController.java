package thistle.shared.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthController {

    @PostMapping("/sign-up")
    void signUp(@RequestBody SignUp signUp);
}
