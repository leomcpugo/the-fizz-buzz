package src;

public class LeoFizzBuzz {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            boolean isMultipleFirst = (i % 3) == 0;
            boolean isMultipleSecond = (i % 5) == 0;

            String output = null;

            if (isMultipleFirst && isMultipleSecond)
                output = "FizzBuzz";
            else if (isMultipleFirst)
                output = "Fizz";
            else if (isMultipleSecond)
                output = "Buzz";
            else
                output = String.valueOf(i);

            System.out.println(output);
        }
    }
}