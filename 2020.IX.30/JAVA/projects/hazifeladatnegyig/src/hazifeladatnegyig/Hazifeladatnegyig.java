/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazifeladatnegyig;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Hazifeladatnegyig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    int ev;
    int osszeg;
    String nev;
    char valasz;
    Scanner bemenet = new Scanner (System.in); 
        do {            

        System.out.println("Add meg a neved");
        nev = bemenet.next();
        
        System.out.println("Add meg a születési évszámod (1999 és 2020 között)");
        ev = bemenet.nextInt();
        while (!(ev >= 1999 && ev <= 2020)) 
        {
            System.out.println("A szám nem megfelelő! Adj meg egy számot az intervallumon belül!(1999-2020)");               
            ev = bemenet.nextInt();
        }

       
        osszeg = 2020 - ev;
        
        System.out.println("Szia " + nev + " Az életkorod " + ev);  
        
        System.out.println("Szeretnél új adatokat megadni?(i/n)");
       
        valasz = bemenet.next().toLowerCase().charAt(0);
        
        } while (valasz == 'i');  
        bemenet.close();

    
    
    
    
    
    }
    
}
