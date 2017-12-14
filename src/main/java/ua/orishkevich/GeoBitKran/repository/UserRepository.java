package ua.orishkevich.GeoBitKran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.orishkevich.GeoBitKran.model.User;

/**
 * //TODO add comments
 *
 * @author orishkevich
 * @since 02.12.2017
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}