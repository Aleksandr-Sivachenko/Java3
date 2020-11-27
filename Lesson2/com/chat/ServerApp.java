package com.chat;

import com.chat.server.ChatServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServerApp {
    public static void main(String[] args) {
        Connection connection = null;

        try {
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/chat","root","");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        new ChatServer();
    }
}
