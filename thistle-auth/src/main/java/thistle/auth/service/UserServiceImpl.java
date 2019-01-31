package thistle.auth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import thistle.auth.model.User;
import thistle.auth.repository.UserRepository;
import thistle.shared.auth.SignUp;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void signUp(SignUp signUp) {
        if (userRepository.findByLogin(signUp.getLogin()).isPresent()) {
            // throw exception
            return;
        }
        userRepository.save(new User(signUp.getLogin(), signUp.getNickname(), signUp.getPassword()));
    }
}
