package ml.thistle.soa.shared.profile;

import lombok.Getter;
import ml.thistle.soa.shared.horoscope.UserHoroscope;

import java.beans.ConstructorProperties;
import java.time.LocalDate;

@Getter
public class Profile {

    private final String username;
    private final LocalDate birthday;
    private final int age;
    private final UserHoroscope horoscope;

    @ConstructorProperties({"username", "birthday", "age", "horoscope"})
    public Profile(String username, LocalDate birthday, int age, UserHoroscope horoscope) {
        this.username = username;
        this.birthday = birthday;
        this.age = age;
        this.horoscope = horoscope;
    }
}
