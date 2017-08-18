package com.epam.kinorating.db.dao;

import com.epam.kinorating.entity.UserAction;

import java.sql.Connection;
import java.util.ArrayList;

public interface UserActionDAO {
    boolean create(Connection con, UserAction userAction);

    ArrayList<UserAction> readAll(Connection con, int movieId);

    int isRated(Connection con, int userId, int movieId);
}
