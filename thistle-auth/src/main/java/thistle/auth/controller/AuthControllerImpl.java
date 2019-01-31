package thistle.auth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import thistle.auth.service.UserService;
import thistle.shared.auth.AuthController;
import thistle.shared.auth.SignUp;

@RestController
@RequiredArgsConstructor
public class AuthControllerImpl implements AuthController {

    private final UserService userService;

    @Override
    public void signUp(SignUp signUp) {
        userService.signUp(signUp);
    }
}
