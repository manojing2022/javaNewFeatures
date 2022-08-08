package com.ing.example;

import static java.time.Month.AUGUST;
import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;
import static java.time.Month.AUGUST;
import static java.time.Month.JUNE;

public class SwitchExpressionsV2 {

  public static int main(String[] args) {
    var day = MONDAY;
    var month = AUGUST;

    var result2 = switch (month) {
      case JANUARY, JUNE, JULY -> 3;
      case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 1;
      case MARCH, MAY, APRIL, AUGUST -> 2;
    };

    var result = switch (day) {
      case MONDAY, FRIDAY, SUNDAY -> 6;
      case TUESDAY -> 7;
      case THURSDAY, SATURDAY -> (int) Math.pow(2, 3);
      case WEDNESDAY -> {
        int three = 1 + 2;
        yield three * three;
      }
      default -> throw new IllegalStateException("Invalid day" + day);
    };

    System.out.println(result);

    switch (day) {
      case MONDAY, FRIDAY, SUNDAY -> {
        return 6;
      }
      case TUESDAY -> {
        return 7;
      }
      case THURSDAY, SATURDAY -> {
        return (int) Math.pow(2, 3);
      }
      case WEDNESDAY -> {
        int three = 1 + 2;
        return three * three;
      }
      default -> throw new IllegalStateException("Invalid day" + day);
    }// switch expression its not possible


  }

}
