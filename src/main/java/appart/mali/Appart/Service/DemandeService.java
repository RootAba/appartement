package appart.mali.Appart.Service;

import appart.mali.Appart.Model.Demande;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DemandeService {

    // Afficher les demandes

   List<Demande> afficher ();


}
