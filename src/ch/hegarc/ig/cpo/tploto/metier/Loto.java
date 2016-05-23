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

    public boolean controlerQuine(Integer cardNumber) {
        Card card = new Card();
        if (card = this.getCardByNumber(cardNumber)) {

        }
    }

    private Card getCarteByNumber(Integer numero) {
        int cardNumber = 0;
        if (carteExist(numero)) {
            for (int i = 0; i < cardsList.size(); i++) {
                if (cardsList.get(i).getNumero() == numero) {
                    cardNumber = i;
                }
            }           
        }
        return cardsList.get(cardNumber);
    }

    public List<Integer> getNombresTires() {
        return nombresTires;
    }

    public boolean carteExist(Integer numeroCarte) {
        return true;
    }

}
