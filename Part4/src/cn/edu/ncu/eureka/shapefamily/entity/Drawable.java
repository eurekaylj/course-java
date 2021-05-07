package cn.edu.ncu.eureka.shapefamily.entity;

import javafx.scene.canvas.GraphicsContext;

public interface Drawable {
    public void draw(GraphicsContext gc);
    public double getArea();
    public double getLength();
}
