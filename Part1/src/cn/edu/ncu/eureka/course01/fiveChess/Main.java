package cn.edu.ncu.eureka.course01.fiveChess;

import cn.edu.ncu.eureka.course01.fiveChess.entity.FiveChess;
import cn.edu.ncu.eureka.course01.fiveChess.views.ChessPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){launch(args);}

    @Override
    public void start(Stage primaryStage) {
        FiveChess fiveChess = new FiveChess();
        ChessPane root = new ChessPane(780,780,fiveChess);
        Scene scene = new Scene(root);
        primaryStage.setTitle("五子棋 V1.0 NCU Eureka");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
