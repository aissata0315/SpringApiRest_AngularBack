package sn.simplon.apitranfargent.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Emetteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private int cni;
    @OneToMany(mappedBy = "emetteur")
    private List<Envoi> envois = new ArrayList<>();

    public Emetteur(int id, String nom, String prenom, String telephone, int cni, List<Envoi> envois) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.cni = cni;
        this.envois = envois;
    }

    public Emetteur() {
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

    public int getCni() {
        return cni;
    }

    public void setCni(int cni) {
        this.cni = cni;
    }

    public List<Envoi> getEnvois() {
        return envois;
    }

    public void setEnvois(List<Envoi> envois) {
        this.envois = envois;
    }
}
