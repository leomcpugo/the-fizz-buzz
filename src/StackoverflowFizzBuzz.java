package src;

import java.util.stream.IntStream;

/// FizzBuzz found on stackoverflow
class FizzBuzz {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}