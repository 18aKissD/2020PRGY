/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bence_help;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bence_help {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bemenet=new Scanner(System.in);
    int elemSzam =(int)(Math.random()*20)+10;
    int szamok1[]=new int[elemSzam];
    int szamokDb=0;
    int szamok2[]= new int[elemSzam];
    int ujTomb[] ;
    int nullaDb = 0;
    char valasz;
    
     do {
        for (int i = 0; i < elemSzam; i++) {
             szamok1[i]=(int)(Math.random()*100)-50;
             szamok2[i]=(int)(Math.random()*100)-50;
            }
            System.out.println("Tömb1 elemei: ");
            for (int i = 0; i < elemSzam; i++) 
                System.out.print(String.format("%,3d",szamok1[i])+" ");
            System.out.println("\nTömb2 elemei: ");
            for (int i = 0; i < elemSzam; i++) {
                System.out.print(String.format("%,3d",szamok2[i])+" ");
                if (Math.abs(szamok1[i])%2 ==0 && Math.abs(szamok1[i])%5 == 0)                 
                     szamokDb++;
                if (Math.abs(szamok2[i])%2 ==0 && Math.abs(szamok2[i])%5 == 0)                
                     szamokDb++;
            }
            ujTomb = new int[szamokDb+1];
            szamokDb = 0;
            for (int i = 0; i <elemSzam ; i++) {
                if (Math.abs(szamok1[i])%10 == 0)                 
                     ujTomb[szamokDb++]=szamok1[i]; 
                if (Math.abs(szamok2[i])%10 == 0)                
                     ujTomb[szamokDb++]=szamok2[i];

            }
            for (int i = 0; i < szamokDb; i++) {
                 if (ujTomb[i] == 0) 
                     nullaDb++;
            }
            System.out.print("\nAz ujTomb elemei: ");
                for (int i = 0; i <szamokDb ; i++)
                    System.out.print(ujTomb[i]+" ");

             if (nullaDb == 0) 
                 System.out.println("\nA tömbök nem tartalmaznak nullát");
             else
                 System.out.println("\nA nullák száma: " + nullaDb);

            System.out.print("\nSzeretné-e újrafuttatni a felhasználó a programot? (i/n)");

            valasz=bemenet.next().toLowerCase().charAt(0);
        } while (valasz=='i');
    
    }
}

    
    

