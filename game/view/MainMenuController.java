package game.view;

import javafx.fxml.FXML;
import game.MainApp;
import javafx.scene.layout.VBox;

import java.awt.*;

/**
 * Created by Rustymattok on 25.10.2015.
 */
public class MainMenuController {

    @FXML
    private VBox buttons;
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
