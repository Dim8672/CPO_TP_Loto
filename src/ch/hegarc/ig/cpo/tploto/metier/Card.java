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
public class Card {

    private Integer number;
    private Integer[][] contents = new Integer[3][5];
    private Loto loto;

    public Card(Integer value) {
        loto = Loto.newInstance();
        this.number = value;
        this.populateCard();
    }

    private void populateCard() {
        Random r = new Random();
        Set<Integer> cardNumbers = new HashSet<>();
        List<Integer> cardNumbers2 = new ArrayList();
        do {
            cardNumbers.add(r.nextInt(91 - 1) + 1);
        } while (cardNumbers.size() < 15);
        int ind = 0;
        cardNumbers2.addAll(cardNumbers);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                contents[i][j] = cardNumbers2.get(ind);
                ind++;
            }
        }
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer value) {
        this.number = value;
    }

    public Integer[][] getContents() {
        return contents;
    }

    protected boolean checkLines() {
        int count = 0;
        boolean lineQuine = false;
        int line = 0;
        List<Integer> listNumbers = new ArrayList();
        listNumbers.addAll(loto.getPulledNumbers());
        Integer nb;

        do {
            for (int j = 0; j < 5; j++) {
                nb = 0;
                while (nb < listNumbers.size()) {
                    if (listNumbers.get(nb) == contents[line][j]) {
                        count++;
                    }
                    nb++;
                }
            }
            if (count == 5) {
                lineQuine = true;
            }
            line++;
            count = 0;
        } while (line < 3 && !lineQuine);
        return lineQuine;
    }

}
