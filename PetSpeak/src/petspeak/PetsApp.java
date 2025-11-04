/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petspeak;

/**
 *
 * @author 30099423
 */
public class PetsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pet p;
        Toy ball = new Toy("Ball");

        
        // Assign a normal Pet object to p
        System.out.println("Pet:");
        p = new Pet("Lilly", 3, ball); 
        p.speak();

        // Assign a Dog object to p
        System.out.println("\nDog:");
        p = new Dog("Rover", 5, ball);
        p.speak();
        ((Dog)p).bark();


        // Assign a Cat object to p
        System.out.println("\nCat:");
        p = new Cat("Felix", 5, new Toy("String"));
        p.speak();
        ((Cat)p).meow();
        
        
    }
    
}
