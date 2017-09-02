package com.example.aurlienpc.annuaireparis13;

import java.util.ArrayList;

/**
 * Created by AurélienPC on 20/07/2017.
 */

public class ListeContact {
    public static ArrayList<Enseignant> contacts = new ArrayList<>();


    /**
     * retourne l'Enseignant de la position donnée
     * @param position
     */
    public static Enseignant getEnseignant(int position)
    {
        return ListeContact.contacts.get(position);
    }

    /**
     * retourne la taille de la liste
     */
    public int taille()
    {
        return ListeContact.contacts.size();
    }
}
