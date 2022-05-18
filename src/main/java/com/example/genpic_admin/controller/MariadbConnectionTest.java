package com.example.genpic_admin.controller;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariadbConnectionTest {
    // MySQL Connector 의 클래스. DB 연결 드라이버 정의
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // DB 경로
    private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Seoul";
    private static final String USER = "root";
    private static final String PASSWORD = "5470022";

    @Test
    public void testConnection() throws Exception {
        // DBMS에게 DB 연결 드라이버의 위치를 알려주기 위한 메소드
        Class.forName(DRIVER);
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Seoul","root", "5470022");
            System.out.println("ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
