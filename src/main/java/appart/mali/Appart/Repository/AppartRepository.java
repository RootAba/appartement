package appart.mali.Appart.Repository;

import appart.mali.Appart.Model.Appartements;
import appart.mali.Appart.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppartRepository extends JpaRepository <Appartements, Long> {

    List<Appartements> findByUser(Users users);
}
