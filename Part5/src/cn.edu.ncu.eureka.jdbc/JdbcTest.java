package cn.edu.ncu.eureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTest {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcph","root","root");
        String sql = "update customer set address = '100000' where custkey = 1";
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate(sql);
        System.out.println(count);
        statement.close();
        connection.close();
    }
}