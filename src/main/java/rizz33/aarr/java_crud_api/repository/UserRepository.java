package rizz33.aarr.java_crud_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rizz33.aarr.java_crud_api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
