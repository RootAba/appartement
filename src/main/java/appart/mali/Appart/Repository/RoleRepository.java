package appart.mali.Appart.Repository;

import appart.mali.Appart.Model.ERole;
import appart.mali.Appart.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByNom(ERole nom);
}
