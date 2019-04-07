package ml.thistle.soa.shared.auth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("auth")
public interface OAuth2Controller extends AuthController {

    @PostMapping(path = "/oauth/token?grant_type=password", headers = "Authorization=Basic Y2xpZW50Og==")
    TokenResponse signIn(@RequestParam String username, @RequestParam String password);

    @PostMapping(path = "/oauth/token?grant_type=refresh_token", headers = "Authorization=Basic Y2xpZW50Og==")
    TokenResponse refreshToken(@RequestParam("refresh_token") String refreshToken);
}
