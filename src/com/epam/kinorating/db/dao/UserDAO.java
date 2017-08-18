package com.epam.kinorating.db.dao;

import com.epam.kinorating.entity.User;

import java.sql.Connection;
import java.util.ArrayList;

public interface UserDAO {
    boolean update(Connection con, User user);

    int checkName(Connection con, String name);

    int checkMail(Connection con, String mail);

    String read(Connection con, String name);

    User read(Connection con, String name, String password);

    int create(Connection con, User user);

    ArrayList<User> readAll(Connection con);
}
