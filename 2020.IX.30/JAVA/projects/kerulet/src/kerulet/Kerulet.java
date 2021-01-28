
package kerulet;
import java.util.Scanner;
public class Kerulet {
    
    public static double A;
    public static double B;
    public static double C;
    
    public static Scanner bemenet;

    public static void main(String[] args) {
    bemenet = new Scanner(System.in);
    
    int valasz;
    
    
    do { 
        System.out.print("\n\tMENU\n\n1-téglalap 2-kör 3-háromszög 4-szabályos ötszög 5-szabályos hatszög\n\nVálassz a menüpontok közül: ");
        valasz = bemenet.nextInt();
        
        while (!(valasz >= 1 && valasz <= 5)) {            
            System.out.print("\n\nRossz értéket adtál meg! \n\tMENU\n\n1-téglalap 2-kör 3-háromszög 4-szabályos ötszög 5-szabályos hatszög\n\nVálassz a menüpontok közül: ");
        valasz = bemenet.nextInt();
        }
        
        switch(valasz){
            case 1:
                System.out.print("\n\nAdd meg a téglalap A oldalának értékét: ");
                A = bemenet.nextInt();
                System.out.print("\nAdd meg a téglalap B oldalának értékét: ");
                B = bemenet.nextInt();
                System.out.print("\nA téglalap kerülete: " + teglalapK(A, B));
                break;
            case 2:
                System.out.print("\n\nAdd meg a kör sugarának értékét: ");
                A = bemenet.nextInt();
                System.out.print("\nA kör kerülete: " + korK(A));
                break;
            case 3:
                System.out.print("\n\nAdd meg a háromszög A oldalának értékét: ");
                A = bemenet.nextInt();
                System.out.print("\nAdd meg a háromszög B oldalának értékét: ");
                B = bemenet.nextInt();
                System.out.print("\nAdd meg a háromszög C oldalának értékét: ");
                C = bemenet.nextInt();
                System.out.print("\nA háromszög kerülete: " + haromszogK(A, B, C));
                break;
            case 4:
                System.out.print("\n\nAdd meg a szabályos ötszög A oldalának értékét: ");
                A = bemenet.nextInt();
                System.out.print("\nA szabályos ötszög kerülete: " + otszogK(A));
                break;
            case 5:
                System.out.print("\n\nAdd meg a szabályos hatszög A oldalának értékét: ");
                A = bemenet.nextInt();
                System.out.print("\nA szabályos hatszög kerülete: " + hatszogK(A));
                break;
        }
        System.out.print("\nAkarod-e újrafuttatni a programot?: 0-nem 1-igen ");
        valasz = bemenet.nextInt();
        } while (valasz == 1);
    }
    public static double teglalapK (double a, double b) {
        A = a;
        B = b;
        return (a + b) * 2;
    }
    
    
    public static double korK (double r) {
        A = r;
        return 2 * r * Math.PI;
    }
    
   
    public static double haromszogK (double a, double b, double c) {
        A = a;
        B = b;
        C = c;
        return a + b + c;
    }
    
    
    public static double otszogK (double a) {
        A = a;
        return 5 * a;
    }
    
    
    public static double hatszogK (double a) {
        A = a;
        return 6 * a;
    }

        
        
        
        
    }
    

