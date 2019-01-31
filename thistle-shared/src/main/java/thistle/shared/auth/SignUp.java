package thistle.shared.auth;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SignUp {

    private final String login;
    private final String nickname;
    private final String password;
}
