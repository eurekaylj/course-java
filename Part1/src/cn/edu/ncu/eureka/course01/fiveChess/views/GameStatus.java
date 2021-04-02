package cn.edu.ncu.eureka.course01.fiveChess.views;

public enum GameStatus {
    Win("你赢了"),
    Lose("你输了"),
    Goon("继续");
    private final String desc;

    private GameStatus(String desc){
        this.desc = desc;
    }

    public String toString(){
        return this.desc;
    }
}
