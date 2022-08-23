package com.ing.example.sealed.records;

public sealed interface Vehicle permits Car, Truck {

    String getRegistrationNumber();

}
