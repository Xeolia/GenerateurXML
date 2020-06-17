package io.gca.caps;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PhoneDetails {
    @JacksonXmlProperty(isAttribute = false)
    private String modele;
    private String ecran;
    private String stockage;
    public @interface JacksonXmlProperty{
        boolean isAttribute() default false;
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
