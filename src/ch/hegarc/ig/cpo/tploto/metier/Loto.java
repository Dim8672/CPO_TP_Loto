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
    
    public boolean ControlerQuine(Integer cardNumber){
        Card card = new Card();
        if (card = this.getCardByNumber(cardNumber)) {
            
        }
    }
    
//    private Carte getCarteByNumber(Integer numero){
//        
//    }

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
    
    
}
