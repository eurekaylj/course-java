package cn.edu.ncu.eureka.course01.fiveChess.entity;

import cn.edu.ncu.eureka.course01.fiveChess.views.GameStatus;
import javafx.scene.control.Alert;

import java.util.Arrays;

public class FiveChess {

    /**
     * 建立棋盘类
     */
    private final String[][] chesses;

    /**
     * 默认白子优先
     */
    private String currentSide = "W";

    /**
     * 建立棋盘实例，并全部初始化
     */
    public FiveChess(){
        chesses = new String[19][19];
        for (String[] chess : chesses) {
            Arrays.fill(chess, " ");
        }
    }

    /**
     * 获取当前掷棋方颜色
     * @return 颜色
     */
    public String getCurrentSide() {
        return this.currentSide;
    }

    /**
     * 获取当前棋盘
     * @return 棋盘
     */
    public String[][] getChesses() {
        return this.chesses;
    }

    /**
     * 掷棋判断
     * @param row 横
     * @param col 纵
     */
    public void play(int row,int col){
        if (isValidPos(row,col)){
            chesses[row][col] = currentSide;
            var gameOver = judgeGame(row,col);
            if (gameOver == GameStatus.Win||gameOver == GameStatus.Lose){
                String Chinese = "白方";
                if (currentSide.equals("B"))
                    Chinese = "黑方";
                showDialog(String.format("%s:%s",Chinese,gameOver.toString()));
                clearChesses();
            }
            else
                changeSide();
        }
    }

    public void showDialog(String content){
        var alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("五子棋游戏");
        alert.setHeaderText("游戏提示");
        alert.setContentText(content);
        alert.showAndWait();
    }

    /**
     * 交换
     */
    public void changeSide(){
        this.currentSide = currentSide.equals("B")?"W":"B";
    }

    /**
     * 判断掷棋位置是否合法
     * @param row 横
     * @param col 纵
     * @return 合法/非法
     */
    public boolean isValidPos(int row,int col) {
        return chesses[row][col].equals(" ");
    }

    /**
     * 判断是否产生终局
     * @param row 横
     * @param col 纵
     * @return 继续/结束
     */
    public GameStatus judgeGame(int row,int col){
        if (isSameColumn(row,col)||isSameRow(row,col)||isSameLine(row,col)||isSameNegLine(row,col))
            return GameStatus.Win;
        else if (isOccuiedAll()){
            return GameStatus.Lose;
        }
        else{
            return GameStatus.Goon;
        }
    }

    /**
     * 判断横线
     * @param row 横
     * @param col 纵
     * @return 是否满五
     */
    public boolean isSameRow(int row,int col){
        var cuont = 0;
        for (int i = row; i >= 0 && chesses[row][i].equals(currentSide); i--)
            cuont++;
        for (int i = row+1; i < chesses[row].length && chesses[row][i].equals(currentSide); i++)
            cuont++;
        return cuont>=5;
    }

    /**
     * 判断纵线
     * @param row 横
     * @param col 纵
     * @return 是否满五
     */
    public boolean isSameColumn(int row,int col){
        var cuont = 0;
        for (int i = col; i >= 0 && chesses[i][col].equals(currentSide); i--)
            cuont++;
        for (int i = col+1; i < chesses[col].length && chesses[i][col].equals(currentSide); i++)
            cuont++;
        return cuont>=5;
    }

    /**
     * 判断正对角线
     * @param row 横
     * @param col 纵
     * @return 是否满五
     */
    public boolean isSameLine(int row,int col){
        var count = 0;
        for (int i = row, j = col; i < chesses.length && j < chesses.length && chesses[i][j].equals(currentSide); i++,j++)
            count++;
        for (int i = row-1, j = col-1; i >= 0 && j >= 0 && chesses[i][j].equals(currentSide); i--,j--)
            count++;
        return count>=5;
    }

    /**
     * 判断斜对角线
     * @param row 横
     * @param col 纵
     * @return 是否满五
     */
    public boolean isSameNegLine(int row,int col){
        var count = 0;
        for (int i = row, j = col; i >= 0 && j < chesses.length && chesses[i][j].equals(currentSide); i--,j++)
            count++;
        for (int i = row+1, j = col-1; i < chesses.length && j >= 0 && chesses[i][j].equals(currentSide); i++,j--)
            count++;
        return count>=5;
    }

    /**
     * 判断是否下满
     * @return 是否下满
     */
    public boolean isOccuiedAll(){
        var count = 0;
        for (String[] chess : chesses)
            for (int j = 0; j < chesses.length; j++)
                if (!chess[j].equals(" "))
                    count++;
        return count> 361;
    }

    public void clearChesses(){
        var count = 0;
        for (int i = 0; i < chesses.length; i++)
            for (int j = 0; j < chesses.length; j++)
                chesses[i][j] = " ";
    }
}
