package v.makarov.game;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import v.makarov.game.moduls.Card;
import v.makarov.game.moduls.CardPlayer;
import v.makarov.game.moduls.Picture;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Rustymattok on 25.10.2015.
 */
public class MainApp extends Application {

    private static Stage primarystage;
    private static BorderPane rootpane;
    private static Card card;
    private static Card cardPlayer;
    private static ArrayList<Card> listFor = new ArrayList<>();
    private static ArrayList<Card> list = new ArrayList<>();
    private static ArrayList<Card> listplayer = new ArrayList<>();
    static int num = 0;
    private static int result = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primarystage = primaryStage;
        showMainMenu();

    }
    public void showMainMenu() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/mainMenu.fxml"));
            rootpane = loader.load();
            Scene scene = new Scene(rootpane);
            primarystage.setTitle("Game");
            primarystage.setScene(scene);
            primarystage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void showPlayWindow() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/gameMenu.fxml"));
            Pane pane = loader.load();
            rootpane.setCenter(pane);
            for (int i = 0; i < 36 ; i++) {
                card = new Card(new Picture(),i+1);
                card.getPicture().getImageView().setTranslateX(i*10);
                list.add(card);
                rootpane.getChildren().addAll(card);
            }
            System.out.println(list.get(1).getPicture().getNumber());
            Collections.shuffle(list);
            System.out.println(list.get(1).getPicture().getNumber());
            System.out.println(showList(list));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void showExitWindow() {

        System.exit(0);
    }
    public static void showMenuWindow() {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/mainMenu.fxml"));
            rootpane = loader.load();
            list.removeAll(list);
            listplayer.removeAll(listplayer);
            num = 0;
            Scene scene = new Scene(rootpane);
            primarystage.setScene(scene);
            primarystage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void showTakeCardButton() throws IOException {

        cardPlayer = new Card(new Picture(list.get(list.size()-1).getPicture().getNumber()),list.get(list.size()-1).getPicture().getNumber());
        listplayer.add(cardPlayer);
        result = listplayer.get(listplayer.size()-1).getPicture().getValue()+result;
        System.out.println(" my count = " + result);
        rootpane.getChildren().remove(list.get(list.size() - 1));
        list.remove(list.size() - 1);
        listplayer.get(listplayer.size()-1).getPicture().getImageView().setTranslateX(num * 20);
        num++;
        Pane pane = new Pane();
        rootpane.setBottom(pane);
        pane.getChildren().addAll(listplayer);
        pane.setTranslateX(10);

}

    public static Card getCard() {
        return card;
    }

    public static ArrayList<Card> getList() {
        return list;
    }

    public static ArrayList<Card> getListplayer() {
        return listplayer;
    }

    public static String showList(ArrayList<Card> list) {
        String s = " ";
        for (Card x : list) {
            s = s + x.getPicture().getNumber() + " ";
        }
        return s;
    }
}
