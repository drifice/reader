package com.company.formation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DrissRhorbalReader {

    public DrissRhorbalReader() {
    }

    private java.util.List<String> readFichier(String unNomDeFichier) throws IOException {
        BufferedReader reader = null;
        List<String> list = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\drhor\\IdeaProjects\\DrissRhorbalReader\\src\\com\\company\\formation\\" + unNomDeFichier));
            String ligne = null;
            while ((ligne = reader.readLine()) != null) {
               list.add(ligne);
            }
        } catch (IOException e) {
            System.err.println("erreur de lecture: " + e.getMessage());
        } finally {
            if (reader != null) {
                try { reader.close(); } catch (IOException e) { e.printStackTrace(); }
            }
            return list;
        }
    }

    public java.util.List<String> readNom() throws IOException {
        String fichierNom = "nom.txt";
        List<String> listNom = new ArrayList<>();
        listNom = readFichier(fichierNom);

        return listNom;
    }

    public java.util.List<String> readPrenom() throws IOException {
        String fichierPrenom = "prenom.txt";
        List<String> listPrenom = new ArrayList<>();
        listPrenom = readFichier(fichierPrenom);

        return listPrenom;
    }
}
