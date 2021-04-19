package cn.edu.ncu.eureka.atm.entity;

public class Account {
    private String id = null;
    private String name = null;
    private boolean gender = true;
    private String password = null;

    private double money = 0;

    public Account(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Account(String id, String name, String password, double money,boolean gender) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.money = money;
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

}
