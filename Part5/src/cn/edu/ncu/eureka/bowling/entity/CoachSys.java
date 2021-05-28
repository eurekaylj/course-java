package cn.edu.ncu.eureka.bowling.entity;

import cn.edu.ncu.eureka.bowling.jdbc.DataBase;

import java.sql.SQLException;
import java.util.List;

public class CoachSys {
    DataBase dataBase = new DataBase();
    public List<Participants> Coach = dataBase.getOriginParticipantsSys(1);



    public CoachSys() throws SQLException {
    }


}
