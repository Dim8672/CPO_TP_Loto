package ch.hegarc.ig.cpo.tploto.metier;

import java.util.List;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Loto {
    private List<Integer> nombresTires;
    private List<Card> cardsList; 

    public Loto() {
    }
    
    public boolean ControlQuine(Integer cardNumber){
        Card card = new Card();
        boolean quine = false;
        
        if (CardExist(cardNumber)) {
            card = getCardByNumber(cardNumber);
            quine = card.checkLignes();
        }
        
        return quine;
    }

    public List<Integer> getNombresTires() {
        return nombresTires;
    }
    
    public boolean CardExist(Integer  cardNumber){
        
        for (int i=0;i<cardsList.size();i++){
            if(cardsList.get(i).getNumero() == cardNumber){
                return true;
            }
        }
        return false;
    }
    
    public Card getCardByNumber(Integer cardNumber) {
        return null;
    }
    
    
}
