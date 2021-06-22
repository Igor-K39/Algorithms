package util;

public class ArrayValidationUtil {

    private ArrayValidationUtil() {}

    public static void assureNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
    }

    public static boolean isSingle(int[] array) {
        return array.length == 1;
    }

    public static boolean isEmpty(int[] array) {
        return array.length == 0;
    }
}
