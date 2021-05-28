package cn.edu.ncu.eureka.bowling.jdbc;

import cn.edu.ncu.eureka.bowling.entity.Games;
import cn.edu.ncu.eureka.bowling.entity.Participants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {
    private static final String url = "jdbc:mysql://localhost:3306/bowling";
    private static final String user = "root";
    private static final String password = "root";
    public static Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    /*
    对ParticipantsSys对象的操作
     */

    public List<Participants> getOriginParticipantsSys(int type) throws SQLException {
        Connection conn = DataBase.getConnection();
        Statement sme = conn.createStatement();
        ResultSet rs = sme.executeQuery(" select * from participants where type = " + type);
        List<Participants> participants = new ArrayList<Participants>();
        Participants selectParticipants = null;
        while (rs.next()) {
            selectParticipants = new Participants();
            selectParticipants.setName(rs.getString("name"));
            selectParticipants.setId(rs.getString("id"));
            selectParticipants.setPassword(rs.getString("password"));
            selectParticipants.setGender(rs.getString("gender"));
            selectParticipants.setAge(rs.getString("age"));
            selectParticipants.setAddress(rs.getString("address"));
            selectParticipants.setTeamNum(rs.getInt("teamNum"));
            selectParticipants.setType(rs.getInt("type"));
            participants.add(selectParticipants);
        }
        sme.close();
        conn.close();
        return participants;
    }

    public void deleteOriginParticipantsSys() throws SQLException {
        Connection conn = DataBase.getConnection();
        Statement sme = conn.createStatement();
        sme.execute("delete table particiants");
        sme.close();
        conn.close();
    }

    public void updateNewParticipantsSys(List<Participants> ParticipantsSys) throws SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement sme = conn.prepareStatement(" insert into participants " + " values(?,?,?,?,?,?,?,?,?)");
        for (Participants i:ParticipantsSys) {
            sme.setString(1,i.getName());
            sme.setString(2,i.getId());
            sme.setString(3,i.getPassword());
            sme.setString(4,i.getGender());
            sme.setString(5,i.getAge());
            sme.setString(6,i.getAddress());
            sme.setInt(7,i.getTeamNum());
            sme.setInt(8,i.getType());
        }
        sme.close();
    }

    /*
    对GamesSys对象的操作
     */
    public List<Games> getOriginGamesSys() throws SQLException {
        Connection conn = DataBase.getConnection();
        Statement sme = conn.createStatement();
        ResultSet rs = sme.executeQuery(" select * from games");
        List<Games> Games = new ArrayList<Games>();
        Games selectGames = null;
        while (rs.next()) {
            selectGames = new Games();
            selectGames.setType(rs.getInt("type"));
            selectGames.setDate(rs.getDate("time"));
            selectGames.setPosition(rs.getString("position"));
            selectGames.setSide(rs.getString("partA"),rs.getString("partB"),rs.getString("partC"));
            selectGames.setSideScore(rs.getInt("scoreA"),rs.getInt("scoreB"),rs.getInt("scoreC"));
            Games.add(selectGames);
        }
        sme.close();
        return Games;
    }

    public void deleteOriginGamesSys() throws SQLException {
        Connection conn = DataBase.getConnection();
        Statement sme = conn.createStatement();
        sme.execute("delete table games");
        sme.close();
    }

    public void updateNewGamesSys(List<Games> GamesSys) throws SQLException {
        Connection conn = DataBase.getConnection();
        PreparedStatement sme = conn.prepareStatement(" insert into participants " + " values(?,?,?,?,?,?,?,?,?)");
        for (Games i:GamesSys) {
            sme.setInt(1,i.getType());
            sme.setDate(2,i.getDate());
            sme.setString(3,i.getPosition());
            sme.setString(4,i.getSide()[0]);
            sme.setString(5,i.getSide()[1]);
            sme.setString(6,i.getSide()[2]);
            sme.setInt(7,i.getSideScore()[0]);
            sme.setInt(8,i.getSideScore()[1]);
            sme.setInt(9,i.getSideScore()[2]);
        }
        sme.close();
    }
}
