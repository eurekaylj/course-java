package cn.edu.ncu.eureka.bowling.module;

import java.sql.SQLOutput;

public class Player extends Person{

    private String password;

    Player(){
    }


    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setName(String name) {
    }

    @Override
    public void setAge(String age) {

    }

    @Override
    public void setGender(String gender) {

    }

    @Override
    public void setAddress(String address) {

    }

    @Override
    public void setIdentity(String identity) {

    }

    @Override
    public void setTeamNum(String teamNum) {
    }
}
