package ch.hegarc.ig.cpo.tploto.metier;

import java.util.List;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Card {

    private Integer number;
    private Integer[][] contents;
    private Loto loto;

    public Card() {
        loto = new Loto();
    }

    public Integer getNumber() {
        return number;
    }

    protected boolean checkLines() {
        int count = 0;
        boolean lineQuine = false;
        int line = 0;
        List<Integer> listNumbers = loto.getPulledNumbers();

        do {
            for (int j = 0; j < 5; j++) {
                
                for (Integer nb = 0; nb < listNumbers.size(); nb++){
                   // TESTER SI IF nb = contents[line][j];
                }
                

                if (count == 5) {
                    lineQuine = true;
                }
            }
            line = line++;
            count = 0;
        } while (line < 3 && !lineQuine);

        return lineQuine;
    }

}
