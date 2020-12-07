/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszefoglalas;

/**
 *
 * @author user
 */
public class Osszefoglalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n\tÖSSZEGZÉS TÉTELE\n");
        
        int tomb[]=new int[5];
        
        int osszeg=0;
        for (int i = 0; i < tomb.length; i++) {
            tomb[i]=(int) (Math.random()*99)+1;
            osszeg=osszeg+tomb[i]; //
            if(i !=tomb.length -1)
                System.out.println(tomb[i] + " ");
            else
                System.out.println(tomb[i]);
        }           
            
            
            System.out.println("A számok átlaga: " + (double) osszeg / tomb.length);
            System.out.println("A számok átlaga: " + osszeg / 5.0);

        }
        
        
            
        
        
        
        
        
    }
    

