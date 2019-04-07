package ml.thistle.soa.profile;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class UserProfile {

    @Id
    private String username;

    @Setter
    private LocalDate birthday;

    public UserProfile(String username) {
        this.username = username;
    }
}
