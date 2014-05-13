package part1.assignments;

import java.util.Arrays;

import static java.lang.System.out;
import static part1.util.ArrayUtils.printArray;

public class First {
    public static void main(String[] args) {
        String[] words = {"hi", "hello", "hola", "bye", "goodbye", "adios"};
        out.print("Original array: ");
        printArray(words);

        /*
        Notes:
        the compare method of Comparator should return a negative number if the first entry is “less” than the second,
        a positive number if the first entry is “greater” than the second,
        and 0 if they are the same. See the JavaDoc API for details.
         */


        /*
        Sort the words array by length.
        Replace null with a lambda expression.
         */
        Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
        out.print("Sorted by length ascending: ");
        printArray(words);

        /*
        Sort the words array by first letter.
        Replace null with a lambda expression.
         */
        Arrays.sort(words, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        out.print("Sorted by first letter : ");
        printArray(words);

        /*
        Sort the words that contain “e” first, everything else second.
        For the logic you can check the eChecker method below.
        Replace null with a lambda expression.
         */
        Arrays.sort(words, (s1, s2) ->
        { int compareFlag = 0;
            if(s1.contains("e") && !s2.contains("e")) {
                compareFlag = -1;
            } else if(s2.contains("e") && !s1.contains("e")) {
                compareFlag = 1;
            }
            return(compareFlag);
        });
        out.print("Sorted by whether it contains 'e' [v1] : ");
        printArray(words);

        /*
        For the last sorting example (strings with “e” first),
        move the logic that computes the number to a separate static method.
        For example, StringUtils.eChecker(s1, s2) will return -1 if s1 is
        “less” (i.e., it contains “e” but s2 doesn’t),
        1 if s1 is “greater”, and 0 otherwise.
        Now, redo the final lambda sorting example, but use a method reference in place of an explicit lambda.
        Replace null with a method reference.
         */
        Arrays.sort(words, First::eChecker);
        out.print("Sorted by whether it contains 'e' [v2] : ");
        printArray(words);
    }

    public static int eChecker(String s1, String s2) {
        int compareFlag = 0;
        if (s1.contains("e") && !s2.contains("e")) {
            compareFlag = -1;
        } else if (s2.contains("e") && !s1.contains("e")) {
            compareFlag = 1;
        }
        return (compareFlag);
    }
}
