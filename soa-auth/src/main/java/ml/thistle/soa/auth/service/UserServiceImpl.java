package ml.thistle.soa.auth.service;

import lombok.RequiredArgsConstructor;
import ml.thistle.soa.auth.model.User;
import ml.thistle.soa.auth.repository.UserRepository;
import ml.thistle.soa.shared.auth.SignUp;
import ml.thistle.soa.shared.exception.SoaException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void signUp(SignUp signUp) {
        if (userRepository.existsById(signUp.getLogin())) {
            throw new SoaException("Login is already taken");
        }
        String passwordHash = passwordEncoder.encode(signUp.getPassword());
        userRepository.save(new User(signUp.getLogin(), signUp.getNickname(), passwordHash));
    }
}
