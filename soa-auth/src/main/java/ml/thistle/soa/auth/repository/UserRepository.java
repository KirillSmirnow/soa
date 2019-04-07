package ml.thistle.soa.auth.repository;

import ml.thistle.soa.auth.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
