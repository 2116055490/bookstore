package edu.xcdq.dao.impl;

import edu.xcdq.beans.User;
import edu.xcdq.dao.BaseDao;
import edu.xcdq.dao.UserDao;

import java.sql.Connection;

public class UserDaoImpl extends BaseDao <UserDao> implements UserDao {
    @Override
    public void saveUser(Connection conn, User user) {
        String sql = "insert into user(username,password,email) values(?,?,?)";
        update(conn,sql, user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public User getUser(Connection conn, User user) {
        return null;
    }

    @Override
    public boolean checkUsername(Connection conn, User user) {
        return false;
    }
}
