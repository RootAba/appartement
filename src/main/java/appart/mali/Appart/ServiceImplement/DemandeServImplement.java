package appart.mali.Appart.ServiceImplement;

import appart.mali.Appart.Model.Demande;
import appart.mali.Appart.Repository.DemandeRepository;
import appart.mali.Appart.Service.DemandeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DemandeServImplement implements DemandeService {

    @Autowired
    private  DemandeRepository demandeRepository;
    @Override
    public List<Demande> afficher() {
        return demandeRepository.findAll() ;
    }
}
