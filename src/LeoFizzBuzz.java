package src;

// Leo's take on FizzBuzz
public class LeoFizzBuzz {

    // first multiple
    private static final int firstMultiple = 3;
    private static final String firstKey = "Fizz";

    // second multiple
    private static final int secondMultiple = 5;
    private static final String secondKey = "Buzz";

    public static void main(String[] args) {

        // greetings
        System.out.println("\n***************************");
        System.out.println(String.format("GET READY FOR THE %s%s", firstKey, secondKey));
        System.out.println("***************************\n");

        // FizzBuzz
        int firstMultipleCount = 0;
        int secondMultipleCount = 0;
        int allMultipleCount = 0;

        for (int i = 1; i <= 100; i++) {

            boolean isMultipleFirst = (i % firstMultiple) == 0;
            boolean isMultipleSecond = (i % secondMultiple) == 0;

            String output = null;

            // both multiples
            if (isMultipleFirst && isMultipleSecond) {
                output = firstKey + secondKey;
                allMultipleCount++;
            }
            // first multiple only
            else if (isMultipleFirst) {
                output = firstKey;
                firstMultipleCount++;
            }
            // second multiple only
            else if (isMultipleSecond) {
                output = secondKey;
                secondMultipleCount++;
            }
            // no multiple
            else
                output = String.valueOf(i);

            System.out.println(String.format("%03d: %s", i, output));
        }

        // totals display
        System.out.println("\n***************************");
        System.out.println(String.format("%s%s COMPLETED", firstKey, secondKey));
        System.out.println(String.format("%s FOUND: %s", firstKey, firstMultipleCount));
        System.out.println(String.format("%s FOUND: %s", secondKey, secondMultipleCount));
        System.out.println(String.format("%s FOUND: %s", firstKey + secondKey, allMultipleCount));
        System.out.println("***************************\n");
    }
}