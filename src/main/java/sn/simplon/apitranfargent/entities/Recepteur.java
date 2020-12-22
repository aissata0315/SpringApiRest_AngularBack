package sn.simplon.apitranfargent.entities;

import net.minidev.json.annotate.JsonIgnore;

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
    @OneToOne
    private Envoi envois ;

    public Recepteur(int id, String nom, String prenom, String telephone, Envoi envois) {
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

    public Envoi getEnvois() {
        return envois;
    }

    public void setEnvois(Envoi envois) {
        this.envois = envois;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
