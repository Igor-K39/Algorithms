import sorting.ArraySorter;
import sorting.InsertionArraySorter;

import static util.IntUtil.generateIntArray;
import static util.IntUtil.makeIntArrayInfo;

public class SortingMain {
    private static final ArraySorter INTEGER_ARRAY_SORTER = new InsertionArraySorter();

    public static void main(String[] args) {
        int[] initial = generateIntArray(10, 0, 10);
        int[] sorted = INTEGER_ARRAY_SORTER.sort(initial);
        System.out.println(makeIntArrayInfo(initial) + "\n" + makeIntArrayInfo(sorted));
    }
}
