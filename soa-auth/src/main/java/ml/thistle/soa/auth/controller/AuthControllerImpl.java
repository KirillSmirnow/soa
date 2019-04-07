package ml.thistle.soa.auth.controller;

import lombok.RequiredArgsConstructor;
import ml.thistle.soa.auth.service.UserService;
import ml.thistle.soa.shared.auth.AuthController;
import ml.thistle.soa.shared.auth.SignUp;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthControllerImpl implements AuthController {

    private final UserService userService;

    @Override
    public void signUp(SignUp signUp) {
        userService.signUp(signUp);
    }
}
