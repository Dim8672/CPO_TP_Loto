package ch.hegarc.ig.cpo.tploto.metier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Loto {

    private Set<Integer> pulledNumbers;
    private List<Card> cardsList;
    private Boolean isGaming;

    public Loto() {
    }
    
    public void newGame(){
       pulledNumbers = new HashSet<Integer>();
       cardsList = new ArrayList();
       isGaming = true;
    }
    
    public void stopGame(){
        isGaming = false;
    }
    
    public boolean gameOnRun(){
        return isGaming;
    }

    public boolean controlQuine(Integer cardNumber) {
        Card card = new Card();
        boolean quine = false;

        if (cardExist(cardNumber)) {
            card = getCardByNumber(cardNumber);
            quine = card.checkLines();

        }

        return quine;
    }

    private Card getCardByNumber(Integer cardNumber) {
        if (cardExist(cardNumber)) {
            for (int i = 0; i < cardsList.size(); i++) {
                if (cardsList.get(i).getNumber() == cardNumber) {
                    return cardsList.get(i);
                }
            }
        }
        return null;
    }

    public Set<Integer> getPulledNumbers() {
        return pulledNumbers;
    }

    private boolean cardExist(Integer cardNumber) {
        for (int i=0;i<cardsList.size();i++){
            if(cardsList.get(i).getNumber()== cardNumber){
                return true;
            }
        }
        return false;
    }
}
