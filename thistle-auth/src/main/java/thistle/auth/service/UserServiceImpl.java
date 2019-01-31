package thistle.auth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thistle.auth.model.User;
import thistle.auth.repository.UserRepository;
import thistle.shared.auth.SignUp;
import thistle.shared.exception.ThistleException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void signUp(SignUp signUp) {
        if (userRepository.findByLogin(signUp.getLogin()).isPresent()) {
            throw new ThistleException("Login is already taken");
        }
        userRepository.save(new User(signUp.getLogin(), signUp.getNickname(), signUp.getPassword()));
    }
}
