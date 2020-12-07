/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat_tomb3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Feladat_tomb3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



        int valasz;
        
        Scanner bemenet = new Scanner(System.in);
        System.out.println("\nHány számból álljon a tömb?");
        valasz = bemenet.nextInt();
        int tomb[] = new int[valasz];
        System.out.println("A tömb elemei: ");
        
        for (int i = 0; i < valasz; i++) {
        tomb[i]=(int) (Math.random()*9999)+1;
            System.out.println((i+1) +".: " + String.format("%, 6d", tomb[i]));
        }
    
    
    }
    
}
