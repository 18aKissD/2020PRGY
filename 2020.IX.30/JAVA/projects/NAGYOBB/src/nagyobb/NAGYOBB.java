
package nagyobb;

import java.util.Scanner;

public class NAGYOBB {
        static int melyikANagyobb(int szam1, int szam2){
        if (szam1 > szam2) 
            return szam1;
        else if (szam1 < szam2) 
            return szam2;
        else
            return 0;
    }  

    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        
        int valasz;
        
        do {            
            System.out.print("\nAdd meg az első szám értékét, majd a második szám értékét:  ");
            //melyikANagyobb(bemenet.nextInt(), bemenet.nextInt());
            
            System.out.print("\n\n" + melyikANagyobb(bemenet.nextInt(), bemenet.nextInt()));
            System.out.print("\n\nSzeretnéd-e újrafuttatni a programot?(0-nem 1-igen) ");
            valasz = bemenet.nextInt();
        } while (valasz == 1);

    }

}
