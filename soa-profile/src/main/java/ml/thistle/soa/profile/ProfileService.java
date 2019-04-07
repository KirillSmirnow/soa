package ml.thistle.soa.profile;

import lombok.RequiredArgsConstructor;
import ml.thistle.soa.shared.exception.SoaException;
import ml.thistle.soa.shared.horoscope.HoroscopeController;
import ml.thistle.soa.shared.horoscope.UserHoroscope;
import ml.thistle.soa.shared.profile.Profile;
import ml.thistle.soa.shared.profile.ProfileController;
import ml.thistle.soa.shared.profile.ProfileEdit;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
public class ProfileService implements ProfileController {

    private final UserProfileRepository profileRepository;
    private final HoroscopeController horoscopeController;

    private static int calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        int years = today.getYear() - birthday.getYear();
        if (today.withYear(birthday.getYear()).isBefore(birthday)) {
            return years - 1;
        }
        return years;
    }

    @Override
    public void editProfile(String username, ProfileEdit profileEdit) {
        UserProfile profile = profileRepository.findById(username)
                .orElseGet(() -> profileRepository.save(new UserProfile(username)));
        profile.setBirthday(profileEdit.getBirthday());
        profileRepository.save(profile);
    }

    @Override
    public Profile getProfile(String username) {
        UserProfile profile = profileRepository.findById(username)
                .orElseThrow(() -> new SoaException("Profile not found"));
        int age = calculateAge(profile.getBirthday());
        UserHoroscope horoscope = horoscopeController.getHoroscope(profile.getBirthday());
        return new Profile(username, profile.getBirthday(), age, horoscope);
    }
}
