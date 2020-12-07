/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcibuzi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Marcibuzi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //1.és2. feladat Változók Deklarálása és inicializálása
        System.out.println("\n\tÖSSZETETT FELADAT\n");
        Scanner input=new Scanner (System.in);
        /*int elemszam = (int)(Math.random()*20)+10;
        int[] szamok1 = new int [elemszam];
        int[] szamok2 = new int [elemszam];
        int[] ujTomb = new int [elemszam*2];*/
        char bekertValasz;
        //7. feladat eleje
        do {
        int elemszam = (int)(Math.random()*20)+10;
        int[] szamok1 = new int [elemszam];
        int[] szamok2 = new int [elemszam];
        int[] ujTomb = new int [elemszam*2];
        int nullaDb=0;
        int ujTombElemszam =0;
        //3.feladat értéket adunk a tömbbe lévő változóknak és 
        for (int i = 0; i < elemszam; i++) {
            szamok1[i] = (int) (Math.random()*100)-50;
            szamok2[i] = (int) (Math.random()*100)-50;
            
        }

        
        //4.feladat kiíratjuk a 2 tömböt helyiérték szerint
        System.out.println("\nA tömb elemei: ");
        for (int i = 0; i < elemszam; i++) 
            System.out.print(String.format("%, 5d",szamok1[i]));
        System.out.println("");
        for (int i = 0; i < elemszam; i++) 
            System.out.print(String.format("%, 5d",szamok2[i]));
        System.out.println("\n");
        
        //5. feladat másoljuk a feltételnek megfelelő számokat az "ujTomb"be
        for (int i = 0; i < elemszam; i++) {
            if (Math.abs(szamok1[i])%10 == 0) 
                    ujTomb[ujTombElemszam++] = szamok1[i];
            if (Math.abs(szamok2[i])%10 == 0) 
                    ujTomb[ujTombElemszam++] = szamok2[i];
            }
            //kiíratjuk az "ujTomb" elemeit (ha van)
            if (ujTombElemszam == 0) 
                System.out.print("\nNincs öttel osztható páros szám a tömbben");
            else 
                System.out.print("\nA 10el osztható számok a tömbből: ");
            for (int i = 0; i < ujTombElemszam; i++) 
                System.out.print(String.format("%, 5d", ujTomb[i]));
            for (int i = 0; i < ujTombElemszam; i++) {
            if (ujTomb[i] == 0) 
                    nullaDb++;
            }
            //6. feladat van/nincs elem a tömbbe
            ujTombElemszam=0;
            for (int i = 0; i < ujTombElemszam; i++) {
               if (Math.abs(szamok1[i])%2 ==0 && Math.abs(szamok1[i])%5 == 0)
                     ujTombElemszam++;
                if (Math.abs(szamok2[i])%2 ==0 && Math.abs(szamok2[i])%5 == 0)
                     ujTombElemszam++;
            }
            
            ujTomb = new int[ujTombElemszam];
            
            
            System.out.print("\nAz ujTomb elemei: ");
                for (int i = 0; i <ujTombElemszam ; i++)
                    System.out.print(ujTomb[i]+" ");

             if (nullaDb == 0) 
                 System.out.println("\nA tömbök nem tartalmaznak nullát");
             else
                 System.out.println("\nA nullák száma: " + nullaDb);
            //7. feladat vége
             System.out.print("\n\nFussosn le mégegyszer a kód(i/n)?");
                bekertValasz = input.next().toLowerCase().charAt(0);
            
            if (nullaDb == 0) 
                 System.out.println("\nA tömbök nem tartalmaznak nullát");
             else
                 System.out.println("\nA nullák száma: " + nullaDb);
            } while (bekertValasz == 'i');
        input.close();
    }
    
}
