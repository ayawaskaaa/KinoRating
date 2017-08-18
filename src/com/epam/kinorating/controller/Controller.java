package com.epam.kinorating.controller;

import com.epam.kinorating.command.ActionFactory;
import com.epam.kinorating.command.Command;
import com.epam.kinorating.config.PagePath;
import com.epam.kinorating.db.dao.factory.DAOFactory;
import com.epam.kinorating.db.dao.factory.impl.MySqlDAOFactory;
import com.epam.kinorating.service.MovieService;
import com.epam.kinorating.service.UserActionService;
import com.epam.kinorating.service.UserService;
import com.epam.kinorating.service.impl.MovieServiceImpl;
import com.epam.kinorating.service.impl.UserActionServiceImpl;
import com.epam.kinorating.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controller")
public class Controller extends HttpServlet{
    private static final String COMMAND = "command";

    private UserService userService;
    private UserActionService userActionService;
    private MovieService movieService;

    @Override
    public void init() throws ServletException {
        DAOFactory factory = new MySqlDAOFactory();

        userService = new UserServiceImpl(factory.getUserDAO());
        userActionService = new UserActionServiceImpl(factory.getUserActionDAO());
        movieService = new MovieServiceImpl(factory.getMovieDAO());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String page;
        Command command = ActionFactory.defineCommand(request.getParameter(COMMAND));
        page = command.execute(request, userService, movieService, userActionService);
        if (page != null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher(page);
            dispatcher.forward(request, response);
        } else {
            page = PagePath.PAGE_INDEX;
            response.sendRedirect(request.getContextPath() + page);
        }
    }
}
