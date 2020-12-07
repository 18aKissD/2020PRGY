/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatas2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Kivalogatas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //egy uj tömbbe helyezunk el
        int elemszam=5;
        int elemszam2=5;
        int[] jegy = new int  [elemszam];
        int[] kettesek = new int[elemszam2];

        for (int i = 0; i < elemszam; i++) {
            System.out.print("Adj meg egy jegyet 1-5ig");
            jegy[i]=input.nextInt();

            while (!(jegy[i]<= 5 && jegy[i]>= 1)) {
            System.out.println("Rossz számot adtál meg! Adj meg egy szamot 1 és 5 között");
            jegy[i] = input.nextInt();
            System.out.println(jegy[i]);
            }
        }
        System.out.println("\n\n\n");
                for(int i = 0; i < elemszam; i++)
        {

            System.out.print(i + 1 + ".: ");
            System.out.print(String.format("%, 5d", jegy[i]));
            System.out.println("");
        }
        int kettesDb = 0;
        for (int i = 0; i < elemszam2; i++) {
            if (jegy[i]==2){
            kettesek[kettesDb++]=jegy[i];
            }
        }
        System.out.print("\n\nMásolat tömb elemei: ");
        for (int i = 0; i < kettesDb; i++) {
            System.out.print(kettesek[i]+" ");
        }
        System.out.println("\nKettesek száma: "+kettesDb);
        //tolsd fel 1fel-5 közötti számokkal    irassuk ki ugy egymas melle kettesekDb változót
        
    }
    
}
