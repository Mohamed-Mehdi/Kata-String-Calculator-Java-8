package com.Viseo.KataStringCalculator;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by MSA3513 on 22/08/2016.
 */

class KataStringCalculator {
    private static Integer sum;

    static int add(String numbers) {
        sum = 0;
        if (numbers == null || numbers.length() < 1) {
            return 0;
        }

        //Edit the numbers to add, in the method getValBySign we should have the first char as a sign(+ or -) and end
        //with a non numeric value.
        String rectifiedNumbers = Character.isDigit(numbers.charAt(0)) ? "+" + numbers + "+" : numbers + "+";

        Consumer<String> plus = a -> sum += Integer.parseInt(a);
        Consumer<String> minus = a -> sum -= Integer.parseInt(a);
        getValBySign(rectifiedNumbers, "+").forEach(plus);
        getValBySign(rectifiedNumbers, "-").forEach(minus);

        return sum;
    }

    private static List<String> getValBySign(String s, String separator) {
        List<String> allVal = new LinkedList<>();
        for (int i = 1; i < s.length(); i++) {
            //to verify whether our number is + or minus, we check the char before this actual number
            //if it equal our separator then we add it to our list.
            if (Character.isDigit(s.charAt(i)) && Character.toString(s.charAt(i - 1)).equals(separator)) {
                //check the first numeric val, if the next char is numeric we concatenate both number
                //else we add to our list a one letter number.
                if (Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i + 1))) {
                    allVal.add(Character.toString(s.charAt(i)) + s.charAt(i + 1));
                    i++;
                } else {
                    allVal.add(Character.toString(s.charAt(i)));
                }
            }
        }
        return allVal;
    }
}
