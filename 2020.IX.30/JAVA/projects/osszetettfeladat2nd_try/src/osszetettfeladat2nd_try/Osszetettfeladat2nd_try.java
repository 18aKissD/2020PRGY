
package osszetettfeladat2nd_try;
import java.util.Scanner;

public class Osszetettfeladat2nd_try {

    
    public static void main(String[] args) {
        System.out.println("\n\tÖsszetett feladat\n");
        Scanner bemenet = new Scanner(System.in);
        
        char bekertValasz;
        
        do {
            //1. Hozz létre két tömböt: szamok1, szamok2 néven!
            //A két tömb, és a többi változó deklaráslása
            int[] szamok1;
            int[] szamok2;
            int[] ujtomb;
            boolean nula = false;//Változók deklarálása, és értékeinek megadása
            int elemszam =(int) (Math.random()*20)+10;//2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.
            int ujtombElemszam = 0;
            

            szamok1 = new int[elemszam];//Számok1-2 tömbök inicializálása
            szamok2 = new int[elemszam];
            
            for (int i = 0; i < elemszam; i++) {
                //3. Az elemek a -50 és +50 értéktartományba essenek.
                szamok1[i] =(int)(Math.random()*100)-50;//Számok1-2 tömbök értékadása
                szamok2[i] =(int)(Math.random()*100)-50;
            }
            //4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
            System.out.print("\n\nszamok1 elemei: ");//Számok1-2 tömb kiíratása
            for (int i = 0; i < elemszam; i++) 
                System.out.print(String.format("%, 5d", szamok1[i]));
            System.out.print("\n\nszamok2 elemei: ");
            for (int i = 0; i < elemszam; i++) 
                System.out.print(String.format("%, 5d", szamok1[i]));
            //5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe és írasd ki az elemeket.
            for (int i = 0; i < elemszam; i++) {//A számok1-2 tömbök megvizsgálása (,hogy tartalmaz-e 5-el osztható páros számokat) (kiválogatás tétele)
                if (Math.abs(szamok1[i])%2 ==0 && Math.abs(szamok1[i])%5 ==0) 
                    ujtombElemszam++;
                if (Math.abs(szamok2[i])%2 ==0 && Math.abs(szamok2[i])%5 ==0)
                    ujtombElemszam++;
            }
            ujtomb = new int[ujtombElemszam+1];//ujtomb tömb inicializálása
            ujtombElemszam = 0;
            for (int i = 0; i < elemszam; i++) {//A számok1-2 tömbök megvizsgálása (,hogy tartalmaz-e 5-el osztható páros számokat) (kiválogatás tétele)
                if (Math.abs(szamok1[i])%2 ==0 && Math.abs(szamok1[i])%5 ==0) 
                    ujtomb[ujtombElemszam++] = szamok1[i];
                if (Math.abs(szamok2[i])%2 ==0 && Math.abs(szamok2[i])%5 ==0)
                    ujtomb[ujtombElemszam++] = szamok2[i];
            }
            if (ujtombElemszam == 0) {//ujtomb tömb értékeinek kiíratása
                System.out.println("\n\nA tömbök nem tartalmaznak olyan számot, amely osztahtó 5-el, és páros.");
            }
            else {
                System.out.print("\n\nAz Ujtomb elemei: ");
                for (int i = 0; i < ujtombElemszam; i++) {
                    System.out.print(String.format("%, 5d", ujtomb[i]));
                    
                }
            }
            //6. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?
            for (int i = 0; i < ujtombElemszam; i++) {//A számok1-2 tömbök megvizsgálása (,hogy tartalmaz-e nullát)(kiválogatás tétele)
                if (ujtomb[i] == 0) {
                    nula=true;
                }
            }
            if (nula = true) //Kiratjuk, hogy a tömbök tartalmaznak-e nullát
                System.out.println("\n\nA tömbök tartalmaznak nullát");
            else
                System.out.println("\n\nA tömbök nem tartalmaznak nullát");
            //7. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...
            System.out.println("Szeretnéd-e újrafuttatni a programot(i/n)");//Do while, és Scanner használata (Do while, adatbekérés)
            bekertValasz = bemenet.nextLine().toLowerCase().charAt(0);
        } while (bekertValasz == 'i');
    }
    
}
