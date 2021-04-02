package cn.edu.ncu.eureka.guessWords;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = FXMLLoader.load(getClass().getResource("view/main.fxml"));
        var scene = new Scene(root,600,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("猜单词游戏");
        primaryStage.show();
    }
}
