/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggorder;

/**
 *
 * @author 30099423
 */
public class EggOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double perDozen = 7.25;
        double each = 0.75;
        
        int eggNo = 26;
        int cartons = eggNo/12;
        int extras = eggNo%12;
        
        double total = cartons * perDozen + extras * each;
        
        System.out.printf("You ordered %d eggs.%n",eggNo);
        String explanation = "That is %d dozen eggs at $%.2f per dozen and "
                + "%d additional eggs at $%.2f for a total of $%.2f.%n";
        System.out.printf(explanation, cartons, perDozen, extras, each, total);
    }
    
}
