package project_euler.problems;

import java.util.Arrays;

/**
 * You are given the following information, but you may prefer to do some research for yourself.
 *
 * - 1 Jan 1900 was a Monday.
 * - Thirty days has September,
 *   April, June and November.
 *   All the rest have thirty-one,
 *   Saving February alone,
 *   Which has twenty-eight, rain or shine.
 *   And on leap years, twenty-nine.
 *
 * - A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 *
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class Problem019 {
    public long execute() {
        return calculate();
    }

    public int calculate() {
        int sundayOnTheFirstOfTheMonth = 0;
        int dayInWeek = 2;
        for (int year = 1901; year < 2001; year++) {
            for (int month = 1; month < 13; month++) {
                for (int day = 1; day < numberOfDays(year, month); day++) {
                    if (dayInWeek == 7) {
                        dayInWeek = 1;
                    } else {
                        dayInWeek++;
                    }

                    if (dayInWeek == 7 && day == 1) {
                        sundayOnTheFirstOfTheMonth++;
                    }
                }
            }
        }
        return sundayOnTheFirstOfTheMonth;
    }

    private static int numberOfDays(int year, int month) {
        if (Arrays.asList(1,3,5,7,8,10,12).contains(month)) {
            return 31;
        } else if (Arrays.asList(4,6,9,11).contains(month)) {
            return 30;
        } else {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                return 29;
            } else {
                return 28;
            }
        }
    }
}
