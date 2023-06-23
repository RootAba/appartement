package appart.mali.Appart.ServiceImplement;

import appart.mali.Appart.Model.Notifications;
import appart.mali.Appart.Repository.NotifRepository;
import appart.mali.Appart.Service.NotifService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NotifServiceImplement implements NotifService {

    @Autowired
    private NotifRepository notifRepository;


  /*  @Override
    public List<Notifications> afficher() {

        Notifications notifications=new Notifications();
        notifications.setMessage("Interessee");
        notifRepository.save(notifications);

        return null;
    }*/
}
