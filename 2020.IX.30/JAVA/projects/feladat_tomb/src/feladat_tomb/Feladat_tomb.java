/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_tomb;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Feladat_tomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int valasz;
        int k;
        int kp;
        k = 0;
        
        Scanner bemenet = new Scanner(System.in);
        System.out.println("Hány számból álljon a tömb?");
        valasz = bemenet.nextInt();
        
        
        int tomb1[]=new int[valasz];
        int tomb2[]=new int[valasz];
        int osszeg[]=new int[valasz]; 
        
        for (int i = 0; i < valasz; i++) {
        tomb1[i]=(int) (Math.random()*999)+1;
        tomb2[i]=(int) (Math.random()*999)+1;
        osszeg[i]=(int) tomb1[i] + tomb2[i];
        kp = k + i+1;
        if (tomb1[i] > -1 && tomb1[i] < 10) {
              System.out.print("\n" + kp + ".:    " + tomb1[i]); 
            }
            else if (tomb1[i] > 9 && tomb1[i] < 100) {
               System.out.print("\n" + kp + ".:   " + tomb1[i]);  
            }
            else if(tomb1[i] > 99 && tomb2[i] < 1000)
            {
                System.out.print("\n" + kp + ".:  " + tomb1[i]);  
            }
            else {
               System.out.print("\n" + kp + ".: " + tomb1[i]);  
            }
            if ( tomb2[i] > -1 && tomb2[i] < 10 ) {
              System.out.print(" +    " + tomb2[i]); 
            }
            else if(tomb2[i] > 9 && tomb2[i] < 100) {
               System.out.print(" +   " + tomb2[i]);  
            }
            else if (tomb2[i] > 99 && tomb2[i] < 1000) {
                System.out.print(" +  " + tomb2[i]);
            }
            else {
                System.out.print(" + " + tomb2[i]);
            }
            if ( osszeg[i] > -1 && osszeg[i] < 10  ) {
              System.out.print(" =    " + osszeg[i]); 
            }
            else if(osszeg[i] > 9 && osszeg[i] < 100) {
               System.out.print(" =   " + osszeg[i]);  
            }
            else if(osszeg[i] > 99 && osszeg[i] < 1000){
                System.out.print(" =  " + osszeg[i]);
            }
            else{
                System.out.print(" = " + osszeg[i]);
            }
        }
        int k2;
        k2=0;
        int kp2;
    
        System.out.println("\nHány számból álljon a tömb?");
        valasz = bemenet.nextInt();
        int tomb[] = new int[valasz];
        System.out.println("A tömb elemei: ");
        
        for (int i = 0; i < valasz; i++) {
        tomb[i]=(int) (Math.random()*999)+1;

            kp2 = k2 + i+1;
        if (tomb[i] > -1 && tomb[i] < 10) {
              System.out.print("\n" + kp2 + ".:    " + tomb1[i]); 
            }
            else if (tomb[i] > 9 && tomb1[i] < 100) {
               System.out.print("\n" + kp2 + ".:   " + tomb1[i]);  
            }
            else if(tomb[i] > 99 && tomb2[i] < 1000)
            {
                System.out.print("\n" + kp2 + ".:  " + tomb1[i]);  
            }
            else if(tomb[i] > 999 && tomb2[i] < 10000) {
               System.out.print("\n" + kp2 + ".: " + tomb1[i]);  
            }
        }
        
       
    }
    
}
