/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuforothers;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MenuForOthers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        
        int[] szamok = new int[20];
        int valasz;
        System.out.println("A tömb elemei: ");
        for (int i = 0; i < 20; i++) {
            szamok[i] = (int) (Math.random()*100)-50;
            System.out.print(String.format("%, 5d", szamok[i]));
        }
        
        System.out.print("\n\n\nMelyik opciót szeretnéd választani?\n1 -  összeget számoltatni\n2 - szélsőértékeket kiíratni\n3 - van-e benne 40-50\n4 - Öttel osztható páros számok db-száma\n5 - adott számot tartalmazza-e\n\nA megadott szám: ");
        valasz = bemenet.nextInt();
        while (valasz <= 0 && valasz > 5) {            
            System.out.print("\n\n\nRossz számot adtál meg! Adj meg egy számot 1-5 között! Melyik opciót szeretnéd választani?\n1 -  összeget számoltatni\n2 - szélsőértékeket kiíratni\n3 - van-e benne 40-50\n4 - Öttel osztható páros számok db-száma\n5 - adott számot tartalmazza-e\n\nA megadott szám: ");
            valasz = bemenet.nextInt();
        }

        if (valasz == 1) {
            int tombOsszeg = 0;
            for (int i = 0; i < 20; i++) 
                tombOsszeg = tombOsszeg + szamok[i];
        }
        else if (valasz == 2) {
            int legKisebb = 50;
            int legNagyobb = -50;
            for (int i = 0; i < 20; i++) {
                if (szamok[i] < legKisebb) 
                    legKisebb = szamok[i];
                if (szamok[i] > legNagyobb) 
                    legNagyobb = szamok[i];
            }
            System.out.println("\n\nA legkisebb szám: " + legKisebb + "\nA legnagyobb szám: " + legNagyobb);
        } 
        else if (valasz == 3) {
            boolean negyvenOtvenKozott = false;
            for (int i = 0; i < 20; i++) {
                if (szamok[i] >= 40 && szamok[i] <= 50) {
                    negyvenOtvenKozott = true;
                    break;
                }
            }
            if (negyvenOtvenKozott == false) {
                System.out.println("A tömb nem tartalmaz 40 és 50 közé eső számot");
            }
            if (negyvenOtvenKozott == true) {
                System.out.println("A tömb tartalmaz 40 és 50 közé eső számot");
            }
        }
        else if (valasz == 4) {
            int ottelOszthatoParosDb = 0;
            for (int i = 0; i < 20; i++) {
                if (szamok[i] % 10 == 0) {
                    ottelOszthatoParosDb++;
                }
            }
            System.out.println("Ennyi öttel osztahó páros szám van: " + ottelOszthatoParosDb);
        }
        else if (valasz == 5) {
            int bekertSzam;
            int index = 0;
            System.out.print("\n\nAdd meg a számot: ");
            bekertSzam = bemenet.nextInt();
            for (int i = 0; i < 20; i++) {
                if (szamok[i] == bekertSzam) 
                    index = i+1;  
            }
            if (index == 0) 
                System.out.println("A tömb nem tartalmaz olyan számot, amelyet megadtál");
            else
                System.out.println("A szám indexe: " + index);
        }
    }
    
}

