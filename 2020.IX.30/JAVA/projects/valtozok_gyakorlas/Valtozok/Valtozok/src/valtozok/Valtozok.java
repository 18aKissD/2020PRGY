/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valtozok;

/**
 *
 * @author user
 */
public class Valtozok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sebesseg;
        boolean metal;
        char szin;
        int sebessegfokozat;

        
        
        sebesseg = 80;
        metal = false;
        sebessegfokozat = 6;
        szin = 'r';
        
        
        System.out.println("Ez egy virtuális autó");
        System.out.println("Az aoutó sebességfokozata: " + sebessegfokozat);
        System.out.println("Az autó pillanatnyi sebessége: " + sebesseg + "Km/h");
        System.out.println("Az autó színkódja: " + szin);
        
        if(metal == true)
            {
            System.out.println("Metal szín: Van");
            }
        else
            {
            System.out.println("Metal szín: Nincs :(");
            }
        
        if(sebesseg <= 50)
            {
                System.out.println("Lakott terület");
            }
        else if(sebesseg <=90)
            {
            System.out.println("Közút");
            }
        else if(sebesseg <=130)
            {
            System.out.println("Autópálya");
            }
        else
            {
            System.out.println("Gyorshajtás");
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
    }
    
}
