package ch.hegarc.ig.cpo.presentation;

import java.util.Scanner;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Console {

    public Console() {
    }
    
    public void AfficheMessage(String message){
        System.out.println(message);
    }
    
    public Integer insertNumber(){
        System.out.println("Chiffre tiré :");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public Integer cardNumber(){
        System.out.println("Numéro de la carte :");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
