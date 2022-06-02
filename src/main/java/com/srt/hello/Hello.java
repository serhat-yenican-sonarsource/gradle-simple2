package com.srt.hello;

import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Hello {

  public static String GREETING = "Hello world!";

  public static void main(String []args) {
    new Hello().hello(GREETING);
  }

  public void hello(String str) {
    System.out.println(str);
  }

  public PasswordAuthentication hotSpotExample() throws SQLException {
    Connection conn = null;
    conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
      "user=steve&password=blue"); // Sensitive
    String uname = "steve";
    String password = "blue";
    conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
      "user=" + uname + "&password=" + password); // Sensitive

    return new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Sensitive
  }
}

