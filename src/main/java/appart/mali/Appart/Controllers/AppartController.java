package appart.mali.Appart.Controllers;

import appart.mali.Appart.Model.Appartements;
import appart.mali.Appart.Model.Messages;
import appart.mali.Appart.Model.Users;
import appart.mali.Appart.Repository.AppartRepository;
import appart.mali.Appart.Service.AppartService;
import org.aspectj.bridge.IMessage;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appart")
public class AppartController {
    @Autowired
    public AppartService appartService;

    @Autowired
    AppartRepository appartRepository;

    //******************Lister appart*******************************
    @GetMapping(value = "/lister")
    public List<Appartements> afficher(){
        return appartService.afficher();
    }

    //*****************************supprimer appart
    @DeleteMapping(value = "/supprimer/{id}")
    public  String supprimer(@PathVariable long id){
        return appartService.supprimer(id);
    }

    // ***************************ajout appart
    @PostMapping("/ajouter")
    public Object ajouter(@RequestBody Appartements appartements){

            appartService.ajouter(appartements);
            return "ajout appart reussi";

    }

    //*******************************modifier apparts
//    @PutMapping("/modifier/{id}")
//    public Appartements modifier(@PathVariable Long id, @RequestBody Appartements appartements){
//        return appartService.modifier(id, appartements);
//    }

    }
