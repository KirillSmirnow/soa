package thistle.gateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import thistle.shared.intrf.AuthController;
import thistle.shared.model.Thistle;

@RestController
@RequiredArgsConstructor
public class GatewayController {

    private final AuthController authController;

    @GetMapping("/api/thistles/1")
    public Thistle getThistle() {
        return authController.getThistle();
    }
}
