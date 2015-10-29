package game.moduls;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 * Created by makarov_vv on 21.10.2015.
 */
public class Picture  {
    private Integer number;
    private ImageView imageView;
    private int value;

    public Picture() {
        Image image = new Image(getClass().getResourceAsStream("cards2.png"));
        imageView = new ImageView(image);
        imageView.setViewport(new Rectangle2D(47 * 2*2, 268*2, 44*2, 67*2));
    }
    //todo подумать над более простой инициацией карт.
    public Picture(int number) {
        Image image = new Image(getClass().getResourceAsStream("cards2.png"));
        switch (number) {
            case 1:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(0, 0, 46*2, 67*2));
                value = 11;
                break;
            case 2:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(0,67*2, 46*2, 67*2));
                value = 11;
                break;
            case 3:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(0,134*2, 46*2, 67*2));
                value = 11;
                break;
            case 4:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(0,201*2, 46*2, 67*2));
                value = 11;
                break;
            case 5:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*5*2,0,47*2, 67*2));
                value = 6;
                break;
            case 6:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*5*2,67*2,47*2, 67*2));
                value = 6;
                break;
            case 7:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*5*2,134*2,47*2, 67*2));
                value = 6;
                break;
            case 8:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*5*2,201*2,47*2, 67*2));
                value = 6;
                break;
            case 9:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*6*2,0,47*2, 67*2));
                value = 7;
                break;
            case 10:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*6*2,67*2,47*2, 67*2));
                value = 7;
                break;
            case 11:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*6*2,134*2,47*2, 67*2));
                value = 7;
                break;
            case 12:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*6*2,201*2,47*2, 67*2));
                value = 7;
                break;
            case 13:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*7*2,0,47*2, 67*2));
                value = 8;
                break;
            case 14:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*7*2,67*2,47*2, 67*2));
                value = 8;
                break;
            case 15:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*7*2,134*2,47*2, 67*2));
                value = 8;
                break;
            case 16:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*7*2,201*2,47*2, 67*2));
                value = 8;
                break;
            case 17:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*8*2,0,47*2, 67*2));
                value = 9;
                break;
            case 18:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*8*2,67*2,47*2, 67*2));
                value = 9;
                break;
            case 19:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*8*2,134*2,47*2, 67*2));
                value = 9;
                break;
            case 20:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*8*2,201*2,47*2, 67*2));
                value = 9;
                break;
            case 21:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*9*2,0,47*2, 67*2));
                value = 10;
                break;
            case 22:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*9*2,67*2,47*2, 67*2));
                value = 10;
                break;
            case 23:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*9*2,134*2,47*2, 67*2));
                value = 10;
                break;
            case 24:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*9*2,201*2,47*2, 67*2));
                value = 10;
                break;
            case 25:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*10*2,0,47*2, 67*2));
                value = 2;
                break;
            case 26:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*10*2,67*2,47*2, 67*2));
                value = 2;
                break;
            case 27:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*10*2,134*2,47*2, 67*2));
                value = 2;
                break;
            case 28:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*10*2,201*2,47*2, 67*2));
                value = 2;
                break;
            case 29:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*11*2,0,47*2, 67*2));
                value = 3;
                break;
            case 30:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*11*2,67*2,47*2, 67*2));
                value = 3;
                break;
            case 31:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*11*2,134*2,47*2, 67*2));
                value = 3;
                break;
            case 32:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*11*2,201*2,47*2, 67*2));
                value = 3;
                break;
            case 33:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*12*2,0,47*2, 67*2));
                value = 4;
                break;
            case 34:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*12*2,67*2,47*2, 67*2));
                value = 4;
                break;
            case 35:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*12*2,134*2,47*2, 67*2));
                value = 4;
                break;
            case 36:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*12*2,201*2,47*2, 67*2));
                value = 4;
                break;
        }
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    public Integer getNumber() {
        return number;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public int getValue() {
        return value;
    }
}