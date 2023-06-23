package appart.mali.Appart.ServiceImplement;

import appart.mali.Appart.Model.ERole;
import appart.mali.Appart.Model.Role;
import appart.mali.Appart.Model.Users;
import appart.mali.Appart.Repository.RoleRepository;
import appart.mali.Appart.Repository.UsersRepository;
import appart.mali.Appart.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

   @Service
   public class UsersServiceImplement  implements UsersService {

//    public Users users;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RoleRepository roleRepository;

    // pour que ca prenne directement le role de visiteur apres creation
    @Override
    public Users ajouter(Users users) {
//        Set<Role> roles = new HashSet<>();
        Role userRole = roleRepository.findByNom(ERole.ROLE_VISITEUR);
//        roles.add(userRole);
        users.setRole(userRole);
        return usersRepository.save(users);

    }

    @Override
    public Users modifier(Long id, Users users) {
        return usersRepository.findById(id)
                .map(users1 -> {
                    users1.setNumero(users.getNumero());
                    users1.setNom_renom(users.getNom_renom());
                    users1.setPassword(users.getPassword());
                    return usersRepository.save(users1);
                }).orElseThrow(()->new RuntimeException("User inexistant")
                );

    }

    @Override
    public String supprimer(Long id) {
        usersRepository.deleteById(id);
        return "supprime avec succes";
    }

    @Override
    public List<Users> afficher() {
        return usersRepository.findAll();
    }
}

