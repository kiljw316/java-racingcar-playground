package 문자열_덧셈_계산기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Delimiter {

    private final List<String> delimiters = new ArrayList<>(Arrays.asList(",", ":"));
    private final StringBuilder pattern = new StringBuilder();

    // 주 생성자
    public Delimiter() {
    }

    public String pattern() {
        for (String delimiter : delimiters) {
            pattern.append(delimiter);
            pattern.append("|");
        }
        pattern.deleteCharAt(pattern.length() - 1);
        return pattern.toString();
    }

    public String addPattern(String formula) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(formula);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            pattern.append(customDelimiter);
            pattern.append("|");
        }

        return matcher.group(2);
    }

}
