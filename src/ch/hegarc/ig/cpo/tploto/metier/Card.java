package ch.hegarc.ig.cpo.tploto.metier;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Card {
    
    private Integer numero;
    private Integer[][] contenu;

    public Card() {
    }

    public Integer getNumero() {
        return numero;
    }
    
    protected boolean checkLignes(){
        return true;
    }
    
    
    
}
