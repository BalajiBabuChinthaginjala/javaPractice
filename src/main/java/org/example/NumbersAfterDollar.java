package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersAfterDollar {
    public static void main(String[] args) {
        String sequence = "$12 $1 $2 $5 $7 $9 $6 $11 $10 $0";
        String sequence1 = "ba $2 laji $0 ppp $1 dslua";
        System.out.println(findNumbersAfterDollarSymbol1(sequence));
        System.out.println(findNumbersAfterDollarSymbol1(sequence1));
    }

    public String main3(String pattern, String fileName, String externalId) {
        String output;
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(fileName);
        List<String> list = new ArrayList<>();
        matcher.matches();
        while (matcher.find()) {
            String substring = matcher.group().trim();
            if (!substring.isEmpty()) {
                list.add(substring);
            }
        }
        output = replacePattern(externalId, list.get(0));
        return output;
    }
    public static String replacePattern(String string, String replaceValue) {
        String pattern = "\\$\\d+";
        String replacedString = string.replaceAll(pattern, replaceValue);
        return replacedString;
    }


    public static List<Integer> findNumbersAfterDollarSymbol1(String input) {
        List<Integer> numbersList = new ArrayList<>();
        String[] tokens = input.split("\\$");
        for (int i = 1; i < tokens.length; i++) {
            String numberString = tokens[i].split("\\s+")[0];
            int number = Integer.parseInt(numberString);
            numbersList.add(number);
        }
      return numbersList;
    }
}
