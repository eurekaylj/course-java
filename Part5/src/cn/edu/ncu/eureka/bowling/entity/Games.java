package cn.edu.ncu.eureka.bowling.entity;

import java.sql.Date;

public class Games {
    private int type;
    private Date date;
    private String position;
    private String[] Side;
    private int[] sideScore;
    private boolean status;

    public Games() {
    }

    public Games(int type, Date date, String position, String[] side, int[] sideScore, boolean status) {
        this.type = type;
        this.date = date;
        this.position = position;
        Side = side;
        this.sideScore = sideScore;
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String[] getSide() {
        return Side;
    }

    public void setSide(String A, String B, String C) {
        this.Side[0] = A;
        this.Side[1] = B;
        this.Side[2] = C;
    }

    public int[] getSideScore() {
        return sideScore;
    }

    public void setSideScore(int A, int B, int C) {
        this.sideScore[0] = A;
        this.sideScore[1] = B;
        this.sideScore[2] = C;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
