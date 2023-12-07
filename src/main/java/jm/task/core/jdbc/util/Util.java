package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    //  Требуется заполнить данные вашей локальной БД
    private static final String URL_KEY = "jdbc:postgresql://localhost:5432/";
    private static final String USER_KEY = "";
    private static final String PASSWORD_KEY = "";

    public static Connection getConnection() throws SQLException {

        Connection connection;
        try{
            connection  = DriverManager.getConnection(
                    URL_KEY,
                    USER_KEY,
                    PASSWORD_KEY);
            return  connection;
        } catch (SQLException e){
            throw new SQLException("Ошибка при установлении соединения с базой данных.", e);
        }
    }
}
