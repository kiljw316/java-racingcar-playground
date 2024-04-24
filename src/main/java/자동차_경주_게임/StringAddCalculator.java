package 자동차_경주_게임;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String text) {
        if (isNullOrEmpty(text)) {
            return 0;
        }

        int[] digits = toDigits(text);

        validateNegative(digits);

        return sum(digits);
    }

    private static boolean isNullOrEmpty(String text) {
        return text == null || text.isEmpty();
    }

    private static int[] toDigits(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens = m.group(2).split(customDelimiter);

            return Arrays.stream(tokens)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        String[] tokens = text.split("[,|:]");
        return Arrays.stream(tokens)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void validateNegative(int[] digits) {
        boolean containsNegative = Arrays.stream(digits)
                .anyMatch(digit -> digit < 0);

        if (containsNegative) {
            throw new RuntimeException();
        }

    }

    private static int sum(int[] digits) {
        return Arrays.stream(digits)
                .sum();
    }

}
