/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pityuhelp;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pityuhelp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elemSzam = (int) (Math.random() * 5) + 5;
        int[] szamTomb1 = new int[elemSzam];
        int[] szamTomb2 = new int[elemSzam];
        int[] szamTomb3 = new int[elemSzam];
        
        for (int i = 0; i < elemSzam; i++) {
           
            szamTomb1[i] = (int) (Math.random() * 200) - 100;
            szamTomb2[i] = (int) (Math.random() * 200) - 100;
            szamTomb3[i] = (int) (Math.random() * 200) - 100;

        }
        
        System.out.print("\n\n Az első tömb elemei:     ");
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%, 5d", szamTomb1[i]));
        }
            System.out.print("\n A második tömb elemei:   ");
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%, 5d", szamTomb2[i]));
        }
            System.out.print("\n A harmadik tömb elemei:  ");
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%, 5d", szamTomb3[i]));
        }
            System.out.print("\n\nA haramadik tömb minden második eleme");
        for (int i = 1; i < elemSzam; i+=2) {
            System.out.print(String.format("%, 5d", szamTomb3[i]));
        }
        //6. A kiírt számok közül kérj be egyet a felhasználótól egy keresettElem nevű változóba, és írasd ki az indexét, azaz hanyadik elem!
        Scanner bemenet = new Scanner(System.in);
        System.out.print("\nAdj meg egy számot a kiírt elemek közül: ");
        
        int keresettElem = bemenet.nextInt();
        boolean ellenorzes = false;
        int index = 0;
        
        for (int i = 0; i < elemSzam; i++) {
            if (szamTomb1[i] == keresettElem) {
                ellenorzes = true;
                index = i+1;
                break;
            }
        }
        
        while (ellenorzes == false) {            
            System.out.print("\n\nRossz számot adtál meg! Adj meg egy számot az első tömb kiírt elemei közül: ");
                keresettElem = bemenet.nextInt();
                ellenorzes = false;
                for (int i = 0; i < elemSzam; i++) {
                    if (szamTomb1[i] == keresettElem) {
                        ellenorzes = true;
                        index = i+1;
                        break;
                    }
                }
        }
        System.out.println("A keresett szám indexe: " + index);
    bemenet.close();
    }
}
    
