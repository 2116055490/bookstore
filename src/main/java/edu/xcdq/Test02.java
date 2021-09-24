package edu.xcdq;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import edu.xcdq.beans.User;
import edu.xcdq.dao.impl.UserDaoImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        HikariConfig config = new HikariConfig("/hikari.properties");
        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = null;
        try {
            connection = ds.getConnection();
        } catch (SQLException e) {
            System.out.println("获取连接池失败");
            e.printStackTrace();
        }

        long startTime  = System.currentTimeMillis();
        UserDaoImpl userDao = new UserDaoImpl();
        /*List<User> users = userDao.getUsers(connection);
        for (User u : users ) {
            System.out.println(u);
        }*/
        User user = new User();
        user.setUsername("wuwang");
        boolean flag = userDao.checkUsername(connection, user);
        System.out.println(flag);
        long endTime  = System.currentTimeMillis();
        System.out.println(endTime - startTime );
    }
}
