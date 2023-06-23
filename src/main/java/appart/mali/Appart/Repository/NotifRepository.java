package appart.mali.Appart.Repository;

import appart.mali.Appart.Model.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface NotifRepository extends JpaRepository <Notifications, Long> {
}
