package cn.edu.ncu.eureka.bowling.module;

public class Coach extends Person{
    private String password;

    Coach(){
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void gameInfo(){}
    public void showTeams(){

    }

    public void showMyTeam(){

    }
    public void addPlayer(Player player){}
    public void delPlayer(){};

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
