package appart.mali.Appart.ServiceImplement;

import appart.mali.Appart.Model.Appartements;
import appart.mali.Appart.Model.Users;
import appart.mali.Appart.Repository.AppartRepository;
import appart.mali.Appart.Repository.UsersRepository;
import appart.mali.Appart.Service.AppartService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppartServiceImplement  implements AppartService {


    public Users users;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private AppartRepository appartRepository;
    @Override
    public Appartements ajouter(Appartements appartements) {
        return appartRepository.save(appartements);
    }

    @Override
    public Appartements modifier(Long id, Users users) {
        return appartRepository.findById(id)
                .map(appartements ->{
                    appartements.setAdresseProprio(appartements.getQuartier());
                    appartements.setNbreChambre(appartements.getNbreChambre());
                    appartements.setNbreToilette(appartements.getNbreToilette());
                    appartements.setNreSalon(appartements.getNreSalon());
                    appartements.setPrixParAn(appartements.getPrixParAn());
                    appartements.setPrixParMois(appartements.getPrixParMois());
                    appartements.setPrixParJour(appartements.getPrixParJour());
                    appartements.setNumProprio(appartements.getNumProprio());
                    appartements.setVille(appartements.getVille());
                    appartements.setQuartier(appartements.getQuartier());
                    appartements.setNomProprio(appartements.getNomProprio());
                    appartements.setAutreInfo(appartements.getAutreInfo());
                    return appartRepository.save(appartements);

                } ).orElseThrow(()-> new RuntimeException("Appartement introuvable"));
    }

    @Override
    public String supprimer(Long id) {
        appartRepository.deleteById(id);
        return "Delete reussi";
    }

    @Override
    public List<Appartements> afficher() {
        return appartRepository.findAll();
    }

    // Appart par user
    @Override
    public List<Appartements> appartdunuser(Long id) {
        Users users = usersRepository.findById(id).get();
        return appartRepository.findByUser(users);
    }
}
