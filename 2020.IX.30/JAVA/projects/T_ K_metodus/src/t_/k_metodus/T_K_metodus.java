
package t_.k_metodus;
import java.util.Scanner;

public class T_K_metodus {

/*Létrehozunk pár olyan változót, amely minden funkcióban látható
(Azért kell ez a válstozó, mert a while ciklust nem a main-be kell tenni, de az adatokat a main-be kell megani)*/
    public static double A;
    public static double B;
    public static double C;
    public static double M;
//A Scanner bemenetét is itt kell importálni, mert az egyik funkcióban, valamint a minben is használni fogjuk*/
    public static Scanner bemenet;


    public static void main(String[] args) 
    {
        tagolas();//behívjuk a tagolas funkciót, hogy tegyen egy sor kötőjelet a ide, hogy tagoltabb legyen a kód.
        System.out.println("\n\tHaromszog terület, kerület szamitó program");//Kiíjuk a program nevét.
        tagolas();//behívjuk a tagolas funkciót, hogy tegyen egy sor kötőjelet a ide, hogy tagoltabb legyen a kód.

        bemenet = new Scanner(System.in);//behívjuk a scanner bementetét, hogy a felhasználó által bekért adatot kezelni tudjuk
        //Bekérjük az adatokat a felhasználótól
        System.out.print("\nAdd meg az első oldal hosszát : ");
        A = bemenet.nextDouble();
        System.out.print("\nAdd meg a második oldal hosszát : ");
        B = bemenet.nextDouble();
        System.out.print("\nAdd meg a harmadik oldal hosszát : ");
        C = bemenet.nextDouble();
        System.out.print("\nAdd meg a FAKE magasságot: ");
        M = bemenet.nextDouble();


        //Kiíratjuk a háromszög kerületét.
        System.out.printf("\n\n\tKerulet: %.2f\n" , szamitKerulet(A, B, C));//
        tagolas();
        System.out.printf("\n\tTerulet (fake): %.2f\n" , szamitTerulet(A, M));
        tagolas();
        System.out.printf("\n\tTerulet (real): %.2f\n", szamitTerulet2(A, B, C));
        tagolas();
    }
    public static void tagolas(){
            System.out.println("\n--------------------------------------------------------------------------------\n");
        }    

    public static double szamitKerulet(double a, double b, double c) 
    {
        tagolas();
        int szamlalo = 0;
        while (!((A + B) > C && (A+C) > B && (B + C) > A)) {
            if (szamlalo == 3) {
                System.out.print("\n\nHáromszor rossz adatot adtál meg, ezért a program alap értékeket használva számol");
                A = 30;
                a = A;
                B = 35;
                b = B;
                C = 40;
                c = C;
                tagolas();
                break;
            }
            szamlalo++;
            System.out.println("\nRossz értéket adtál meg! Adj meg új értékeket, amelyekből háromszöget lehet készíteni!: ");

            System.out.print("\nAdd meg az első oldal hosszát : ");
            A = bemenet.nextDouble();
            a = A;
            System.out.print("\nAdd meg a másdoik oldal hosszát : ");
            B = bemenet.nextDouble();
            b = B;
            System.out.print("\nAdd meg a harmadik oldal hosszát : ");
            C = bemenet.nextDouble();
            c = C;
            tagolas();
        }
        return a + b + c; 
    }
    public static double szamitTerulet(double a, double m){
    m = M;
    return (a * m) / 2.0; 
    }
    public static double szamitTerulet2(double a, double b, double c) 
    {
    double s = (a + b + c) / 2.0; 
    return Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    }
}
