package com.example.repository.impl;

import com.example.connection.JDBCConnector;
import com.example.model.User;
import com.example.repository.UserDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private static final String CREATE_PERSON = "INSERT INTO users (username, userage, usergender, userlogin, userpassword) VALUES (?,?,?,?,?)";

    private JDBCConnector connector = new JDBCConnector();

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object findById(int id) throws SQLException {
        return null;
    }

    @Override
    public boolean createT(Object o) {
        return false;
    }

    @Override
    public boolean createT(User user) {
        try(Connection connection = connector.getConnection()){
            PreparedStatement statement = connection.prepareStatement(CREATE_PERSON, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getName());
            statement.setInt(2,user.getAge());
            statement.setString(3, user.getGender());
            statement.setString(4, user.getLogin());
            statement.setString(5, user.getPassword());
            return statement.executeUpdate()==1;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
        return false;
    }
}
