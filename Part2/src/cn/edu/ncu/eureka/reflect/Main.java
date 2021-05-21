package cn.edu.ncu.eureka.reflect;

public class Main {
    public static void main(String[] args){
        Person person = new Person("张三");
        System.out.println(person);
        System.out.println(person.hashCode());
    }
}
