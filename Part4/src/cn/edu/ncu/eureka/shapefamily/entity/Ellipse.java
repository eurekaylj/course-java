package cn.edu.ncu.eureka.shapefamily.entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ellipse implements Drawable{
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;

    public Ellipse(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = Color.BLUE;
    }

    public Ellipse(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(x,y,width,height);
    }
}
