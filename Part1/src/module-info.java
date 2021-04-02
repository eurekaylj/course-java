module Part1 {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.web;
    requires javafx.swt;

    exports cn.edu.ncu.eureka.course01;
    exports cn.edu.ncu.eureka.course01.fiveChess;
    exports cn.edu.ncu.eureka.course01.fiveChess.views;
    exports cn.edu.ncu.eureka.course01.latin;

    opens cn.edu.ncu.eureka.course01.latin;
    opens cn.edu.ncu.eureka.course01.fiveChess;
    opens cn.edu.ncu.eureka.course01.fiveChess.views;
    opens cn.edu.ncu.eureka.course01;
}
