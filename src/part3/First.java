package part3;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;
import static java.util.stream.Collectors.toList;

public class First {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

        out.println("Words (with spaces):");
        /*
        Loop down the words and print each on a separate line, with two spaces in front of each word.
         */
        words.stream().forEach(s -> System.out.println("  " + s));

        out.println("Words (no spaces):");
        /*
        Repeat the previous problem, but without the two spaces in front.
        This is trivial if you use the same approach as in #1, so the point here is to use a method reference.
        */
        words.stream().forEach(System.out::println);

        /*
        Repeat the exercises in part2.Second, but now use map()
         */
        List<String> excitingWords = words.stream()
                .map(s -> s + "!")
                .collect(toList());
        out.printf("Exciting words: %s.%n", excitingWords);

        List<String> eyeWords = words.stream()
                .map(s -> s.replace("i", "eye"))
                .collect(toList());
        out.printf("Eye words: %s.%n", eyeWords);

        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(toList());
        out.printf("Uppercase words: %s.%n", upperCaseWords);


        /*
        Repeat the exercises in part2.First, but now use filter()
         */
        List<String> shortWords = words.stream()
                .filter(s -> s.length() < 4)
                .collect(toList());
        out.printf("Short words: %s.%n", shortWords);

        List<String> wordsWithB = words.stream()
                .filter(s -> s.contains("b"))
                .collect(toList());
        out.printf("B words: %s.%n", wordsWithB);

        /*
        Turn the strings into uppercase, keep only the ones that are shorter than 4 characters,
        of what is remaining, keep only the ones that contain “E”, and print the first result.
        After that try the same thing, but keep only the ones that contain "Q". Solve the problem that arises.
         */
        String funnyWord = words.stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() < 4)
                .filter(s -> s.contains("E"))
                .findFirst().orElse("No match");
        out.println("Uppercase short word with 'E': " + funnyWord);

        /*
        Take the exitingWords problem above, but now output the final result as an array instead of a List.
         */
        String[] excitingWords2 = words.stream()
                .map(s -> s + "!")
                .toArray(String[]::new);
        out.printf("Exciting words as array: %s.%n", Arrays.asList(excitingWords2));
    }
}
