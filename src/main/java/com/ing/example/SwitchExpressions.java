package com.ing.example;

import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

public class SwitchExpressions {

  public static void main(String[] args) {
    int day = 3;
    switch (day) {
      case MONDAY:
      case FRIDAY:
      case SUNDAY:
        System.out.println(6);
        break;
      case TUESDAY:
        System.out.println(7);
        break;
      case THURSDAY:
      case SATURDAY:
        System.out.println((int) Math.pow(2, 3));
        break;
      case WEDNESDAY:
        int three = 1 + 2;
        System.out.println(three * three);
        break;
      default:
        throw new IllegalStateException("Invalid day"+day);
    }
  }

}
