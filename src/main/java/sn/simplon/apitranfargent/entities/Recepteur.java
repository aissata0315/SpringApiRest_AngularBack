package sn.simplon.apitranfargent.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Recepteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    @OneToMany(mappedBy = "recepteur")
    private List<Envoi> envois = new ArrayList<>();

    public Recepteur(int id, String nom, String prenom, String telephone, List<Envoi> envois) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.envois = envois;
    }

    public Recepteur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Envoi> getEnvois() {
        return envois;
    }

    public void setEnvois(List<Envoi> envois) {
        this.envois = envois;
    }
}
