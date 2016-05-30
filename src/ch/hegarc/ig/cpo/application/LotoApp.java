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
    
    public void run() {
        Console view = new Console();
        Loto jeu = Loto.newInstance();
        jeu.newGame();
        
        for (int ind = 1; ind <= 5; ind++) {
            view.showMessage("Carte N° " + ind + ": ");
            view.showMessage("---------");
            view.showCard(jeu.getCardByNumber(ind));
            view.showMessage("_________________");
        }
        
        Integer number;
        do {
            number = view.insertNumber();
            if (number == 99) {
                if (jeu.controlQuine(view.cardNumber())) {
                    view.showMessage("Quine OK!");
                    jeu.stopGame();
                } else {
                    view.showMessage("La quine n'est pas correcte! Le jeu continue...");
                }
            } else if (!jeu.getPulledNumbers().add(number)) {
                view.showMessage("Erreur: vous avez saisi deux fois le même chiffre.");
            }
            
        } while (jeu.gameOnRun());
        
    }
    
    public static void main(String[] args) {
        new LotoApp().run();
    }
    
}
