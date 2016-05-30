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
        Loto game = Loto.newInstance();
        game.newGame();
        
        for (int ind = 1; ind <= 5; ind++) {
            view.showMessage("Carte N° " + ind + ": ");
            view.showMessage("---------");
            view.showCard(game.getCardByNumber(ind));
            view.showMessage("_________________");
        }
        
        Integer number;
        do {
            number = view.insertNumber();
            if (number == 99) {
                if (game.controlQuine(view.cardNumber())) {
                    view.showMessage("Quine OK!");
                    game.stopGame();
                } else {
                    view.showMessage("La quine n'est pas correcte! Le game continue...");
                }
            } else if (!game.getPulledNumbers().add(number)) {
                view.showMessage("Erreur: vous avez saisi deux fois le même chiffre.");
            }
            
        } while (game.gameOnRun());
        
    }
    
    public static void main(String[] args) {
        new LotoApp().run();
    }
    
}
