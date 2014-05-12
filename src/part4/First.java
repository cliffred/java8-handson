package part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class First {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
        out.printf("Original words: %s.%n", words);

        /*
        Produce a single String that is the result of concatenating the uppercase versions of all of the Strings.
        E.g., the result should be "HIHELLO...". Use a single reduce operation, without using map.
         */
        String upperCaseWords = words.stream().reduce(null, null);
        System.out.printf("Single uppercase String: %s.%n", upperCaseWords);

        /*
        Produce the same String as above,
        but this time via a map operation that turns the words into upper case,
        followed by a reduce operation that concatenates them.
         */
        String upperCaseWords2 = null;
        out.printf("Single uppercase String: %s.%n", upperCaseWords2);

        /*
        Produce a String that is all the words concatenated together,
        but with commas in between. E.g., the result should be "hi,hello,...".
        Note that there is no comma at the beginning, before “hi”, and also no comma at the end, after the last word.
         */
        String wordsWithCommas = null;
        out.printf("Comma-separated String: %s.%n", wordsWithCommas);


        /*
        randomNumberList is a static method that produces a List of a specified length of random numbers.
        Implement randomNumberStream. Hint use Stream.generate and limit.
         */
        out.printf("3 random nums: %s.%n", randomNumberList(3));

        /*
        orderedNumberList is a static method that produces a list of numbers that go in order by a step size.
        Implement orderedNumberStream. Hint use Stream.iterate and limit.
         */
        out.printf("10 numbers starting at 50, by 5's: %s.%n", orderedNumberList(50, 5, 10));
    }

    public static Stream<Double> randomNumberStream(int size) {
        return null;
    }

    public static List<Double> randomNumberList(int size) {
        return (randomNumberStream(size).collect(toList()));
    }

    public static Stream<Integer> orderedNumberStream(int initialNum, int stepSize, int size) {
        return (Stream.iterate(initialNum, n -> n + stepSize).limit(size));
    }

    public static List<Integer> orderedNumberList(int initialNum, int stepSize, int size) {
        return (orderedNumberStream(initialNum, stepSize, size).collect(toList()));
    }
}
