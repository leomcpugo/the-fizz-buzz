package src;

public class LeoFizzBuzz {

    // first multiple
    private static final int firstMultiple = 3;
    private static final String firstKey = "Fizz";

    // second multiple
    private static final int secondMultiple = 5;
    private static final String secondKey = "Buzz";

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            boolean isMultipleFirst = (i % firstMultiple) == 0;
            boolean isMultipleSecond = (i % secondMultiple) == 0;

            String output = null;

            if (isMultipleFirst && isMultipleSecond)
                output = firstKey + secondKey;
            else if (isMultipleFirst)
                output = firstKey;
            else if (isMultipleSecond)
                output = secondKey;
            else
                output = String.valueOf(i);

            System.out.println(output);
        }
    }
}