package thistle.auth.repository;

import org.springframework.data.keyvalue.repository.KeyValueRepository;
import thistle.auth.model.User;

public interface UserRepository extends KeyValueRepository<User, String> {
}
