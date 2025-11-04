/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petspeak;

/**
 *
 * @author 30099423
 */
public class Pet {
    public final int ID;
    private static int nextID = 1;

    public final String name;
    private int age;
    private Toy favToy;

    public Pet(String name, int age, Toy favToy){
        ID = nextID ++;
        this.name = name;
        this.age = age;
        this.favToy = favToy;
    }
    
    public void speak(){
        System.out.println("Pet speaks");
    }
    
}
