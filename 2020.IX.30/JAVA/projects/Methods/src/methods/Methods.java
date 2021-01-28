
package methods;
import java.util.Scanner;


public class Methods {
    
    public static void tagolas(){
        System.out.println("\n--------------------------------------------------------------------------------\n");
    }
    
    public static void korMinosites(int eletKor){
        
        if (eletKor < 18) 
            System.out.println("Kiskorú");
        else if (eletKor < 65) 
            System.out.println("Felnőttkorú");
        else
            System.out.println("Nyugdíjaskorú");
    }
    
    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        
        int valasz;
        tagolas();
        System.out.println("Metódusok");
        tagolas();
        do {            
        System.out.print("\n\nAdd meg az életkorod, vagy más életkorát: ");
        korMinosites(bemenet.nextInt());
        System.out.print("\n\nSzeretnél új adatot megadni?(0-nem 1-igen) ");
        valasz = bemenet.nextInt();
        } while (valasz == 1);
        
    }
    
}
