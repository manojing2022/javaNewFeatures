package com.ing.example;

public class PatternMatching {

  public static void main(String[] args) {
    Object obj = getObject();
    if (obj instanceof String) {
      String s = (String) obj;
      if (s.length() > 5) {
        System.out.println(s.toUpperCase());
      } else if (obj instanceof Integer) {
        Integer i = (Integer) obj;
        System.out.println(i * i);
      }
    }
  }

  public static String getObject() {
    return "sample";
  }

}
