package part3;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class First {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "hola", "bye", "goodbye", "adios");

        out.println("Words (with spaces):");
        /*
        Loop down the words and print each on a separate line, with two spaces in front of each word.
         */

        out.println("Words (no spaces):");
        /*
        Repeat the previous problem, but without the two spaces in front.
        This is trivial if you use the same approach as in #1, so the point here is to use a method reference.
        */

        /*
        Repeat the exercises in part2.Second, but now use map()
         */
        List<String> excitingWords = null;
        out.printf("Exciting words: %s.%n", excitingWords);

        List<String> eyeWords = null;
        out.printf("Eye words: %s.%n", eyeWords);

        List<String> upperCaseWords = null;
        out.printf("Uppercase words: %s.%n", upperCaseWords);


        /*
        Repeat the exercises in part2.First, but now use filter()
         */
        List<String> shortWords = null;
        out.printf("Short words: %s.%n", shortWords);

        List<String> wordsWithB = null;
        out.printf("B words: %s.%n", wordsWithB);

        /*
        Turn the strings into uppercase, keep only the ones that are shorter than 4 characters,
        of what is remaining, keep only the ones that contain “E”, and print the first result.
        After that try the same thing, but keep only the ones that contain "Q". Solve the problem that arises.
         */
        String funnyWord = null;
        funnyWord = null;
        out.println("Uppercase short word with 'E': " + funnyWord);

        /*
        Take the exitingWords problem above, but now output the final result as an array instead of a List.
         */
        String[] excitingWords2 = null;
        out.printf("Exciting words as array: %s.%n", Arrays.asList(excitingWords2));
    }
}
