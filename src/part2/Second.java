package part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Second {

    /*
    Implement the static method called transformedList.
    It should take a List of Strings and a Function<String,String>
    and return a new List that contains the results of applying the Function to each element of the original List.
     */

    public static List<String> transformedList(List<String> originals,
                                               Function<String, String> transformer) {
        List<String> results = new ArrayList<>();
        for (String original : originals) {
            results.add(transformer.apply(original));
        }
        return (results);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");
        System.out.printf("Original words: %s.%n", words);

        /*
        Append an exclamation mark (!) to each word in the list
        Replace null with a lambda expression.
         */
        List<String> excitingWords = transformedList(words, s -> s + "!");
        System.out.printf("Exciting words: %s.%n", excitingWords);

        /*
        Replace every letter "i" with the word "eye"
        Replace null with a lambda expression.
         */
        List<String> eyeWords = transformedList(words, s -> s.replace("i", "eye"));
        System.out.printf("Eye words: %s.%n", eyeWords);

        /*
        Convert every item to upper case
        Replace null with a lambda expression.
         */
        List<String> upperCaseWords = transformedList(words, String::toUpperCase);
        System.out.printf("Uppercase words: %s.%n", upperCaseWords);
    }
}
