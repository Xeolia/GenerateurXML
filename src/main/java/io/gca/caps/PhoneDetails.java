package io.gca.caps;

public class PhoneDetails {
    private String modele;
    private String ecran;
    private String stockage;
    public PhoneDetails(String modele, String ecran, String stockage) {
        this.modele = modele;
        this.ecran= ecran;
        this.stockage = stockage;
    }

    public String getModele() {
        return modele;
    }

    public String getEcran() {
        return ecran;
    }

    public String getStockage() {
        return stockage;
    }


}
