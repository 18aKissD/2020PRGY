/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);//Importáljuk a Scannert az adatbekéréshez
        
        int[] szamok = new int[20];//Létrehozzuk a szükséges változókat a menü elérésére, valaitn a feladatban megadott randomszámos tömböt is itt hozzuk létre
        int valasz;
        System.out.println("A tömb elemei: ");//A tömb elemeit kiíratjuk
        for (int i = 0; i < 20; i++) //értéket adunk a tömbnek randomszámgenerátorral -50 és 50 között
        {
            szamok[i] = (int) (Math.random()*100)-50;//értéket adunk a tömbnek
            System.out.print(String.format("%, 5d", szamok[i]));//Tagolva (String.format) kiiratjuk a számokat
        }
        
        do {//do while ciklus létrehozása, hogy minden menüpont végén legyen arra lehetőség, hogy a felhasználó újra le tudja futtatni a programot
            
            //A menü kiíratássa, majd válasz bekérése a felhasználótól
            System.out.print("\n\n\nMelyik opciót szeretnéd választani?\n1 -  összeget számoltatni\n2 - szélsőértékeket kiíratni\n3 - van-e benne 40-50\n4 - Öttel osztható páros számok db-száma\n5 - adott számot tartalmazza-e\n\nA megadott szám: ");
            valasz = bemenet.nextInt();
            //While ciklus arra az esetre, ha a felhasználó rossz számot adott meg
            while (valasz <= 0 && valasz > 5) {            
                System.out.print("\n\n\nRossz számot adtál meg! Adj meg egy számot 1-5 között! Melyik opciót szeretnéd választani?\n1 -  összeget számoltatni\n2 - szélsőértékeket kiíratni\n3 - van-e benne 40-50\n4 - Öttel osztható páros számok db-száma\n5 - adott számot tartalmazza-e\n\nA megadott szám: ");
                valasz = bemenet.nextInt();
            }
            //A menürendszer elkészítése
            if (valasz == 1) //Itt az első válaszlehetőséget csináljuk meg, vagyis azt, hogy a proram kiszámolja a tömb értékét
            {
                int tombOsszeg = 0;//Létrehozunk egy tombOsszeg nevű változót
                for (int i = 0; i < 20; i++) //For ciklust készítünk úgy, hogy annyiszor fusson le, amennyi darab szám van a tömbben (Itt ugye 20)
                    tombOsszeg = tombOsszeg + szamok[i];//Az összeadás menete
                System.out.println("A tömb összege: " + tombOsszeg);//A tömb összegének kiíratása
                System.out.print("\n\nSzeretnéd újra futtatni a programot?\n0-nem\n1-igen\n\nA megadott szám: ");//Megkérdezzük a felhasználót, hogy szeretné-e újrafuttatni a programot
                valasz = bemenet.nextInt();//Majd bekérjük a felhasználótól az adatot
            }
            else if (valasz == 2) //A második válaszlehetőség elkészítése, melyben megnézzük a tömb legkisebb, és legnagyobb értékét
            {
                int legKisebb = 50;//Létrehozzuk a szükséges változókat, majd az értékadásnál a legKisebbnek adjuk a legnagyobb értéket(hogy biztosra menjünk, hiszen nem csak minusz szám lehet a legkisebb)
                int legNagyobb = -50;//Majd uyganígy a legNagyobb nevű változónak a legkisebb értéket adjuk
                for (int i = 0; i < 20; i++) {
                    if (szamok[i] < legKisebb) //Megvizsgálja a program, hogy a tömben található szám kisebb-e mint a legKisebb nevű változó értéke
                        legKisebb = szamok[i];//És ha igen, akkor megváltoztatja a legKisebb nevű változó értékét az éppen a tömbben található számra
                    if (szamok[i] > legNagyobb) //Megvizsgálja a program, hogy a tömben található szám nagyobb-e mint a legNagyobb nevű változó értéke
                        legNagyobb = szamok[i];//És ha igen, akkor megváltoztatja a legNagyobb nevű változó értékét az éppen a tömbben található számra
                }
                System.out.println("\n\nA legkisebb szám: " + legKisebb + "\nA legnagyobb szám: " + legNagyobb);//Majd kiíratjuk a legkisebb, és a legnagyobb értéket
                System.out.print("\n\nSzeretnéd újra futtatni a programot?\n0-nem\n1-igen\n\nA megadott szám: ");//Megkérdezzük a felhasználót, hogy szeretné-e újrafuttatni a programot
                valasz = bemenet.nextInt();//Majd bekérjük a felhasználótól az adatot
            } 
            else if (valasz == 3) //A harmadik válaszlehetőség elkészítése, amelyben megnézzük, hogy van-e 40 és 50 között lévő szám
            {
                boolean negyvenOtvenKozott = false;//Boolean változót hozunk létre, mivel csak azt kell megnéznünk, hogy van-e benne, vagy sem
                for (int i = 0; i < 20; i++) {
                    if (szamok[i] >= 40 && szamok[i] <= 50) //Megvizsgéljuk, hogy van-e benne olyan zsám, amely nagyobb vagy egyenlő mint 40 és kisebb vagy egyenlő mint 50
                    {
                        negyvenOtvenKozott = true;//Ha van, akkor a változót igazzá tesszük
                        break;//Majd kiléptetjük a ciklusból(Mivel az nem kell nekünk, hogy mennyi van, ezért elég, ha egy olyan számot talál, amely 40 és 50 között van)
                    }
                }
                //Kiíratásnál megnézzük, hogy igaz, vagy hamis a változónk. 
                if (negyvenOtvenKozott == false)//Ha hamis(false), akkor kiírja, hogy nincs benne 40 és 50 lözé eső szám
                    System.out.println("A tömb nem tartalmaz 40 és 50 közé eső számot");
                if (negyvenOtvenKozott == true) //Ha igaz(true), akkor kiírja, hogy van benne 40 és 50 lözé eső szám
                    System.out.println("A tömb tartalmaz 40 és 50 közé eső számot");
                System.out.print("\n\nSzeretnéd újra futtatni a programot?\n0-nem\n1-igen\n\nA megadott szám: ");//Megkérdezzük a felhasználót, hogy szeretné-e újrafuttatni a programot
                valasz = bemenet.nextInt();//Majd bekérjük a felhasználótól az adatot
            }
            else if (valasz == 4) //Negyedik válaszlehetőség vizsgálata, amelyben megnézzük, hogy mennyi 2-vel és 5-el osztható szám  van a tömbben
            {
                int ottelOszthatoParosDb = 0;//Létrehozzuk a szükséges változót
                for (int i = 0; i < 20; i++) {
                    if (szamok[i] % 10 == 0) {//Megviszgáljuk, hogy van-e 10-el osztható szám(azért 10-el, mivel ez a legkisebb szám, amely osztható 5-el is, és 2-vel is)
                        ottelOszthatoParosDb++;//És ha van, akkor hozzáadunk egyet a változónkhoz
                    }
                }
                System.out.println("Ennyi öttel osztahó páros szám van: " + ottelOszthatoParosDb);//Kiíratjuk, hogy mennyi 5-el és  2-vel osztható szám van
                System.out.print("\n\nSzeretnéd újra futtatni a programot?\n0-nem\n1-igen\n\nA megadott szám: ");//Megkérdezzük a felhasználót, hogy szeretné-e újrafuttatni a programot
                valasz = bemenet.nextInt();//Majd bekérjük a felhasználótól az adatot
            }
            else if (valasz == 5)//Az ötödik válaszlehetőség vizsgálata, amelyben megnézzük, hogy a felhasználó által megadott szám benne van-e a tömbben
            {
                int bekertSzam;//létrehozzuk a szükséges változókat
                int[] tombBekertSzamindex;
                int tombBekertszamIndexElemSzam = 0;
                System.out.print("\n\nAdd meg a számot: ");//Bekérjük a vizsgálandó számot
                bekertSzam = bemenet.nextInt();
                for (int i = 0; i < 20; i++) {
                    if (bekertSzam == szamok[i]) //Megvizsgáljuk, hogy van-e a szamok nevű tömbben a felhasználó által bekért számból
                        tombBekertszamIndexElemSzam++;//Ha igen, akkor a tombBekertSzamindex nevű tömb elemszámához hozzáadunk egyet
                    }
                tombBekertSzamindex = new int[tombBekertszamIndexElemSzam];//Megadjuk a tombBekertSzamindex nevű tömb deklarálása

                tombBekertszamIndexElemSzam = 0;//Majd lenullázzuk a tombBekertSzamindexElemszam nevű változót
                for (int i = 0; i < 20; i++) {
                    if (bekertSzam == szamok[i])//Majd megvizsgáljuk, hogy benne van-e a szamok nevű tömben az a szám amelyet bekértünk a felhasználótól
                        tombBekertSzamindex[tombBekertszamIndexElemSzam++] = i+1;//Ha igen, akkor a tömb első helyére beírjuk az i-t (mivel az lesz a szám indexe) majd hozzáadunk egyet, mert ugye ami a program szerint a nulladik helyen van, az igazából az első helyen van
                    }

                if (tombBekertszamIndexElemSzam == 0) //Majd megvizsgáljuk, hogy van-e olyan szám a szamok nevű tömben, amelyet a felhassználó megadott
                {
                    System.out.print("\n\nA tömb nem tartalmazza azt a számot, amelyet megadtál szeretnél megadni egy új számot?\n\n0 - nem\n1 - igen\n");//Ha igen, akkor kiíratjuk, hogy nincs ilyen szám
                    valasz = bemenet.nextInt();//Majd megkérdezzük a felhasználót, hogy szeretne-e új értéket megdani

                    do {//Ha igen, akkor ez a do while ciklus elindul, amely addig fut, ameddig a felhasználó akarja
                        System.out.print("\n\nAdd meg a számot: ");
                        bekertSzam = bemenet.nextInt();
                        for (int i = 0; i < 20; i++) {
                            if (bekertSzam == szamok[i]) 
                            tombBekertszamIndexElemSzam++;
                        }
                        tombBekertSzamindex = new int[tombBekertszamIndexElemSzam];

                        tombBekertszamIndexElemSzam = 0;
                        for (int i = 0; i < 20; i++) {
                            if (bekertSzam == szamok[i]) 
                            tombBekertSzamindex[tombBekertszamIndexElemSzam++] = i+1;
                        }
                        if (tombBekertszamIndexElemSzam == 0) {
                            System.out.print("\n\nA tömb nem tartalmazza azt a számot, amelyet megadtál szeretnél megadni egy új számot?\n\n0 - nem\n1 - igen\n");
                            valasz = bemenet.nextInt();
                        }
                        else{
                            for (int i = 0; i < tombBekertszamIndexElemSzam; i++) 
                            System.out.println("\n\nA szám indexe(i): " + tombBekertSzamindex[i]);
                            System.out.print("\n\nSzeretnél megadni egy új számot?\n\n0 - nem\n1 - igen\n");
                            valasz = bemenet.nextInt();
                        }
                    } while (valasz == 1);
                }

                else{
                    for (int i = 0; i < tombBekertszamIndexElemSzam; i++) 
                    System.out.println("\n\nA szám indexe(i): " + tombBekertSzamindex[i]);
                    System.out.print("\n\nA tömb nem tartalmazza azt a számot, amelyet megadtál szeretnél megadni egy új számot?\n\n0 - nem\n1 - igen\n");//Ha nem, akkor kiíratjuk, hogy van ilyen szám
                    valasz = bemenet.nextInt();//Majd megkérdezzük a felhasználót, hogy szeretne-e új értéket megdani
                    do {//Ha igen, akkor ez a do while ciklus elindul, amely addig fut, ameddig a felhasználó akarja
                        System.out.print("\n\nAdd meg a számot: ");
                        bekertSzam = bemenet.nextInt();
                        for (int i = 0; i < 20; i++) {
                            if (bekertSzam == szamok[i]) 
                            tombBekertszamIndexElemSzam++;
                        }
                        tombBekertSzamindex = new int[tombBekertszamIndexElemSzam];

                        tombBekertszamIndexElemSzam = 0;
                        for (int i = 0; i < 20; i++) {
                            if (bekertSzam == szamok[i]) 
                            tombBekertSzamindex[tombBekertszamIndexElemSzam++] = i+1;
                        }
                        if (tombBekertszamIndexElemSzam == 0) {
                            System.out.print("\n\nA tömb nem tartalmazza azt a számot, amelyet megadtál szeretnél megadni egy új számot?\n\n0 - nem\n1 - igen\n");
                            valasz = bemenet.nextInt();
                        }
                        else{
                            for (int i = 0; i < tombBekertszamIndexElemSzam; i++) 
                            System.out.println("\n\nA szám indexe(i): " + tombBekertSzamindex[i]);
                            System.out.print("\n\nSzeretnél megadni egy új számot?\n\n0 - nem\n1 - igen\n");
                            valasz = bemenet.nextInt();
                        }
                    } while (valasz == 1);
                }
                System.out.print("\n\nSzeretnéd újra futtatni a programot?\n0-nem\n1-igen\n\nA megadott szám: ");//Megkérdezzük a felhasználót, hogy szeretné-e újrafuttatni a programot
                valasz = bemenet.nextInt();//Majd bekérjük a felhasználótól az adatot
            }
        } while (valasz == 1);
    }
    
}

        