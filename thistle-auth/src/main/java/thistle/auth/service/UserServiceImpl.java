package thistle.auth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import thistle.auth.model.User;
import thistle.auth.repository.UserRepository;
import thistle.shared.auth.SignUp;
import thistle.shared.exception.ThistleException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void signUp(SignUp signUp) {
        if (userRepository.existsById(signUp.getLogin())) {
            throw new ThistleException("Login is already taken");
        }
        String passwordHash = passwordEncoder.encode(signUp.getPassword());
        userRepository.save(new User(signUp.getLogin(), signUp.getNickname(), passwordHash));
    }
}
