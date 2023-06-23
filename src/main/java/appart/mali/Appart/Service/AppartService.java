package appart.mali.Appart.Service;

import appart.mali.Appart.Model.Appartements;
import appart.mali.Appart.Model.Users;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AppartService {

    // creation appart
    Appartements ajouter (Appartements appartements);

    //Modification appart
    Appartements modifier (Long id, Users users);

    //Suppression appart
    String supprimer (Long id);

    //Afficher apparts
    List<Appartements> afficher();

    // Afficher appart d'un user
    List<Appartements> appartdunuser(Long id);
}
