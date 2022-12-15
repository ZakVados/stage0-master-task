package com.epam.conditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DaysInMonth {

    public static List<Integer> uniqueNotLapYears = Arrays.asList(1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600);

    public static HashMap daysInMonth = new HashMap<Integer, Integer>() {{
        put(1, 31);
        put(2, 28);
        put(3, 31);
        put(4, 30);
        put(5, 31);
        put(6, 30);
        put(7, 31);
        put(8, 31);
        put(9, 30);
        put(10, 31);
        put(11, 30);
        put(12, 31);
    }};

    public boolean isLeapYear(int year) {
        if (uniqueNotLapYears.contains(year)) return false;
        return ((year % 4) == 0);
    }

    public void printDays(int year, int month) {
        // sanity check:
        if ((year < 0) || ( month < 1 || month > 12 )) {
            System.out.println("invalid date");
            return;
        }

        if (isLeapYear(year) && (month == 2)) {
            System.out.println(29);
        } else {
            System.out.println(daysInMonth.get(month));
        }
    }
}
