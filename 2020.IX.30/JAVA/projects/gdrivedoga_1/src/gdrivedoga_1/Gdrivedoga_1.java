/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdrivedoga_1;

/**
 *
 * @author user
 */
public class Gdrivedoga_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int elemszam = (int) (Math.random()*5)+5;
            int[] szamtomb1 = new int[elemszam];
            int[] szamtomb2 = new int[elemszam];
            int[] szamtomb3 = new int[elemszam];
            
            for (int i = 0; i < elemszam; i++) {
                szamtomb1[i] = (int) (Math.random()*200)-100;
                szamtomb2[i] = (int) (Math.random()*200)-100;
                szamtomb3[i] = (int) (Math.random()*200)-100;
        }
            System.out.print("\n\n Az első tömb elemei:     ");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%, 5d", szamtomb1[i]));
        }
            System.out.print("\n A második tömb elemei:   ");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%, 5d", szamtomb2[i]));
        }
            System.out.print("\n A harmadik tömb elemei:  ");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%, 5d", szamtomb3[i]));
        }
    }
    
}