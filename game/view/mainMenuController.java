package v.makarov.game.view;

import javafx.fxml.FXML;
import v.makarov.game.MainApp;

import java.awt.*;

/**
 * Created by Rustymattok on 25.10.2015.
 */
public class mainMenuController {

    @FXML
    private Button playBt;
    @FXML
    private Button exitBt;
    @FXML
    public void pushPlayButtom()throws Exception{
        MainApp.showPlayWindow();
    }
    @FXML
    public void pushExitButton() {
        MainApp.showExitWindow();
    }
}
