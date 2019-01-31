package thistle.gateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import thistle.shared.auth.AuthController;
import thistle.shared.auth.SignUp;

@RestController
@RequiredArgsConstructor
public class GatewayAuthController {

    private final AuthController authController;

    @PostMapping("/auth/sign-up")
    public void signUp(@RequestBody SignUp signUp) {
        authController.signUp(signUp);
    }
}
