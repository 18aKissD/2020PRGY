/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teteteteteetettete;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Teteteteteetettete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("\nTETELGYAKORLAS\n");
       
        Scanner bemenet = new Scanner(System.in);
        
        int[] tomb1;
        int[] tomb2;
        int elemSzam;
        
        System.out.println("Hányszor akarod, hogy lefusson a program? Adj meg egy számot 10 és 20 között!");
        elemSzam = bemenet.nextInt();
        
        while (!(elemSzam <= 20 && elemSzam >= 10)) {            
        System.out.println("A szám nem felel meg a követelményeknek! Adj meg egy számot 10 és 20 között!");
        elemSzam = bemenet.nextInt();  
        }
        
        tomb1 = new int[elemSzam];
        tomb2 = new int[elemSzam];
        System.out.println("\nMELLÉ\n");
        for (int i = 0; i < elemSzam; i++) {
            tomb1[i]=(int)(Math.random()*200)-100;
            tomb2[i]=(int)(Math.random()*200)-100;
            
            System.out.println(String.format("%, 5d", tomb1[i]));
            System.out.println(String.format("%, 5d", tomb2[i]));
        }
        System.out.println("\nALÁ\n");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(String.format("%, 5d", tomb1[i]));
            System.out.print(String.format("%, 5d", tomb2[i]));
        }
          
        System.out.println("\nRANDOMSZÁMMAL\n");
        
        int elemSzam2;
        elemSzam2=(int)(Math.random()*10)+10;
        int[] tomb3 = new int[elemSzam2];
        int[] tomb4 = new int[elemSzam2];
                
                System.out.println("\nMELLÉ\n");
        for (int i = 0; i < elemSzam2; i++) {
            tomb3[i]=(int)(Math.random()*200)-100;
            tomb4[i]=(int)(Math.random()*200)-100;
            
            System.out.println(String.format("%, 5d", tomb3[i]));
            System.out.println(String.format("%, 5d", tomb4[i]));
        }
                System.out.println("\nALÁ\n");
        for (int i = 0; i < elemSzam2; i++) {
            System.out.print(String.format("%, 5d", tomb3[i]));
            System.out.print(String.format("%, 5d", tomb4[i]));
        }
        
        
        
        
        }
        
        
    }
    

   
