package cn.edu.ncu.eureka.bowling.module;

abstract class Person {
    private String name;
    private String age;
    private String gender;
    private String address;
    private String identity;
    private String teamNum;

    public Person() { };

    public Person(String name, String age,
                  String gender, String address,
                  String identity, String teamNum) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.identity = identity;
        this.teamNum = teamNum;
    }

    public Person(String name) {
        this(name,null,null,null,null,null);

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getIdentity() {
        return identity;
    }

    public String getTeamNum() {
        return teamNum;
    }

    public abstract void setName(String name);

    public abstract void setAge(String age) ;

    public abstract void setGender(String gender);

    public abstract void setAddress(String address);

    public abstract void setIdentity(String identity);

    public abstract void setTeamNum(String teamNum);
}
