module Part {
    requires java.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens cn.edu.ncu.eureka.atm.view;
    opens cn.edu.ncu.eureka.atm.controller;
    opens cn.edu.ncu.eureka.atm;
    opens cn.edu.ncu.eureka.shapefamily;
    opens cn.edu.ncu.eureka.shapefamily.view;
    opens cn.edu.ncu.eureka.shapefamily.controller;

    exports cn.edu.ncu.eureka.atm.controller;
    exports cn.edu.ncu.eureka.atm;
    exports cn.edu.ncu.eureka.shapefamily;
    exports cn.edu.ncu.eureka.shapefamily.view;
    exports cn.edu.ncu.eureka.shapefamily.controller;
}