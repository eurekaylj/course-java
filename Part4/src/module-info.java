module Part {
    requires java.base;
    requires javafx.controls;
    requires javafx.fxml;

    opens cn.edu.ncu.eureka.atm.view;
    opens cn.edu.ncu.eureka.atm.controller;
    opens cn.edu.ncu.eureka.atm;

    exports cn.edu.ncu.eureka.atm.controller;
    exports cn.edu.ncu.eureka.atm;
}