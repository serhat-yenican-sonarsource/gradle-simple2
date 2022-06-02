package com.srt.hello;


import java.util.StringTokenizer;

public class Hello {
  private static final String MESSAGE = "Hello";
  private static final String APP_SECRET = "secret";

  public String hello(String name) {
    return MESSAGE + name;
  }

  public static String getAppSecret() {
    return APP_SECRET;
  }

  //TODO open this part later
//  private void doSomething() {
//    System.out.println(System.currentTimeMillis());
//  }


  public void verifyEmail(String email) throws Exception {
    if(email == null) {
      System.out.println("email is null");
    }
    if(!email.contains("@")) {
      throw new Exception("invalid email");
    }
  }



}

