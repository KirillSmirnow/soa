package ml.thistle.soa.shared.profile;

import lombok.Getter;

import java.beans.ConstructorProperties;
import java.time.LocalDate;

@Getter
public class ProfileEdit {

    private final LocalDate birthday;

    @ConstructorProperties("birthday")
    public ProfileEdit(LocalDate birthday) {
        this.birthday = birthday;
    }
}
