package ch.hegarc.ig.cpo.tploto.metier;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Carte {
    
    private Integer numero;
    private Integer[][] contenu;

    public Carte() {
    }

    public Integer getNumero() {
        return numero;
    }
    
    protected boolean checkLignes(){
        return true;
    }
    
    
    
}
