
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milena
 */
public class ZbirCifara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklaracija promenljivih
        
        int broj, zbir = 0;
        Scanner input = new Scanner(System.in);
        
        // unos broja
        
        System.out.println("Unesite trocifreni broj : ");
        broj = input.nextInt();
        
        // obrada podataka
        // dodavanje poslednje cifre na zbir
        zbir  += (broj % 10);
        broj /= 10;
        
        // broj je sada dvocifren
        //dodavanje pretposlednje cifre 
        zbir  += (broj % 10);
        
        // dodavanje poslednje cifre tj.prve
        
        zbir += (broj / 10);
        
        
        // prikazivanje rezultata
        
        System.out.println("Rezulat je = " + zbir);

        
        
        
        
                
                
                
    }
    
}
