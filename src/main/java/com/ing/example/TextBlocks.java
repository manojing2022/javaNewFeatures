package com.ing.example;

public class TextBlocks {

  private static final String JSON_STRING = """
          {
          "name" : "ing",
          "website" : "https://www.ing.nl/"
          }
      """;
  private static final String JSON_STRING_ESCAPE = """
          {
          "name" : "ing",
          "website" : "https://www.ing.nl/"
          }\
      """;

  private static final String JSON_STRING_SPACE = """
          |one          \s
          |two                   
      """;

  public static void main(String[] args) {
    System.out.println(JSON_STRING);
    System.out.println("=====================================");
    System.out.println(JSON_STRING_ESCAPE);
    System.out.println("=====================================");
    System.out.println(JSON_STRING_SPACE);
  }
}
