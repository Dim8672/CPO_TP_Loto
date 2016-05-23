package ch.hegarc.ig.cpo.tploto.metier;

/**
 *
 * Auteur : Dario, Dimitri, Dylan, Sébastien
 */
public class Card {

    private Integer number;
    private Integer[][] contents;

    public Card() {
    }

    public Integer getNumber() {
        return number;
    }

    protected boolean checkLines() {
        int count = 0;
        boolean lineQuine = false;
        int line = 0;

        do {
            for (int j = 0; j < 5; j++) {
                //mettre le traitement
                if (count == 5) {
                    lineQuine = true;
                }
            }
            line = line++;
            count = 0;
        } while (line < 3 && lineQuine == false);

        return lineQuine;
    }

}
