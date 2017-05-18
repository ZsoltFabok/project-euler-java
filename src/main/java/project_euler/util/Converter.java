package project_euler.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Converter {
    @SuppressWarnings("serial")
    private static Map<Integer, String> numbers() {
        return Collections.unmodifiableMap(new HashMap<Integer, String>() {
            {
                put(0, "");
                put(1, "one");
                put(2, "two");
                put(3, "three");
                put(4, "four");
                put(5, "five");
                put(6, "six");
                put(7, "seven");
                put(8, "eight");
                put(9, "nine");
                put(10, "ten");
                put(11, "eleven");
                put(12, "twelve");
                put(13, "thirteen");
                put(14, "fourteen");
                put(15, "fifteen");
                put(16, "sixteen");
                put(17, "seventeen");
                put(18, "eighteen");
                put(19, "nineteen");
                put(20, "twenty");
                put(30, "thirty");
                put(40, "forty");
                put(50, "fifty");
                put(60, "sixty");
                put(70, "seventy");
                put(80, "eighty");
                put(90, "ninety");
                put(100, "hundred");
                put(1000, "thousand");
            }
        });
    }

    public String toLetters(int number) {
        if (number >= 1000) {
            int thousands = (number / 1000);
            return numbers().get(thousands) + " thousand";
        } else if (number >= 100) {
            int hundreds = (number / 100);
            if (number - hundreds * 100 != 0) {
                return numbers().get(hundreds) + " hundred and " + toLetters(number - hundreds * 100);
            } else {
                return numbers().get(hundreds) + " hundred";
            }
        } else if (number > 20) {
            int tens = (number / 10) * 10;
            if (number - tens != 0) {
                return numbers().get(tens) + "-" + toLetters(number - tens);
            } else {
                return numbers().get(tens);
            }
        } else {
            return numbers().get(number);
        }
    }
}
