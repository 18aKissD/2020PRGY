/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_tomb2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Feladat_tomb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k2;
        k2=0;
        int kp2;
        int valasz;
        
        Scanner bemenet = new Scanner(System.in);
        System.out.println("\nHány számból álljon a tömb?");
        valasz = bemenet.nextInt();
        int tomb[] = new int[valasz];
        System.out.println("A tömb elemei: ");
        
        for (int i = 0; i < valasz; i++) {
        tomb[i]=(int) (Math.random()*999)+1;

            kp2 = k2 + i+1;
        if (tomb[i] > -1 && tomb[i] < 10) {
              System.out.print("\n" + kp2 + ".:    " + tomb[i]); 
            }
            else if (tomb[i] > 9 && tomb[i] < 100) {
               System.out.print("\n" + kp2 + ".:   " + tomb[i]);  
            }
            else if(tomb[i] > 99 && tomb[i] < 1000)
            {
                System.out.print("\n" + kp2 + ".:  " + tomb[i]);  
            }
            else if(tomb[i] > 999 && tomb[i] < 10000) {
               System.out.print("\n" + kp2 + ".: " + tomb[i]);  
            }
        }
        
        
    }
    
}
