package v.makarov.game.view;

import javafx.fxml.FXML;
import v.makarov.game.MainApp;
import v.makarov.game.moduls.Card;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Rustymattok on 25.10.2015.
 */
public class gameMenuController {

    @FXML
    public void pushBackButton() {

        MainApp.showMenuWindow();
    }
    @FXML
    public void pushTakeOne() throws IOException {
        MainApp.showTakeCardButton();
        System.out.println(MainApp.getList().get(0).getPicture().getNumber());
        System.out.println(MainApp.showList(MainApp.getList()));
        System.out.println(MainApp.showList(MainApp.getListplayer()));

    }
}
