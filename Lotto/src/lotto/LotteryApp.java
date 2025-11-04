/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lotto;

/**
 *
 * @author 30099423
 */
public class LotteryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lotto lot1 = new Lotto();
        Lotto lot2 = new Lotto("Lottery West");

        int[] ticket = {6, 1, 5, 2, 4, 3};

        String playResults = lot1.playLotto(ticket);
        playResults += lot2.playLotto(ticket);
        System.out.println(playResults);

    }

}
