package util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class IntUtil {
    private static final Random RANDOM = new Random();

    private IntUtil() {}

    public static Map<Integer, Integer> countIntElements(int[] array) {
        ArrayValidationUtil.assureNotNull(array);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.compute(i, (key, value) -> value == null ? 1 : value + 1);
        }
        return map;
    }

    public static int[] generateIntArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(min, max);
        }
        return array;
    }

    public static int getRandomInt(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    public static String makeIntArrayInfo(int[] array) {
        ArrayValidationUtil.assureNotNull(array);
        return Arrays.toString(array) + " - {key, count} => " + countIntElements(array);
    }

    public static void swapInArray(int[] array, int position1, int position2) {
        int key = array[position1];
        array[position1] = array[position2];
        array[position2] = key;
    }
}