/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author mattianaccarato
 */
public class Logger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Inserisci scuola, indirizzo,ubicazione: ");
        Scanner lettore=new Scanner(System.in);
        String scuola=lettore.next();
        String indirizzo=lettore.next();
        String ubicazione=lettore.next();
        System.out.print("Scrivi qualcosa: ");
        Scanner sc=new Scanner(System.in);
        String qualcosa=sc.nextLine();
        
        
        try {
            
          FileWriter fw=new FileWriter("data/log.txt");
          fw.write("scuola:" + scuola);
          fw.write("\t");
          fw.write("indirizzo:" + indirizzo);
          fw.write("\t");
          fw.write("ubicazione:" + ubicazione);
          fw.write("\t");
          fw.close();
          
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()) .log(Level.SEVERE, null , ex);
            
        }
        
        
        
    }
    
}
