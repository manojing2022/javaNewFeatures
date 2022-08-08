package com.ing.example;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

public class LocalVariables {

  static
  {
    var x = "Hi there";
    System.out.println(x);
  }

  var x;  //Not allowed as class fields

  public LocalVariables(var param){ //Not allowed as parameter

  }

  public static void main(String[] args) throws IOException {
    var url = new URL("http://javamodularity.com");
    var connection = url.openConnection();
    var mapNames = new HashMap<>();
    var names = List.of("Julie", "Robert", "Chris", "Joseph");

    var counter = 0;
    counter = counter + 1;
    var array = {1, 2, 3, 4};
    var age; // not allowed uninitialized

    var data = null; // not allowed null

    for ( var object : names){
      System.out.println( object );
    }

    for ( var i = 0 ; i < names.size(); i++ ){
      System.out.println( names.get(i) );
    }

    try{

    } catch(var ex){

    }

  }
  public var demoMethod(){ //Not allowed in method return type
    return null;
  }

  public Integer demoMethod2( var input ){ //Not allowed as parameter
      return null;
    }

}
