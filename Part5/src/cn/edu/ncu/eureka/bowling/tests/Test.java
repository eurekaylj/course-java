package cn.edu.ncu.eureka.bowling.tests;

import cn.edu.ncu.eureka.bowling.entity.CoachSys;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        CoachSys coachSys = new CoachSys();
        System.out.println(coachSys.Coach.size());
    }
}
