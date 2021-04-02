package cn.edu.ncu.eureka.course01.fiveChess.views;

import cn.edu.ncu.eureka.course01.fiveChess.entity.FiveChess;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ChessPane extends Pane{
    private final Canvas canvas;
    private final GraphicsContext gc;
    private final int cell = 40;
    private final int startX = 10;
    private final int startY = 10;

    private final FiveChess fiveChess;
    public ChessPane(int width,int height,FiveChess fiveChess){
        canvas = new Canvas(width,height);
        this.fiveChess = fiveChess;
        this.gc = canvas.getGraphicsContext2D();
        drawChessPane();

        setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                var x = event.getX();
                var y = event.getY();
                int xPos = (int)(x-startX)/cell;
                int yPos = (int)(y-startY)/cell;

                var side = fiveChess.getCurrentSide();
                fiveChess.play(xPos,yPos);
                draw();
            }
        });
        getChildren().add(canvas);
    }

    /**
     * 显示对话框
     * @param title 标题
     * @param content 内容
     */
    public void showDialog(String title,String content){
        var dialog = new Alert(Alert.AlertType.INFORMATION);
        dialog.setTitle(title);
        dialog.setContentText(content);
        dialog.showAndWait();
    }

    /**
     * 绘制Pane
     */
    public void draw(){
        gc.clearRect(0,0,canvas.getWidth(),canvas.getHeight());
        drawChessPane();
        drawChesses();
    }

    /**
     * 绘制棋盘
     */
    public void drawChessPane(){
        gc.setStroke(Color.LIGHTBLUE);
        for (int i=0;i<18;i++)
            for (int j=0;j<18;j++)
                gc.strokeRect(startX+i*cell+0.5*cell,startY+j*cell+0.5*cell,cell,cell);
    }

    /**
     * 绘制棋子
     */
    public void drawChesses(){
        String[][] chesses = fiveChess.getChesses();
        for (int i=0;i<chesses.length;i++)
            for (int j=0;j<chesses[i].length;j++)
                if (chesses[i][j].equals("B")){
                    gc.setFill(Color.BLACK);
                    gc.fillOval(startX+i*cell,startY+j*cell,cell,cell);
                    gc.setStroke(Color.BLACK);
                    gc.strokeOval(startX+i*cell,startY+j*cell,cell,cell);
                }
                    else if (chesses[i][j].equals("W")){
                    gc.setFill(Color.WHITE);
                    gc.setStroke(Color.BLACK);
                    gc.fillOval(startX+i*cell,startY+j*cell,cell,cell);
                    gc.strokeOval(startX+i*cell,startY+j*cell,cell,cell);
                }
    }
}
