module Part3 {
    requires javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;

    opens cn.edu.ncu.eureka.guessWords.controller;
    opens cn.edu.ncu.eureka.guessWords.view;
    opens cn.edu.ncu.eureka.guessWords;
    opens cn.edu.ncu.eureka.calendarByGUI;
    opens cn.edu.ncu.eureka.calendarByConsole;

    exports cn.edu.ncu.eureka.guessWords.controller;
    exports cn.edu.ncu.eureka.guessWords;
    exports cn.edu.ncu.eureka.calendarByGUI;
    exports cn.edu.ncu.eureka.calendarByConsole;
}