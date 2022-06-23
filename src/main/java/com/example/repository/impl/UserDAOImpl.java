package com.example.repository.impl;

import com.example.connection.JDBCConnector;
import com.example.model.User;
import com.example.repository.UserDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private static final String CREATE_PERSON = "INSERT INTO users (username, userage, usergender, userlogin, userpassword) VALUES (?,?,?,?,?)";

    private JDBCConnector connector = new JDBCConnector();

    public boolean findUser(String login, String password) throws ClassNotFoundException {
        try(Connection connection = connector.getConnection()) {
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM users WHERE userlogin = ? AND userpassword = ?");
            pr.setString(1, login);
            pr.setString(2, password);
            ResultSet resultSet = pr.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public User getUser(String login, String password) throws ClassNotFoundException, SQLException {
        try(Connection connection = connector.getConnection()) {
            PreparedStatement pr = connection.prepareStatement("SELECT * FROM users WHERE userlogin = ? AND userpassword = ?");
            pr.setString(1, login);
            pr.setString(2, password);
            ResultSet resultSet = pr.executeQuery();
            User user = new User("null",0,"","","");
            while(resultSet.next()){
             String name = resultSet.getString("username");
             int age = resultSet.getInt("userage");
             String gender = resultSet.getString("usergender");
             String loginU = resultSet.getString("userlogin");
             user.setName(name);
             user.setAge(age);
             user.setGender(gender);
             user.setLogin(loginU);
            }
            return user;
        }
    }

    @Override
    public List<User> findAll() throws ClassNotFoundException, SQLException {
            Connection connection = connector.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM person");
            ResultSet resultSet = ps.executeQuery();
            List<User> list = new ArrayList<>();
            while(resultSet.next()){
                String name = resultSet.getString("username");
                int age = resultSet.getInt("userage");
                String gender = resultSet.getString("usergender");
                String loginU = resultSet.getString("userlogin");
                String password = resultSet.getString("userpassword");
                User user = new User(name, age, gender, loginU, password);
                list.add(user);
            }
            return list;
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

    public List<String> getLogAndPas(User user) throws ClassNotFoundException {
        try(Connection connection = connector.getConnection()){
            String aStr = user.getLogin();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT userpassword FROM users WHERE userid = ?");
            preparedStatement.setString(1, aStr);
            List<String> finalList = new ArrayList<>();
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                String password = resultSet.getString("userpassword");
                finalList.add(password);
            }
            return finalList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
