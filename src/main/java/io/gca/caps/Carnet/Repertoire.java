package io.gca.caps.Carnet;

import java.util.ArrayList;
import java.util.List;

public class Repertoire {
    //liste de contact

    private ArrayList<Contact> mesContacts;

    public Repertoire() {
        mesContacts = new ArrayList<Contact>();
    }

    public void ajouterContact(String prenom, String nom, NumeroTel num, Adresse adresse){
        mesContacts.add(new Contact(prenom,nom,num,adresse));
    }
    public void supprimerContact(String prenom){
        for(int index = 0; index<mesContacts.size();index++){
            if(mesContacts.get(index).getPrenom() == prenom){
                mesContacts.remove(index);
            }
        }
    }
    public List<Contact> getContact() {
        return mesContacts;
    }
}
