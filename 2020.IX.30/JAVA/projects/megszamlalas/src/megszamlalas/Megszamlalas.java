/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package megszamlalas;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Megszamlalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n\tMÉGSZÁMLÁLÁS TÉTELE\n");
        
        System.out.print("Hány eleme legyen a tömbnek: ");
        
        Scanner input = new Scanner(System.in);
        
        int elemSzam = input.nextInt();
        int[] tomb = new int  [elemSzam];
        
        int szamokDB = 0;
        int parosSzamokDB=0;
        
        for(int i = 0; i < elemSzam; i++)
        {
            tomb[i] = (int) (Math.random() * 999) + 1;  //aktuális tömbelem
        }
        
        for (int i = 0; i < elemSzam; i++) {
        szamokDB++;
            if (parosSzamokDB%2 == 0) {
                parosSzamokDB++;
            }
    
        }
        
        System.out.println(szamokDB + " DB szám van");
        System.out.println(parosSzamokDB + " DB páros szám van");
        System.out.println("A tömb elemei:");
        
        for(int i = 0; i < elemSzam; i++)
        {
            System.out.print(i + 1 + ".: ");
            System.out.print(String.format("%, 5d", tomb[i])+"\n");
        }
        System.out.println(elemSzam+"="+tomb.length);




    }
    
}
