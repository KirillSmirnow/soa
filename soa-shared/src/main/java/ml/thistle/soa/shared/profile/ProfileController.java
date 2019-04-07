package ml.thistle.soa.shared.profile;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("profile")
public interface ProfileController {

    @PutMapping("/profiles/{username}")
    void editProfile(@PathVariable String username, @RequestBody ProfileEdit profileEdit);

    @GetMapping("/profiles/{username}")
    Profile getProfile(@PathVariable String username);
}
