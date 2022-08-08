package com.ing.example;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalVariables {

  static
  {
    String x = "Hi there";
    System.out.println(x);
  }

  Integer x;

  public LocalVariables(int param){

  }

  public static void main(String[] args) throws IOException {
    URL url = new URL("http://javamodularity.com");
    URLConnection connection = url.openConnection();
    Map<Integer, String> mapNames = new HashMap<>();
    List<String> names = List.of("Julie", "Robert", "Chris", "Joseph");

    int counter = 0;
    counter = counter + 1;
    Integer[] array = {1, 2, 3, 4};
    int age;

    String data = null;

    for ( int object : array){
      System.out.println( object );
    }

    for ( int i = 0 ; i < array.length; i++ ){
      System.out.println( array[i] );
    }

    try{

    } catch(Exception ex){

    }

  }
  public String demoMethod(){
    return null;
  }

  public Integer demoMethod2( int input ){
      return null;
    }

}
