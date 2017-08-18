package com.epam.kinorating.listener;

import com.epam.kinorating.config.Attribute;
import com.epam.kinorating.db.dao.factory.DAOFactory;
import com.epam.kinorating.db.dao.factory.impl.MySqlDAOFactory;
import com.epam.kinorating.entity.User;
import com.epam.kinorating.service.UserService;
import com.epam.kinorating.service.impl.UserServiceImpl;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class UserListener implements HttpSessionListener {
    public void sessionDestroyed(HttpSessionEvent e) {
        HttpSession session = e.getSession();
        User user = (User) session.getAttribute(Attribute.ATTRIBUTE_USER);

        DAOFactory factory = new MySqlDAOFactory();
        UserService userService = new UserServiceImpl(factory.getUserDAO());
        userService.update(user);

        session.invalidate();
    }
}
