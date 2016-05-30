package ch.hegarc.ig.cpo.tploto.metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    public void setNumber(Integer value){
        this.number = value;
    }
    
    public Integer[][] getContents(){
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
                do {
                    if (listNumbers.get(nb) == contents[line][j]) {
                        count = count++;
                    }
                    nb = nb++;
                } while (nb < listNumbers.size()
                        && listNumbers.get(nb - 1) != contents[line][j]);
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
