package cn.edu.ncu.eureka.atm.entity;

public class Account {
    private String id = null;
    private String name = null;
    private String password = null;
    private double money = 0;

    public Account(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Account(String id, String name, String password, double money) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.money = money;
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
