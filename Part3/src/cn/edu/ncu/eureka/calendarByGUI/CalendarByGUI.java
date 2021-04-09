package cn.edu.ncu.eureka.calendarByGUI;

import cn.edu.ncu.eureka.calendarByGUI.Calendar;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class CalendarByGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Calendar c = new Calendar();
        int year = input("请输入年份");
        int month  = input("请输入月份");
        String cStr = c.getCalendar(year,month);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Calendar");
        alert.setHeaderText(year+"年"+month+"月月历");
        alert.setContentText(cStr);
        alert.getDialogPane().setStyle("-fx-font-family: Arial;-fx-font-size:14px");
        alert.showAndWait();
    }

    public int input(String str){
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setTitle("月历");
        inputDialog.setHeaderText(str);
        Optional<String> input = inputDialog.showAndWait();
        String s = input.get();
        int n = Integer.parseInt(s);
        return n;
    }

    public static void main(String... args) {
        Application.launch(args);
    }
}
