
package osszetettfeladat2nd_try;
import java.util.Scanner;

public class Osszetettfeladat2nd_try {

    
    public static void main(String[] args) {
        System.out.println("\n\tÖsszetett feladat\n");
        Scanner bemenet = new Scanner(System.in);
        do {            
            int[] szamok1;
            int[] szamok2;
            boolean nula;
            char bekertValasz;
            int elemszam =(int) (Math.random()*50);

            szamok1 = new int[elemszam];
            szamok2 = new int[elemszam];
            
            for (int i = 0; i < elemszam; i++) {
                szamok1[i] =(int)(Math.random()*20)+10;
                szamok2[i] =(int)(Math.random()*20)+10;
            }
            System.out.print("\n\nszamok1 elemei: ");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%, 5d", szamok1[i]));
            }
            System.out.print("\n\nszamok2 elemei: ");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%, 5d", szamok1[i]));
            }
        } while (false);
    }
    
}
