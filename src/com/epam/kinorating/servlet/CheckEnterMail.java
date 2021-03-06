package com.epam.kinorating.servlet;

import com.epam.kinorating.db.dao.factory.DAOFactory;
import com.epam.kinorating.db.dao.factory.impl.MySqlDAOFactory;
import com.epam.kinorating.service.UserService;
import com.epam.kinorating.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "checkmail", urlPatterns = "/checkmail")
public class CheckEnterMail extends HttpServlet {
    private UserService userService;

    @Override
    public void init() throws ServletException {
        DAOFactory factory = new MySqlDAOFactory();
        userService = new UserServiceImpl(factory.getUserDAO());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mail = request.getParameter("mail");

        PrintWriter printWriter = response.getWriter();

        if (!userService.isFreeMail(mail)) {
            printWriter.print("false");
        }
    }
}
