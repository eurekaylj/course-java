package cn.edu.ncu.eureka.course01;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class Test02 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
//        //input
//        TextInputDialog inputDialog = new TextInputDialog();
//        inputDialog.setTitle("JavaFx input test");
//        inputDialog.setHeaderText("Input information:");
//        inputDialog.setContentText("Name:");
//
//        Optional<String> input = inputDialog.showAndWait();
//
//        //output
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("JavaFx output test");
//        alert.setHeaderText("output");
//        alert.setContentText("Hello! "+input.get()+"!\nYou are welcome to be here!");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("实验练习一，第二题");
        alert.setHeaderText("扩展字符输出排列成Java形状");
        int codePoint = 0x1D307;
        char[] chars = Character.toChars(codePoint);
        String s = new String(chars);

//        alert.setContentText("""
//                %5s%s%s%6s%6s%5s%6s
//                %7s%6s%3s%5s%4s%6s%2s
//                %s%5s%5s%s%s%s%5s%3s%5s%s%s%s
//                %4s%2s%5s%7s%5s%6s%6s
//                """);
        alert.setContentText("    "+s+s+s+"     "+s+"      "+s+"        "+s+"     "+s+"\n"
                +"       "+s+"      "+s+"  "+s+"    "+s+"      "+s+"    "+s+"  "+s+"\n"
                +s+"    "+s+"    "+s+s+s+s+"    "+s+"  "+s+"    "+s+s+s+s+"\n"
                +"   "+s+s+"    "+s+"        "+s+"      "+s+"     "+s+"        "+s);

        alert.showAndWait();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
