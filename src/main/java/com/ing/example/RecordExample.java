package com.ing.example;

public class RecordExample {

  public static void main(String[] args) {
    Person person = new Person("John Doe", "100 Linda Ln.");

    System.out.println(person.address());
    System.out.println(person.name());

    PersonV2 personV2 = new PersonV2("John Doe v2", "102 Linda Ln.");
    System.out.println(personV2.name());

    System.out.println(PersonV2.UNKNOWN_ADDRESS);
    System.out.println(PersonV2.unnamed("100 Linda Ln."));
  }

}
