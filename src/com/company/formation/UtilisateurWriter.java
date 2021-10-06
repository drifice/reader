package com.company.formation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurWriter {

    public UtilisateurWriter() {
    }
    public  void writeUtilisateur(String unNomDeFichier, java.util.List<String> desNoms, java.util.List<String> desPrenoms, int combien) throws IOException {
        String monsieur ="Mr";
        String madame ="Mme";
        BufferedWriter writer = null;
        try {
            int nombre = 123;
            writer = new BufferedWriter(new FileWriter(
                    "C:\\Users\\drhor\\IdeaProjects\\DrissRhorbalReader\\src\\com\\company\\formation\\" + unNomDeFichier));

            for( int i=0; i<combien; i++){
                if(i%2 ==0){
                    writer.write(i + ";" + monsieur + ";" + desNoms.get(i) + ";" + desPrenoms.get(i));
                    writer.newLine();
                } else {
                    writer.write(i + ";" + madame + ";" + desNoms.get(i) + ";" + desPrenoms.get(i));
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("erreur d'écriture: " + e.getMessage());
        } finally {
            if (writer != null) {
                try { writer.close(); } catch (IOException e) { e.printStackTrace(); }
            }
        }


    }

}
