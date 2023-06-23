package appart.mali.Appart.Service;

import appart.mali.Appart.Model.Users;
import org.springframework.stereotype.Service;

import java.util.List;


   public interface UsersService {

    // create users
    Users ajouter(Users users);

    //Modifier user
    Users modifier(Long id, Users users);

    // supprimer user
    String supprimer (Long id);

    //Afficher user
    List<Users> afficher();









}


