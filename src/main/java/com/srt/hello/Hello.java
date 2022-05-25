package com.srt.hello;

import java.util.logging.Logger;

public class Hello {

  public static final String GREETING = "com.srt.hello.Hello world!";

  private static final Logger LOGGER = Logger.getLogger(Hello.class.getName());

  public static void main(String []args) {
    new Hello().hello(GREETING);
  }

  public void hello(String str) {
    LOGGER.info(str);
  }

}

