package com.ing.example;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
    var mapNames = new HashMap<Integer,String>();
    var names = List.of("Julie", "Robert", "Chris", "Joseph");
    var values = new ArrayList<String>();

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

    var arrInteger = new Integer[]{5, 9, 3, 6, 2, 4, 8, 7, 1};
    long cnt = Arrays.stream(arrInteger).filter(
        ( var a) -> (a != null && a > 5)).count();
    System.out.println(cnt);

  }
  public var demoMethod(){ //Not allowed in method return type
    return null;
  }

  public Integer demoMethod2( var input ){ //Not allowed as parameter
      return null;
    }

  void removeIfLonger(Map<? extends String, ? extends String> map, int maxLength) {

    for (var iter = map.entrySet().iterator(); iter.hasNext();) {
      var entry = iter.next();
      if (entry.getValue().length() > maxLength) {
        iter.remove();
      }
    }
  }
}
