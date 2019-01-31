package thistle.auth.repository;

import thistle.auth.model.User;

import java.util.Optional;

public interface UserRepository extends BaseRepository<User> {

    Optional<User> findByLogin(String login);
}
