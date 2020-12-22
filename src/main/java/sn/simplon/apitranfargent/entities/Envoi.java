package sn.simplon.apitranfargent.entities;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Entity
public class Envoi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String date;
    private String montant;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "idRecepteur")
    private Recepteur recepteur;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "idEmetteur")
    private Emetteur emetteur;

    public Envoi(int id, String date, String montant, Recepteur recepteur, Emetteur emetteur) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.recepteur = recepteur;
        this.emetteur = emetteur;
    }

    public Envoi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public Recepteur getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Recepteur recepteur) {
        this.recepteur = recepteur;
    }

    public Emetteur getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Emetteur emetteur) {
        this.emetteur = emetteur;
    }
}
