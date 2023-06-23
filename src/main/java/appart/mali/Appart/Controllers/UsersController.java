package appart.mali.Appart.Controllers;

import appart.mali.Appart.Model.Appartements;
import appart.mali.Appart.Model.Users;
import appart.mali.Appart.Repository.UsersRepository;
import appart.mali.Appart.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UsersController {
    public final UsersService usersService;

    public UsersController(UsersService usersService, UsersRepository usersRepository) {
        this.usersService = usersService;
        this.usersRepository = usersRepository;
    }
    @Autowired
    private final UsersRepository usersRepository;

    // user ajout
    @PostMapping(value = "/ajouter")
    public Object ajouter(@RequestBody Users users){
        try{
            usersService.ajouter(users);
            return "Ajout reussi";
        }catch (Exception e){
            return "le user existe deja";
        }
    }
     // Lister user
    @GetMapping(value ="/lister")
    public List<Users> afficher(){
        return usersService.afficher();
    }

    // supprimer user

    @DeleteMapping(value = "/supprimer/{id}")
    public  String supprimer(@PathVariable long id){
        return usersService.supprimer(id);
    }

    //modifier user
    @PutMapping("/modifier/{id}")
    public Users modifier(@PathVariable Long id, @RequestBody Users users){
        return usersService.modifier(id, users);
    }
}
