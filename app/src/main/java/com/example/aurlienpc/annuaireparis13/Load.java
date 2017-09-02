package com.example.aurlienpc.annuaireparis13;

import android.content.Context;
import android.content.res.Resources;

public class Load extends Thread {
    private Resources resources;
    
/**
* Constructeur de la classe Load
* N'utilisé que celui la
* @param r ressource nécessaire à l'accès aux fichier String.xml lors de l'execution
*/
    public Load(Resources r)
    {
        this.resources = r;
    }
    
    public void run()
    {
        String[] splitArray = null;

        String[] donnee = resources.getStringArray(R.array.DataProf);

        MainActivity.test = donnee.length;
        for(int i=0;i<donnee.length;i++)
        {
            splitArray= donnee[i].split(",");
            ListeContact.contacts.add(new Enseignant(Integer.parseInt(splitArray[0]), splitArray[1], splitArray[2]));
            splitArray = null;
        }

    }

}
