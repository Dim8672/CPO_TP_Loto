package ch.hegarc.ig.cpo.tploto.metier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Loto {

    private Set<Integer> pulledNumbers;
    private List<Card> cardsList;
    private Boolean isGaming;

    private static Loto instance;

    private Loto() {

    }

    public static synchronized Loto newInstance() {
        if (instance == null) {
            instance = new Loto();
        }
        return instance;
    }

    public void newGame() {
        pulledNumbers = new HashSet<Integer>();
        cardsList = new ArrayList();
        this.populateCards();
        isGaming = true;
    }

    public void stopGame() {
        isGaming = false;
    }

    public boolean gameOnRun() {
        return isGaming;
    }

    private void populateCards() {
        for (int i = 1; i <= 5; i++) {
            Card card = new Card(i);
            cardsList.add(card);
        }
    }

    public boolean controlQuine(Integer cardNumber) {
        Card card;
        boolean quine = false;

        if (cardExist(cardNumber)) {
            card = getCardByNumber(cardNumber);
            quine = card.checkLines();
        }

        return quine;
    }

    public Card getCardByNumber(Integer cardNumber) {
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
        for (int i = 0; i < cardsList.size(); i++) {
            if (cardsList.get(i).getNumber() == cardNumber) {
                return true;
            }
        }
        return false;
    }
}
