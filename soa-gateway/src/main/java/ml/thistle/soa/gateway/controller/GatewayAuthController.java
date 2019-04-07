package ml.thistle.soa.gateway.controller;

import lombok.RequiredArgsConstructor;
import ml.thistle.soa.shared.auth.OAuth2Controller;
import ml.thistle.soa.shared.auth.SignUp;
import ml.thistle.soa.shared.auth.TokenResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GatewayAuthController {

    private final OAuth2Controller oAuth2Controller;

    @PostMapping("/auth/sign-up")
    public void signUp(@RequestBody SignUp signUp) {
        oAuth2Controller.signUp(signUp);
    }

    @PostMapping("/auth/sign-in")
    public TokenResponse signIn(@RequestParam String login, @RequestParam String password) {
        return oAuth2Controller.signIn(login, password);
    }

    @PostMapping("/auth/refresh-token")
    public TokenResponse refreshToken(@RequestParam String refreshToken) {
        return oAuth2Controller.refreshToken(refreshToken);
    }
}
