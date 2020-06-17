package io.gca.caps.Carnet;

public class Contact {
    //une adresse
    private String prenom;
    private String nom;
    private NumeroTel numeroTel;
    private Adresse adresse;

    public Contact(String parPrenom, String parNom, NumeroTel parNumeroTel, Adresse parAdresse) {
        this.prenom = parPrenom;
        this.nom = parNom;
        this.numeroTel = parNumeroTel;
        this.adresse = parAdresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }


}
