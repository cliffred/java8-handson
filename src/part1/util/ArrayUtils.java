package part1.util;

import java.util.Arrays;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> void printArray(T[] entries) {
        System.out.println(Arrays.asList(entries));
    }
}