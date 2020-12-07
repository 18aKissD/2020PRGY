/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package valtozok;

/**
 *
 * @author 18a_kissd
 */
public class Valtozok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //V�ltoz�k deklar�l�sa//
            
            int sebessegFokozat;
            double sebesseg;
            char szin;
            boolean metal


            //Programc�m kiirat�sa

            System.out.println("Ez egy virtu�lis aut�")
            
            
            sebessegFokozat = 6;
            sebesseg = 95.5;
            szin = 'r';
            metal = false;

            //v�toz�k �rt�keinek kiirat�sa

            system.out.println("Az aut� sebess�gfokozata: " + sebessegFokozat);
            system.out.println("Az aut� pillanatnyi sebess�ge: " + sebesseg + "km/h");
            system.out.println("Az aut� sz�nk�dja: " + szin);
            system.out.println("Metal szin: " + metal);

            // El�gaz�s: a felt�tel mindig logikai �rt�ket kell adjon eredm�ny�l
            // Rel�ci�s m�veletek: == , != , <, <=, >, >=
            // Logikai m�veletek: && , (kett� vagy t�bb felt�tel eset�n)


            if(metal == true)
                system.out.println("Metal sz�n: van");
            else
                system.out.println("Met�l sz�n: Nincs");

            int f = 6;
            if(f < 10 && f % 2 == 0)
                system.out.println("igaz");
            else
                system.out.println("hamis");  








 }

}
