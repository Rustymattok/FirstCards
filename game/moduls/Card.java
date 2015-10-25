package v.makarov.game.moduls;

import javafx.scene.layout.Pane;

public class Card extends Pane {
    private Card card;
    private Picture picture;

    public Card() {

    }

    public Card (Picture picture, int number) {
       this.picture = picture;
        picture.setNumber(number);
        getChildren().add(picture.getImageView());
        System.out.println(picture.getNumber());
    }
    public Picture getPicture() {
        return picture;
    }
    public void setCard(Card card) {
        this.card = card;
    }
}
