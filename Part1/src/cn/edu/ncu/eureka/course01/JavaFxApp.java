package cn.edu.ncu.eureka.course01;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class JavaFxApp extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //input
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("JavaFx input test");
        inputDialog.setHeaderText("Input information:");
        inputDialog.setContentText("Name:");

        Optional<String> input = inputDialog.showAndWait();

        //output
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("JavaFx output test");
        alert.setHeaderText("output");
        alert.setContentText("Hello! "+input.get()+"!\nYou are welcome to be here!");

        alert.showAndWait();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
