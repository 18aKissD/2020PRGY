/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetelgykorlas;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Tetelgykorlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tTETELGYAKORLAS\n");
       
        Scanner bemenet = new Scanner(System.in);
        
        int[] tomb1;
        int[] tomb2;
        int elemSzam ;
        
        System.out.println("Hányszor akarod, hogy lefusson a program? Adj meg egy számot 10 és 20 között!");
        elemSzam = bemenet.nextInt();
        
        while (!(elemSzam <= 20 && elemSzam >= 10)) {            
        System.out.println("A szám nem felel meg a követelményeknek! Adj meg egy számot 10 és 20 között!");
        elemSzam = bemenet.nextInt();  
        }
        
        tomb1 = new int[elemSzam];
        tomb2 = new int[elemSzam];
        int tombDarab = 0;
        int tombOsszeg = 0;
        
        for (int i = 0; i < elemSzam; i++) {
            tombDarab++;
        }
        
        
        System.out.println("\nALÁ\n");

        for (int i = 0; i < elemSzam; i++) {
            tomb1[i]=(int)(Math.random()*200)-100;
            tomb2[i]=(int)(Math.random()*200)-100;
            tombOsszeg = tombOsszeg +tomb2[i];
            
            System.out.println(String.format("%, 5d", tomb1[i]));
            System.out.println(String.format("%, 5d", tomb2[i]));
        }
                System.out.println("\nMELLÉ\n");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(String.format("%, 5d", tomb1[i]));
            System.out.print(String.format("%, 5d", tomb2[i]));
        }
        

        
        System.out.println("\nAz első tömb " + tombDarab + " darab számot tartalmaz");
        System.out.println("\nAz első tömb összege: " + tombOsszeg);
        
        System.out.println("\n\tRANDOMSZÁMMAL\n");
        
        int elemSzam2;
        elemSzam2=(int)(Math.random()*10)+10;
        int[] tomb3 = new int[elemSzam2];
        int[] tomb4 = new int[elemSzam2];
        int tombDarab2 = 0;
        int tombOsszeg2 = 0;
                
                System.out.println("\nALÁ\n");
        
        for (int i = 0; i < elemSzam2; i++) {
        tombDarab2++;
            }
        
        
        
        for (int i = 0; i < elemSzam2; i++) {
            tomb3[i]=(int)(Math.random()*200)-100;
            tomb4[i]=(int)(Math.random()*200)-100;
            
            tombOsszeg2= tombOsszeg2+tomb4[i];
            
            System.out.println(String.format("%, 5d", tomb3[i]));
            System.out.println(String.format("%, 5d", tomb4[i]));
        }
                System.out.println("\nMELLÉ\n");
        for (int i = 0; i < elemSzam2; i++) {
            System.out.print(String.format("%, 5d", tomb3[i]));
            System.out.print(String.format("%, 5d", tomb4[i]));
        }
        
        System.out.println("\nA harmadik, negyedik tömb " + tombDarab2 + " darab számot tartalmaz");
        System.out.println("A negyedik tömb összege: " + tombOsszeg2);
        

        

        
        
    }
    
}