public class Calculator {

    private final String pattern;

    public Calculator(String pattern) {
        this.pattern = pattern;
    }


    public Integer sum(String formula) {
        if (formula == null) {
            return 0;
        }
        return getSum(formula);
    }

    private int getSum(String formula) {
        String[] strNums = formula.split(pattern);

        int sum = 0;
        for (String strNum : strNums) {
            throwableIfNegativeNumber(strNum);
            sum += Integer.parseInt(strNum);
        }
        return sum;
    }

    private void throwableIfNegativeNumber(String strNum) {
        int parseInt = Integer.parseInt(strNum);
        if (parseInt < 0) {
            throw new RuntimeException();
        }
    }
}
