package com.ing.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple program that illustrates how to use Java Flight Recorder.
 *
 * This programs creates a list, inserts objects in it until
 * an OutOfMemoryError is thrown.
 *
 */

//javac -d out -sourcepath src/main src/main/java/com/ing/example/FlightRecorder.java
public class FlightRecorder {

    public static void main(String[] args) {
        List<Object> items = new ArrayList<>(1);
        try {
            while (true) {
                items.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());
        }
        assert items.size() > 0;
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
