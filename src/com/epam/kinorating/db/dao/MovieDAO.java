package com.epam.kinorating.db.dao;

import com.epam.kinorating.entity.Movie;

import java.sql.Connection;
import java.util.ArrayList;

public interface MovieDAO {
    ArrayList<Movie> readByPage(Connection con, int page);

    ArrayList<Movie> read(Connection con, String name);

    boolean create(Connection con, Movie movie);

    Movie read(Connection con, int id);
}
