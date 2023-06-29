package com.example.young;

import com.almasb.fxgl.net.Connection;

import static jdk.internal.net.http.hpack.HPACK.LOGGER;


public class Database {
    public static Connection ConnectDb() throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "12345");
            LOGGER.log(Level.INFO, "Установлено соединение с базой данных");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Ошибка при подключении к базе данных: " + e.getMessage(), e);
            throw e;
        }
        return connection;
    }
}
