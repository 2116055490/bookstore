package edu.xcdq.dao.impl;

import edu.xcdq.beans.User;
import edu.xcdq.dao.BaseDao;
import edu.xcdq.dao.UserDao;

import java.sql.Connection;
import java.util.List;

public class UserDaoImpl extends BaseDao <User> implements UserDao {
    @Override
    public void saveUser(Connection conn, User user) {
        String sql = "insert into user(username,password,email) values(?,?,?)";
        update(conn,sql, user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public User getUser(Connection conn, User user) {
        String sql = "select id,username,password,email from user where username = ? ";
        User result = getBean(conn, sql, user.getUsername());
        return result;
    }

    @Override
    public List<User> getUsers(Connection coon) {
        String sql = "select * from user";
        List<User> userList = getBeanList(coon,sql);
        return userList;
    }

    @Override
    public boolean checkUsername(Connection conn, User user) {
        String sql = "select * from user where username = ?";
        User res = getBean(conn,sql,user.getUsername());
        return res != null;
    }
}
