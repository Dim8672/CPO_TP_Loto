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
        
    }
    
    public static void main(String[] args) {
        new LotoApp().run();
    }
    //HELLO DARIO
    //HELLO DYLAN
    //Hello SEB
}
