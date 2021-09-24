package edu.xcdq;

import edu.xcdq.beans.User;
import edu.xcdq.dao.UserDao;
import edu.xcdq.dao.impl.UserDaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws Exception{
        // 准备数据库连接
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///bookstore", "root", "905274");
        UserDaoImpl userDao = new UserDaoImpl();
        User zhangSan = new User("zhangSan","123456","110@jingcha.gov") ;
        userDao.saveUser(connection,zhangSan);
        User tempUser = new User("zhangSan");
        User user = userDao.getUser(connection, tempUser);
        System.out.println(user);

    }



}
