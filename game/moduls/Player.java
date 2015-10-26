package game.moduls;

import java.util.ArrayList;

/**
 * Created by makarov_vv on 26.10.2015.
 */
public class Player {
     private int result;
     private ArrayList<Card> card;


    public Player(ArrayList<Card> card,int result) {
        this.card = card;
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public ArrayList<Card> getCard() {
        return card;
    }

    public void setResult(int num) {
         result = num;
    }

    public void setCard(ArrayList<Card> card) {
        this.card = card;
    }
}
