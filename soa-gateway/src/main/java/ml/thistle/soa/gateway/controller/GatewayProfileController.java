package ml.thistle.soa.gateway.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ml.thistle.soa.shared.profile.Profile;
import ml.thistle.soa.shared.profile.ProfileController;
import ml.thistle.soa.shared.profile.ProfileEdit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GatewayProfileController {

    private final ProfileController profileController;

    @PutMapping("/api/profile")
    public void edit(@RequestBody ProfileEdit profileEdit, Principal principal) {
        log.info("Principal#name = {}", principal.getName());
        profileController.editProfile(principal.getName(), profileEdit);
    }

    @GetMapping("/api/profile")
    public Profile get(Principal principal) {
        log.info("Principal#name = {}", principal.getName());
        return profileController.getProfile(principal.getName());
    }
}
