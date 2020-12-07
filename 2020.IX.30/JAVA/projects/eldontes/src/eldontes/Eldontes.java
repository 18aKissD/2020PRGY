/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldontes;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Eldontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tEldöntés tétele\n");
        
        int[] szamok;
        int elemszam = 0;

        Scanner bemenet = new Scanner(System.in);
        System.out.println("Adj meg egy számot 1-20ig");

        elemszam = bemenet.nextInt();
        
        while (!(elemszam >= 1 && elemszam <= 20)) {
            System.out.println("Rosssz számot adtál meg! Adj meg egy számot 1-20ig");
            elemszam = bemenet.nextInt();
            }
        

        szamok = new int[elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            szamok[i]=(int)(Math.random()*200)-100;
            System.out.print(String.format("%, 5d",szamok[i]) );
            if(szamok[i] == 0)
                System.out.println("A " + (i+1) +". elem tartalmaz nullát" );
                
            }

        
        
        
    }
    
}

