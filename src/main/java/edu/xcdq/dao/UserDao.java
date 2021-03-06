package edu.xcdq.dao;

import edu.xcdq.beans.User;

import java.sql.Connection;
import java.util.List;


public interface UserDao {
    // 增
    void saveUser(Connection conn,User user);

    // 查
    User getUser(Connection conn, User user);
    List<User> getUsers(Connection coon);

    // 校验用户信息
    boolean checkUsername(Connection conn,User user);
}
