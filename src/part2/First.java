package part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.System.out;

public class First {

    /*
    Implement the static method called allMatches.
    It should take a List of Strings and a Predicate<String>, and return a new List of all the values that passed the test.
     */

    public static List<String> allMatches(List<String> candidates,
                                          Predicate<String> matchFunction) {
        List<String> results = new ArrayList<>();
        for (String possibleMatch : candidates) {
            //implement
        }
        return (results);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
        out.printf("Original words: %s.%n", words);

        /*
        Generate a list containing only words with less than four characters
        Replace null with a lambda expression.
         */
        List<String> shortWords = allMatches(words, null);
        out.printf("Short words: %s.%n", shortWords);

        /*
        Generate a list containing only words that contain the letter "b"
        Replace null with a lambda expression.
         */
        List<String> wordsWithB = allMatches(words, null);
        out.printf("B words: %s.%n", wordsWithB);
    }
}
