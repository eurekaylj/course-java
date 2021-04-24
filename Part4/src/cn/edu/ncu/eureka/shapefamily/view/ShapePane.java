package cn.edu.ncu.eureka.shapefamily.view;

import cn.edu.ncu.eureka.shapefamily.entity.Drawable;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class ShapePane extends Pane {
    private Drawable shape;
    private Canvas canvas;
    private GraphicsContext gc;

    public ShapePane() {
        this.canvas = new Canvas(800,600);
        this.gc = this.canvas.getGraphicsContext2D();
        drawShape();
        getChildren().add(canvas);
    }

    public void drawShape() {
        gc.clearRect(0,0,canvas.getHeight(),canvas.getWidth());
        if (shape != null)
            shape.draw(gc);
    }

    public void setShape(Drawable shape) {
        this.shape = shape;
    }
}
