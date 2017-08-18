package com.epam.kinorating.db.dao.factory.impl;

import com.epam.kinorating.db.dao.MovieDAO;
import com.epam.kinorating.db.dao.UserActionDAO;
import com.epam.kinorating.db.dao.UserDAO;
import com.epam.kinorating.db.dao.factory.DAOFactory;
import com.epam.kinorating.db.dao.impl.MovieDAOImpl;
import com.epam.kinorating.db.dao.impl.UserActionDAOImpl;
import com.epam.kinorating.db.dao.impl.UserDAOImpl;

public class MySqlDAOFactory implements DAOFactory {
    @Override
    public MovieDAO getMovieDAO() {
        return new MovieDAOImpl();
    }

    @Override
    public UserDAO getUserDAO() {
        return new UserDAOImpl();
    }

    @Override
    public UserActionDAO getUserActionDAO() {
        return new UserActionDAOImpl();
    }

}
