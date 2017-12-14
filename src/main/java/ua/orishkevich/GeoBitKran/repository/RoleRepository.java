package ua.orishkevich.GeoBitKran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.orishkevich.GeoBitKran.model.Role;

/**
 * //TODO add comments
 *
 * @author orishkevich
 * @since 02.12.2017
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByRole(String role);

}
