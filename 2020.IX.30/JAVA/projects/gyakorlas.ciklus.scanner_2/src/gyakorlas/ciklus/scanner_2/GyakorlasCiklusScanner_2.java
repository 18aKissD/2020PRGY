/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas.ciklus.scanner_2;
/**
 *
 * @author user
 */
import java.util.Scanner;
public class GyakorlasCiklusScanner_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        // TODO code application logic here
    
        int a;
        int b;
        
        a = 50;
        
    Scanner bemenet = new Scanner(System.in);
        System.out.println("Adj meg egy 100 és -100 közötti egész számot");
    b = bemenet.nextInt();
    
        while (!(b >= -100 && b <= 100)) {System.out.println("Helytelen érték. Adj meg egy értéket, amely a 100 és -100-as intervallumba esik");            
        b = bemenet.nextInt();
        }
    
    
    bemenet.close();
    
        if(b > a)
        {
            System.out.println("A(z) " + b + " a nagyobb");
        }
        else if(b < a)
        {
            System.out.println("A(z) " + a + " a nagyobb");
        }
        else
        {
            System.out.println("A két szám egyenlő");
        }
    
    
        for (int i = 0; i < 5; i++) {System.out.println("Hurrá hétfő :(");
            
        }
    
    
    }
    
}
