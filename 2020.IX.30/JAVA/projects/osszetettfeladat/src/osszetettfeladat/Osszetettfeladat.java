package osszetettfeladat;
import java.util.Scanner;

public class Osszetettfeladat {

    public static void main(String[] args) {
        char bekertValasz;
        
        do {            
            System.out.println("\n\tÖSSZETETT FELADAT\n");

            Scanner bemenet = new Scanner(System.in);

            //1. Hozz létre két tömböt: szamok1, szamok2 néven!

            int[] szamok1;
            int[] szamok2;
            int elemszam;
            int[] ujTomb;
            int ujTombElemszam = 0;
            int nullaDb = 0;

            //2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 10 és 30 között.

            elemszam=(int) (Math.random()*20)+10;

            szamok1 = new int[elemszam];
            szamok2 = new int[elemszam];


            //3. Az elemek a -50 és +50 értéktartományba essenek.

            for (int i = 0; i < elemszam; i++) {
                szamok1[i] = (int) (Math.random()*100)-50;
                szamok2[i] = (int) (Math.random()*100)-50;
                if (Math.abs(szamok1[i])%5 == 0 && Math.abs(szamok1[i])%2 == 0) 
                    ujTombElemszam++;
                if (Math.abs(szamok2[i])%5 == 0 && Math.abs(szamok2[i])%2 == 0) 
                    ujTombElemszam++;
                //4. Írasd ki a két tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.

                System.out.print(String.format("%, 5d", szamok1[i]));     
            }
            ujTomb = new int[ujTombElemszam+1];
            ujTombElemszam = 0;
            System.out.println("\n");
            for (int i = 0; i < elemszam; i++) {
                System.out.print(String.format("%, 5d", szamok2[i]));

                //5. Helyezd át a két tömb öttel osztható páros számait egy ujTomb nevű tömbbe és írasd ki az elemeket.(Eldöntés, kiválogatás, megszámlálás tétele)

                if (Math.abs(szamok1[i])%5 == 0 && Math.abs(szamok1[i])%2 == 0) 
                    ujTomb[ujTombElemszam++]=szamok1[i];
                if (Math.abs(szamok2[i])%5 == 0 && Math.abs(szamok2[i])%2 == 0) 
                    ujTomb[ujTombElemszam++]=szamok2[i];

                //6. Írasd ki, hogy 0-át tartalmaz-e az ujTomb?(Eldöntés, kiválogatás tétele)

                if (szamok1[i] == 0) 
                    nullaDb++;
                if (szamok2[i] == 0) 
                    nullaDb++;
            }
            System.out.print("\n\n5. feladat: ");
            if (ujTombElemszam == 0) 
                System.out.print("\nNem található olyan szám, amely osztahó 5-el, és páros");
            else    {
                System.out.print("\nAz ujTomb elemei: ");
                for (int i = 0; i < ujTombElemszam; i++) 
                    System.out.print(String.format("%, 5d", ujTomb[i]));
            }
            System.out.print("\n\n6.feladat: ");
            for (int i = 0; i < nullaDb; i++) 
                System.out.print(0 + " ");
            if (nullaDb == 0) 
                System.out.println("A tömbök nem tartalmaznak nullát");

            //7. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, haj rá...:(

            System.out.print("\n\nSzeretné-e újrafuttatni a felhasználó a programot (i/n)!");
            bekertValasz = bemenet.next().toLowerCase().charAt(0);
        } while (bekertValasz == 'i');
        
    }
    
}
