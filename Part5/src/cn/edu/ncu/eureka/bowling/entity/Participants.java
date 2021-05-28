package cn.edu.ncu.eureka.bowling.entity;

public class Participants {
    private String id;
    private String name;
    private String password;
    private String gender;
    private String age;
    private String address;
    private int    teamNum;
    private int    type;

    public Participants() {
    }

    public Participants(String name, String id, String password, String gender, String age, String address, int teamNum, int type) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.teamNum = teamNum;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTeamNum() {
        return teamNum;
    }

    public void setTeamNum(int teamNum) {
        this.teamNum = teamNum;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Participants{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", teamNum=" + teamNum +
                ", type=" + type +
                '}';
    }
}
