package ch.hegarc.ig.cpo.presentation;

import ch.hegarc.ig.cpo.tploto.metier.Card;
import java.util.Scanner;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Console {

    public Console() {
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public Integer insertNumber() {
        System.out.println("Chiffre tiré :");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public Integer cardNumber() {
        System.out.println("Numéro de la carte :");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void showCard(Card card) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(card.getContents()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
