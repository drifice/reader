package com.company.formation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        DrissRhorbalReader driss = new DrissRhorbalReader();
        UtilisateurWriter user = new UtilisateurWriter();
        List<String> noms = new ArrayList<>();
        List<String> prenoms = new ArrayList<>();
        prenoms = driss.readPrenom();
        noms = driss.readNom();
        int compteur = prenoms.size();
        user.writeUtilisateur("users.txt",noms,prenoms,compteur);





    }
}
