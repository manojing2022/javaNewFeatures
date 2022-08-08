package com.ing.example;



public record PersonV3(String name, String address) {
  public PersonV3(String name) {
    this(name, "Unknown");
  }

}
