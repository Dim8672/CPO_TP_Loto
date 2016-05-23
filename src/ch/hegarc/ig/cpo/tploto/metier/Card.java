package ch.hegarc.ig.cpo.tploto.metier;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Card {
    
    private Integer number;
    private Integer[][] contents;

    public Card() {
    }

    public Integer getNumber() {
        return number;
    }
    
    protected boolean checkLines(){
        return true;
    }
    
    
    
}
