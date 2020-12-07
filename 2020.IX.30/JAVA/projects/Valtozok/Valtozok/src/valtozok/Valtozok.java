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
            int sebessegFokozat;
            double sebesseg;
            char szin;
            boolean metal;


            //Programc�m kiiratása

            System.out.println("Ez egy virtulis autó");
            
            sebessegFokozat = 6;
            sebesseg = 85;
            szin = 'r';
            metal = true;

            //vátozók értékeinek kiiratisa

            System.out.println("Az autó sebességfokozata: " + sebessegFokozat);
            System.out.println("Az autó pillanatnyi sebessége: " + sebesseg + "km/h");
            System.out.println("Az autó színkódja: " + szin);
            System.out.println("Metal szin: " + metal);

            // El�gaz�s: a felt�tel mindig logikai �rt�ket kell adjon eredm�ny�l
            // Rel�ci�s m�veletek: == , != , <, <=, >, >=
            // Logikai m�veletek: && , (kett� vagy t�bb felt�tel eset�n)


            if(metal == true)
                {
                System.out.println("Metal szín: van");
                }
            else
                {
                System.out.println("Metál szín: Nincs");
                }
            
            int f = 6;
            if(f < 10 && f % 2 == 0)
                {
                System.out.println("igaz");
                }
            else
                {
                System.out.println("hamis");  
                }

            if(sebesseg <= 50)
                {
                System.out.println("Lakott terület");
                }
            else if(sebesseg <= 90)
                {
                System.out.println("közút");
                }
            else if(sebesseg <= 130)
                {
                System.out.println("autópálya");
                }
            else
                {
                System.out.println("Gyorshajtás");   
                }
                
                
                
                
                
                
    }


    
}