
package daysoftheweekswitch;
import java.util.Scanner;//Importáljuk a Scannert, ami ahhoz kell, hogy be tudjuk kérni az adatot a felhasználótól
public class DaysOfTheWeekSwitch {

    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);//Scanner bemenet elkészítése az adatbekérésre
        int valasz;//Válasz nevű változó létrehozása, a válsz kezelésére
        
        System.out.print("\nAdj meg egy számot egy és hét között: ");//Kiiratjuk a felhasználónak, hogy adjon meg egy számot 1 és 7 között.A /n azért kell a sor elejére, hogy biztosak legyünk benne, hogy új sorba kezdi a szöveget kiírni
        valasz = bemenet.nextInt();//Bekérjük az adatot a felhasználótól
        
        while (!(valasz >= 1 && valasz <= 7)) //while ciklus használunk a rossz válasz kiszűrésére (Ha a válasz nem 1 és 7 közé esik, akkor visszadobja a felhasználónak, és újraindul a bekérés)
        {
            System.out.print("\nRossz számot adtál meg! Adj meg egy számot EGY és HÉT között: ");
            valasz = bemenet.nextInt();
        }
        
        switch(valasz){//Switch használata: zárójelbe krül a vizsgált változó
            case 1://Ebben az esetben, ha egyel egyenlő a válasz változó, akkor kiírja a programunk, hogy Hétfő, mivel egyest írtunk a case után
                System.out.println("\nHétfő");
                break;//A break parancsal kilépünk a ciklusból, magyarul, ha egyel volt egyenlő a valasz nevű változó, akkor nem vizsgálja meg a többi értéket, ezzel gyorsítva a programunkat
            case 2://Ebben az esetben, ha kettővel egyenlő a válasz változó, akkor kiírja a programunk, hogy Kedd, mivel egyest írtunk a case után
                System.out.println("\nKedd");
                break;
            case 3://Ebben az esetben, ha hárommal egyenlő a válasz változó, akkor kiírja a programunk, hogy Szerda, mivel egyest írtunk a case után
                System.out.println("\nSzerda");
                break;
            case 4://Ebben az esetben, ha néggyel egyenlő a válasz változó, akkor kiírja a programunk, hogy Csütörtök, mivel egyest írtunk a case után
                System.out.println("\nCsütörtök");
                break;
            case 5://Ebben az esetben, ha öttel egyenlő a válasz változó, akkor kiírja a programunk, hogy Péntek, mivel egyest írtunk a case után
                System.out.println("\nPéntek");
                break;
            case 6://Ebben az esetben, ha hattal egyenlő a válasz változó, akkor kiírja a programunk, hogy Szombat, mivel egyest írtunk a case után
                System.out.println("\nSzombat");
                break;
            case 7://Ebben az esetben, ha héttel egyenlő a válasz változó, akkor kiírja a programunk, hogy Vasárnap, mivel egyest írtunk a case után
                System.out.println("\nVasárnap");
                break;
        }
    }
    
}
