package cn.edu.ncu.eureka.shapefamily.entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle implements Drawable {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color color;

    public Triangle(double x, double y, double width, double height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        //gc.fillPolygon(new double[]{10,20,100}, new double[]{20,40 ,200},3);
        double[] xp = new double[]{x, x + width/2, x + width};
        double[] yp = new double[]{y + height, y, y + height};
        gc.fillPolygon(xp, yp, 3);
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getLength() {
        return width+2*Math.sqrt(width/4*width+height*height);
    }
}
