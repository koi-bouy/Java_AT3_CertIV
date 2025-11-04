/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petspeak;

/**
 *
 * @author 30099423
 */
public class Toy {
    public final int ID;
    public final String NAME;
    private static int nextID = 1;

    public Toy(String name){
        ID = nextID++;
        NAME = name;
    }
}