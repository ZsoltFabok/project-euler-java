package project_euler.util;

import java.util.Map;

public class Converter {
    @SuppressWarnings("serial")
    private static Map<Integer, String> numbers() {
        return Map.ofEntries(
                Map.entry(0, ""),
                Map.entry(1, "one"),
                Map.entry(2, "two"),
                Map.entry(3, "three"),
                Map.entry(4, "four"),
                Map.entry(5, "five"),
                Map.entry(6, "six"),
                Map.entry(7, "seven"),
                Map.entry(8, "eight"),
                Map.entry(9, "nine"),
                Map.entry(10, "ten"),
                Map.entry(11, "eleven"),
                Map.entry(12, "twelve"),
                Map.entry(13, "thirteen"),
                Map.entry(14, "fourteen"),
                Map.entry(15, "fifteen"),
                Map.entry(16, "sixteen"),
                Map.entry(17, "seventeen"),
                Map.entry(18, "eighteen"),
                Map.entry(19, "nineteen"),
                Map.entry(20, "twenty"),
                Map.entry(30, "thirty"),
                Map.entry(40, "forty"),
                Map.entry(50, "fifty"),
                Map.entry(60, "sixty"),
                Map.entry(70, "seventy"),
                Map.entry(80, "eighty"),
                Map.entry(90, "ninety"),
                Map.entry(100, "hundred"),
                Map.entry(1000, "thousand"));
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
