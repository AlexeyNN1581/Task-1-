package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";

    public static Connection getConnection() {
        Connection connection= null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
        }
        //public static SessionFactory getSessionFactory() {

        //}

        // реализуйте настройку соеденения с БД
    }
