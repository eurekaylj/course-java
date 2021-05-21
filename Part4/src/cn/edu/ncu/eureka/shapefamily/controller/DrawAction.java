package cn.edu.ncu.eureka.shapefamily.controller;

import cn.edu.ncu.eureka.shapefamily.entity.Drawable;
import cn.edu.ncu.eureka.shapefamily.utils.PropertyHandler;
import cn.edu.ncu.eureka.shapefamily.view.ShapePane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;

import java.net.URL;
import java.util.ResourceBundle;

public class DrawAction implements Initializable {

    private Drawable shape;
    private PropertyHandler propertyHandler;
    @FXML
    private ShapePane shapePane;
    @FXML
    private TextArea display;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        reset();
    }

    @FXML
    public void showInformation() {
        display.setText("图形面积为：%10.2f".formatted(shape.getArea())+"\n"+"图形周长为：%10.2f".formatted(shape.getLength()));
    }

    private void reset() {
        propertyHandler = PropertyHandler.getInstance();
        try {
            this.shape = propertyHandler.getShape();
            shapePane.setShape(this.shape);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
