package com.epam.kinorating.db.dao.factory;

import com.epam.kinorating.db.dao.MovieDAO;
import com.epam.kinorating.db.dao.UserActionDAO;
import com.epam.kinorating.db.dao.UserDAO;

public interface DAOFactory {

	UserDAO getUserDAO();

	MovieDAO getMovieDAO();

	UserActionDAO getUserActionDAO();

}
