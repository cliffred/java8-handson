package part1.assignments;

import part1.model.TwoStringPredicate;

public class Second {
    /*
    Implement the static method betterString below.
    For arguments, this method takes two Strings and a lambda that says whether the first of the two is “better”.
    The method should return that better String; i.e. if the lambda returns true the method should return the first String,
    otherwise it should return the second String.
    For the lambda, define a functional interface called model.TwoStringPredicate with a method that takes two Strings
    and returns true if the first is “better” than the second, false otherwise. Bonus points if you use generics instead of Strings.
     */

    public static String betterString(String s1, String s2,
                                      TwoStringPredicate tester) {
        if(tester.isBetter(s1, s2)) {
            return(s1);
        } else {
            return(s2);
        }
    }

    public static void main(String[] args) {
        String test1 = "Hello";
        String test2 = "Goodbye";
        String message = "Better of %s and %s based on %s is %s.%n";

        String result1 = betterString(test1, test2, (s1, s2) -> s1.length() > s2.length());
        System.out.printf(message, test1, test2, "length", result1);

        String result2 = betterString(test1, test2, (s1, s2) -> true);
        System.out.printf(message, test1, test2, "1st arg", result2);
    }

}
