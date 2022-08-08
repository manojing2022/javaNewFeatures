package com.ing.example;

public class PatternMatching {

  public static void main(String[] args) {
    Object obj = getObject();
    if (obj instanceof String s) {
      if (s.length() > 5) {
        System.out.println(s.toUpperCase());
      } else if (obj instanceof Integer i) {
        System.out.println(i * i);
      }
    }

    if (obj instanceof String s && s.length() > 5) {
      System.out.println(s.toUpperCase());
    } else if (obj instanceof Integer i) {
      System.out.println(i * i);
    }

    new PatternMatching().processObject("code");
  }

  private static String s = "Hello, World!";

  private static String getObject() {
    return "sample";
  }

  private String processObject(Object obj) {

    System.out.println(s);
    if (obj instanceof String s) {
      System.out.println(s);
      System.out.println(this.s);
    }

    return null;
  }

  private String processObject2(Object obj) {

      String s =" hello";
    if (obj instanceof String s) {// error
      System.out.println(s);
      System.out.println(this.s);
    }

    return null;
  }


}
