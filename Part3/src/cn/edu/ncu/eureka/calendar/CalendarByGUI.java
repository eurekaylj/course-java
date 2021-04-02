package cn.edu.ncu.eureka.calendar;

import cn.edu.ncu.eureka.calendar.Calendar;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class CalendarByGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //请修改内容实现月历的输出.....
        Calendar c = new Calendar();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Calendar");
        alert.setHeaderText("Output");
        alert.setContentText(cStr.replaceAll("00", " ".repeat(4)));
        alert.getDialogPane().setStyle("-fx-font-family: Arial;-fx-font-size:14px");
        alert.showAndWait();
    }

    public static void main(String... args) {
        Application.launch(args);
    }
}