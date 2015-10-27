package game.view;

import game.moduls.Player;
import javafx.fxml.FXML;
import game.MainApp;
import game.moduls.Card;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Rustymattok on 25.10.2015.
 */
public class GameMenuController {

    public TextField textmy;
    @FXML
    private Button reset;
    @FXML
    private Button back;
    @FXML
    private Button take;
    @FXML
    private Button let;

    @FXML
    public void pushBackButton() {

        MainApp.showMenuWindow();
    }
    @FXML
    public void pushTakeOne() throws IOException {
        MainApp.showTakeCardButton();
//        System.out.println(MainApp.getList().get(0).getPicture().getNumber());
//        System.out.println(MainApp.showList(MainApp.getList()));
//        System.out.println(MainApp.showList(MainApp.getListplayer()));
    }
    @FXML
    public void pushLets() throws IOException {
        MainApp.setCardsAll();
        textmy.setVisible(true);
        textmy.setText(MainApp.result(""));
        back.setVisible(false);
        take.setVisible(false);
        let.setVisible(false);
        reset.setVisible(true);
    }
    @FXML
    public void setReset() {
        MainApp.showMenuWindow();
    }
}
