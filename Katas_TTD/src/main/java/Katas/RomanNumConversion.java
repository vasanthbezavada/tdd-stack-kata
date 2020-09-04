package Katas;

public class RomanNumConversion {

    public static String convertToDecimal(String roman) {
        roman = roman.toUpperCase();
        int answer = 0;
        if (checkValidity(roman)) {
            for (int i = 0; i < roman.length(); i++) {
                int temp = valueOfChar(roman.charAt(i));
                if (i+1 < roman.length()) {
                    int nextToTemp = valueOfChar(roman.charAt(i + 1));
                    if (temp >= nextToTemp) {
                        answer = answer + temp;
                    } else {
                        answer = answer + nextToTemp - temp;
                        i++;
                    }
                } else {
                    answer = answer + temp;
                    i++;
                }
            }
            return String.valueOf(answer);
        }
        return "Not a Roman";
    }

    public static boolean checkValidity(String roman) {
        char[] romanChar = roman.toCharArray();
        for (int i = 0; i < romanChar.length-2; i++) {
            if (valueOfChar(romanChar[i]) <= valueOfChar(romanChar[i + 1])) {
                if (valueOfChar(romanChar[i + 1]) < valueOfChar(romanChar[i + 2])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int valueOfChar(char c) {
        if (c == 'I')
            return 1;
        else if (c == 'V')
            return 5;
        else if (c == 'X')
            return 10;
        else if (c == 'L')
            return 50;
        else if (c == 'C')
            return 100;
        else if (c == 'D')
            return 500;
        else if (c == 'M')
            return 1000;
        else
            return -1;
    }
}
