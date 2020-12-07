/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhilescannergyakorlas;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Dowhilescannergyakorlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] cars = {"Volvo", "Mazda"};
        int V;
        Scanner bemenet = new Scanner (System.in);
        do {
            System.out.println("Az első autó: " + cars[0]);
            System.out.println("A második autó: " + cars[1]);
            System.out.println("Szeretnél új adatokat megadni?(0/1)");
            V = bemenet.nextInt();

            
        } while (V == 1);

        
    }
    
}
