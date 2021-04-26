package cn.edu.ncu.eureka.shapefamily.controller;

import cn.edu.ncu.eureka.shapefamily.entity.Drawable;
import cn.edu.ncu.eureka.shapefamily.utils.PropertyHandler;
import cn.edu.ncu.eureka.shapefamily.view.ShapePane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class DrawAction implements Initializable {

    private Drawable shape;
    private PropertyHandler propertyHandler;
    @FXML
    private ShapePane shapePane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        reset();
    }

    @FXML
    public void reDraw() {
        reset();
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
