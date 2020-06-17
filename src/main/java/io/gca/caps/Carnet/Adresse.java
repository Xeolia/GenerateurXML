package io.gca.caps.Carnet;

public class Adresse {
    //adresse cp ville
    private String rue;
    private int numero;
    private String ville;
    private String codePostal;

    public Adresse(String rue, int numero, String ville, String codePostal) {
        this.rue = rue;
        this.numero = numero;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public String getRue() {
        return rue;
    }

    public int getNumero() {
        return numero;
    }

    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }
}
