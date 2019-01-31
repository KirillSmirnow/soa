package thistle.auth.controller;

import org.springframework.web.bind.annotation.RestController;
import thistle.shared.intrf.AuthController;
import thistle.shared.model.Thistle;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class AuthControllerImpl implements AuthController {

    @Override
    public Thistle getThistle() {
        return Thistle.builder()
                .name("Helloooo!")
                .height(ThreadLocalRandom.current().nextDouble(10, 100))
                .build();
    }
}
