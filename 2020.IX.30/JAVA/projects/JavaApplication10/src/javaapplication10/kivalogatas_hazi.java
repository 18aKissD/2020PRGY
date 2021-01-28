/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class kivalogatas_hazi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
            
System.out.println("\n\tKivalogatás tétele\n");
        
        int[] erdemnJegy =new int[5];
        int elemszam;

        System.out.println("Érdemjegyek: ");
        erdemnJegy[0]=1;
        erdemnJegy[1]=1;
        erdemnJegy[2]=2;
        erdemnJegy[3]=4;
        erdemnJegy[4]=5;
        
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". jegy: " + String.format("%, 2d", erdemnJegy[i]));
        }
        
        int[] masolat = new int[5];
        int kettesekDb =0;
        
        for (int i = 0; i < 5; i++) {
            if (erdemnJegy[i]==2) {
                masolat[kettesekDb++]=erdemnJegy[i];
            }
        }
        System.out.println("\nMásolat tömb elemei: ");
        for (int i = 0; i < kettesekDb; i++) {
            System.out.print(masolat[i] + " ");
        }
        
        System.out.println("\nKettesek száma: " + kettesekDb);

        System.out.println("\n\tKIVÁLOGATÁS TÉTEL kibővítése\n");
        
        Scanner bemenet = new Scanner(System.in);
        System.out.println("\nHány jegyet generáljunk?");
        elemszam = bemenet.nextInt();
        
        int egyesekDb2=0;
        int kettesekDb2=0;
        int harmasokDb2=0;
        int negyesekDb2=0;
        int otosokDb2=0;
        
        erdemnJegy=new int[elemszam];
        for (int i = 0; i < elemszam; i++) {
            erdemnJegy[i]= (int) (Math.random()*5)+1;
            System.out.println((i+1) + ". jegy: " + String.format("%, 2d", erdemnJegy[i]));
        }
        for (int i = 0; i < elemszam; i++) {
            if(erdemnJegy[i] == 1)
                egyesekDb2++;
            else if(erdemnJegy[i] == 2)
                kettesekDb2++;
            else if(erdemnJegy[i] == 3)
                harmasokDb2++;
            else if(erdemnJegy[i] == 4)
                negyesekDb2++;
            else if(erdemnJegy[i] == 5)    
                otosokDb2++;
            }
        
        System.out.println("egyesekdb: " + egyesekDb2);
        System.out.println("kettesekdb: " + kettesekDb2);
        System.out.println("harmasok: " + harmasokDb2);
        System.out.println("negyesek: " + negyesekDb2);
        System.out.println("otosok: " + otosokDb2);
        
        int[] egyesekDb = new int[egyesekDb2];
        int[] kettesekDB = new int[kettesekDb2];
        int[] harmasokDb = new int[harmasokDb2];
        int[] negyesekDb = new int[negyesekDb2];
        int[] otosokDb = new int[otosokDb2];
        
        int egyesElemSzam = 0;
        int kettesElemSzam = 0;
        int harmasElemSzam = 0;
        int negyesElemSzam = 0;
        int otosElemSzam = 0;

        for (int i = 0; i < elemszam; i++) {
            if (erdemnJegy[i]==1) {
                egyesekDb[egyesElemSzam]=1;
                egyesElemSzam++;
            }
            else if (erdemnJegy[i]==2) {
                kettesekDB[kettesElemSzam]=2;
                kettesElemSzam++;
            }
            else if (erdemnJegy[i]==3) {
                harmasokDb[harmasElemSzam]=3;
                harmasElemSzam++;
            }
            else if (erdemnJegy[i]==4) {
                negyesekDb[negyesElemSzam]=4;
                negyesElemSzam++;
            }
            else if (erdemnJegy[i]==5) {
                otosokDb[otosElemSzam]=5;
                otosElemSzam++;
            }
        }

        System.out.println("\nAz egyesek tömb elemei: ");
        for (int i = 0; i < egyesekDb.length; i++) {
            System.out.print(egyesekDb[i]);
        }
        System.out.println("\nA kettesek tömb elemei: ");
        for (int i = 0; i < kettesekDB.length; i++) {
            System.out.print(kettesekDB[i]);
        }
        System.out.println("\nA harmasok tömb elemei: ");
        for (int i = 0; i < harmasokDb.length; i++) {
            System.out.print(harmasokDb[i]);
        }
        System.out.println("\nA negyesek tömb elemei: ");
        for (int i = 0; i < negyesekDb.length; i++) {
            System.out.print(negyesekDb[i]);
        }
        System.out.println("\nAz otosok tömb elemei: ");
        for (int i = 0; i < otosokDb.length; i++) {
            System.out.print(otosokDb[i]);
        }
        
    }
    
}
