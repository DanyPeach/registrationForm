package com.example.repository;

import java.sql.SQLException;
import java.util.List;

public interface BaseDAO<T> {
    List<T> findAll();
    T findById(int id) throws SQLException;
    boolean createT(T t);
    boolean update(T t);
    boolean deleteById(int id) throws SQLException;
}
