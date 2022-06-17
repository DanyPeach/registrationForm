package com.example.repository;

import com.example.model.User;

public interface UserDAO extends BaseDAO{
    boolean createT(User user);
}
