/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas.ciklus.scanner;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class GyakorlasCiklusScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 Scanner bemenet = new Scanner (System.in); 
    
        System.out.println("Adj meg egy számot 100 és -100 között(egész értéket adj meg! A program nem fog műkörni tizedes törttel)");
        
        int a;
        int b;
        
        a = 50;
        b = bemenet.nextInt();
        
        while (!(b <= 100 && b >= -100)) {System.out.println("Helytelen szám! Adj meg egy számost 100 és -100 között");            
          b = bemenet.nextInt();
        }
           
        bemenet.close();
        
        if(b < a)
        {
            System.out.println(a + " nagyobb mint " + b);
        }
        else if(a < b)
        {
            System.out.println(b + " nagyobb mint " + a);
        }
        
        
        
        for (int i = 0; i < 5; i++) {System.out.println("Hurrá péntek!");
            
        }
    
    
 
    
    }
    
}
