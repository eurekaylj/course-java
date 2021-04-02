package cn.edu.ncu.eureka.course01;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class Test03 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        //input
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("Java课程成绩");
        inputDialog.setHeaderText("请输入你的课程成绩:");
        inputDialog.setContentText("分数:");

        Optional<String> input = inputDialog.showAndWait();
        String str = input.get();

        int num = Integer.parseInt(str);
        GradeType type;
        switch (num/10){
            case 10,9->type = GradeType.A;
            case 8->type = GradeType.B;
            case 7->type = GradeType.C;
            case 6->type = GradeType.D;
            default -> type = GradeType.E;
        }

        //output
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Java课程成绩");
        alert.setHeaderText("Java课程成绩等级");
        alert.setContentText("你的等级是："+type.getGrade());

        alert.showAndWait();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
