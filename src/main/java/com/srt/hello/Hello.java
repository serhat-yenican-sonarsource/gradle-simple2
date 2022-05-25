package com.srt.hello;

import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Hello {

  public static final String GREETING = "Hello world!";

  public static void main(String []args) {
    new Hello().hello(GREETING);
  }

  public void hello(String str) {
    System.out.println(str);
  }

  public PasswordAuthentication hotSpotExample() throws SQLException {
    String uname = "steve";
    String psw = "blue";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
            "user=" + uname + "&password=" + psw); // Sensitive

    return new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Sensitive
  }
}



