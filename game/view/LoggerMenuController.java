package game.view;

import game.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

/**
 * Created by makarov_vv on 26.10.2015.
 */
public class LoggerMenuController {
    @FXML
    private Label text;
    @FXML
    public void pushOk() {
        MainApp.getStage().close();
        MainApp.showMenuWindow();
    }
    @FXML
    public void resultText() {
        text.setText("ffffff");
    }
}
