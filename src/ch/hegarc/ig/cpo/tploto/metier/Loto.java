package ch.hegarc.ig.cpo.tploto.metier;

import java.util.List;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Loto {

    private List<Integer> pulledNumbers;
    private List<Card> cardsList;

    public Loto() {
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
        int number = 0;
        if (cardExist(cardNumber)) {
            for (int i = 0; i < cardsList.size(); i++) {
                if (cardsList.get(i).getNumber() == cardNumber) {
                    number = i;
                }
            }
        }
        return cardsList.get(number);
    }

    public List<Integer> getPulledNumbers() {
        return pulledNumbers;
    }

    public boolean cardExist(Integer cardNumber) {
        return true;
    }
}
