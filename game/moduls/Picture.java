package game.moduls;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



/**
 * Created by makarov_vv on 21.10.2015.
 */
public class Picture  {
    private Integer number;
    private ImageView imageView;
    private int offsetX;
    private int offsetY;
    private int width;
    private int height;
    private int value;

    public Picture() {
        Image image = new Image(getClass().getResourceAsStream("cards.png"));
        imageView = new ImageView(image);
        imageView.setViewport(new Rectangle2D(47 * 2, 268, 44, 67));
    }
    public Picture(int number) {
        Image image = new Image(getClass().getResourceAsStream("cards.png"));
        switch (number) {
            case 1:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(0, 0, 46, 67));
                value = 11;
                break;
            case 2:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(0,67, 46, 67));
                value = 11;
                break;
            case 3:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(0,134, 46, 67));
                value = 11;
                break;
            case 4:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(0,201, 46, 67));
                value = 11;
                break;
            case 5:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*5,0,47, 67));
                value = 6;
                break;
            case 6:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*5,67,47, 67));
                value = 6;
                break;
            case 7:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*5,134,47, 67));
                value = 6;
                break;
            case 8:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*5,201,47, 67));
                value = 6;
                break;
            case 9:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*6,0,47, 67));
                value = 7;
                break;
            case 10:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*6,67,47, 67));
                value = 7;
                break;
            case 11:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*6,134,47, 67));
                value = 7;
                break;
            case 12:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*6,201,47, 67));
                value = 7;
                break;
            case 13:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*7,0,47, 67));
                value = 8;
                break;
            case 14:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*7,67,47, 67));
                value = 8;
                break;
            case 15:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*7,134,47, 67));
                value = 8;
                break;
            case 16:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*7,201,47, 67));
                value = 8;
                break;
            case 17:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*8,0,47, 67));
                value = 9;
                break;
            case 18:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*8,67,47, 67));
                value = 9;
                break;
            case 19:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*8,134,47, 67));
                value = 9;
                break;
            case 20:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*8,201,47, 67));
                value = 9;
                break;
            case 21:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*9,0,47, 67));
                value = 10;
                break;
            case 22:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*9,67,47, 67));
                value = 10;
                break;
            case 23:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*9,134,47, 67));
                value = 10;
                break;
            case 24:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*9,201,47, 67));
                value = 10;
                break;
            case 25:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*10,0,47, 67));
                value = 2;
                break;
            case 26:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*10,67,47, 67));
                value = 2;
                break;
            case 27:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*10,134,47, 67));
                value = 2;
                break;
            case 28:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*10,201,47, 67));
                value = 2;
                break;
            case 29:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*11,0,47, 67));
                value = 3;
                break;
            case 30:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*11,67,47, 67));
                value = 3;
                break;
            case 31:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*11,134,47, 67));
                value = 3;
                break;
            case 32:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*11,201,47, 67));
                value = 3;
                break;
            case 33:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*12,0,47, 67));
                value = 4;
                break;
            case 34:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*12,67,47, 67));
                value = 4;
                break;
            case 35:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*12,134,47, 67));
                value = 4;
                break;
            case 36:
                imageView = new ImageView(image);
                imageView.setViewport(new Rectangle2D(46*12,201,47, 67));
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