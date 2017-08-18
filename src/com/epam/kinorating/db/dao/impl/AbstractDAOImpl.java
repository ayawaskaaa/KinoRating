package com.epam.kinorating.db.dao.impl;

import com.epam.kinorating.exception.DAOException;
import org.apache.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDAOImpl {
    private static final Logger log = Logger.getLogger(AbstractDAOImpl.class);

    protected void close(final ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                log.error("Exception occurred during closing result set", e);
                throw new DAOException("Exception occurred during closing result set", e);
            }
        }
    }

    protected void close(final Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                log.error("Exception occurred during closing statement", e);
                throw new DAOException("Exception occurred during closing statement", e);
            }
        }
    }
}
