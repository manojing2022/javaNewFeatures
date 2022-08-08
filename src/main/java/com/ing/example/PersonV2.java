package com.ing.example;

import java.util.Objects;

public record PersonV2(String name, String address) {
  public PersonV2 {
    Objects.requireNonNull(name);
    Objects.requireNonNull(address);
  }

  public static String UNKNOWN_ADDRESS = "Unknown";


  public static Person unnamed(String address) {
    return new Person("Unnamed", address);
  }

}
