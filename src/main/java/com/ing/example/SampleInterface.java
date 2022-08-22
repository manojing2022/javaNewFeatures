package com.ing.example;

public interface SampleInterface {

   private static void displayDetailsV2(){
    //something
  }

   private Long displayDetailsV3(){
    //something
    return 0L;
  }

//in java 8
   static void displayDetailsV1(){
    //something
  }

  default void displayDetailsV4(){
    //something
  }


}

//
