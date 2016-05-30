package ch.hegarc.ig.cpo.application;

import ch.hegarc.ig.cpo.presentation.Console;
import ch.hegarc.ig.cpo.tploto.metier.Loto;



/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class LotoApp {

    private LotoApp() {
    }
    
    public void run(){
        Console vue = new Console();
        Loto jeu = new Loto();
        jeu.newGame();
        Integer number;
        do {
            number = vue.insertNumber();
            if(number == 99){
                if (jeu.controlQuine(vue.cardNumber())) {
                    jeu.stopGame();
                }
            } else {
                jeu.getPulledNumbers().add(number);
            }
            
        } while(jeu.gameOnRun());
        
    }
    
    public static void main(String[] args) {
        new LotoApp().run();
    }

}
