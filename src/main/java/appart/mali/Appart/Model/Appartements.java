package appart.mali.Appart.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor

public class Appartements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private Long id;
    private String ville;
    private String quartier;
    private Integer nbreChambre;
    private Integer nreSalon;
    private Integer nbreToilette;
    private Float prixParJour;
    private Float prixParMois;
    private Float prixParAn;
    private String autreInfo;
    private String nomProprio;
    private Integer numProprio;
    private String adresseProprio;

  @ManyToOne
    private Users user;

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public Integer getNbreChambre() {
        return nbreChambre;
    }

    public void setNbreChambre(Integer nbreChambre) {
        this.nbreChambre = nbreChambre;
    }

    public Integer getNreSalon() {
        return nreSalon;
    }

    public void setNreSalon(Integer nreSalon) {
        this.nreSalon = nreSalon;
    }

    public Integer getNbreToilette() {
        return nbreToilette;
    }

    public void setNbreToilette(Integer nbreToilette) {
        this.nbreToilette = nbreToilette;
    }

    public Float getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(Float prixParJour) {
        this.prixParJour = prixParJour;
    }

    public Float getPrixParMois() {
        return prixParMois;
    }

    public void setPrixParMois(Float prixParMois) {
        this.prixParMois = prixParMois;
    }

    public Float getPrixParAn() {
        return prixParAn;
    }

    public void setPrixParAn(Float prixParAn) {
        this.prixParAn = prixParAn;
    }

    public String getAutreInfo() {
        return autreInfo;
    }

    public void setAutreInfo(String autreInfo) {
        this.autreInfo = autreInfo;
    }

    public String getNomProprio() {
        return nomProprio;
    }

    public void setNomProprio(String nomProprio) {
        this.nomProprio = nomProprio;
    }

    public Integer getNumProprio() {
        return numProprio;
    }

    public void setNumProprio(Integer numProprio) {
        this.numProprio = numProprio;
    }

    public String getAdresseProprio() {
        return adresseProprio;
    }

    public void setAdresseProprio(String adresseProprio) {
        this.adresseProprio = adresseProprio;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
