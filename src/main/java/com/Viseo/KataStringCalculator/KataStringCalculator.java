package com.Viseo.KataStringCalculator;

import java.util.LinkedList;
import java.util.List;

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
        String rectifiedNumbers = Character.isDigit(numbers.charAt(0)) ? "+" + numbers + "+" : numbers + "+";

        getValBySign(rectifiedNumbers, "+").forEach(a -> sum += Integer.parseInt(a));
        getValBySign(rectifiedNumbers, "-").forEach(a -> sum -= Integer.parseInt(a));

        return sum;
    }

    private static List<String> getValBySign(String s, String separator) {
        List<String> allVal = new LinkedList<>();
        for (int i = 1; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) && Character.toString(s.charAt(i - 1)).equals(separator)) {
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


    private List<Integer> getNegatif(String s) {
        return null;
    }
}
