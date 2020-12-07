/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beadando;

/**
 *
 * @author user
 */
public class BeAdAnDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tOSSZEGZES TETELE\n");
        
        int[] tomb = new int[10];
        int[] tomb1 = new int[10];
        
        int osszeg = 0;
        int osszeg1 = 0;
        
        System.out.println("A tömb1 elemei: ");
        for(int i = 0; i < tomb.length; i++)
        {
            tomb[i] = (int) (Math.random() * 99) + 1;
            osszeg = osszeg + tomb[i]; // osszeg += tomb[i]
            System.out.print(tomb[i] + " ");
        }
        
        System.out.println("\nA tömb2 elemei: ");
        
        for(int i = 0; i < tomb1.length; i++)
        {
            tomb1[i] = (int) (Math.random() * 99) + 1;
            osszeg1 = osszeg1 + tomb1[i]; // osszeg += tomb[i]
            System.out.print(tomb1[i] + " ");
        }
        
        double atlag = osszeg / (double) tomb.length;
        double atlag1 = osszeg1 / (double) tomb1.length;
        System.out.println("\nAz első tömb számainak osszege: " + osszeg);
        System.out.println("Az első tömb számainak átlaga: " + atlag);
        
        System.out.println("\nA második tömb osszege: " + osszeg1);
        System.out.println("A második tömb átlaga: " + atlag1);
    }
    
}
