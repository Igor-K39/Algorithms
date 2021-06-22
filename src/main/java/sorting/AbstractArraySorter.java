package sorting;

import static util.ArrayValidationUtil.*;

public abstract class AbstractArraySorter implements ArraySorter {
    @Override
    public int[] sort(int[] array) {
        assureNotNull(array);

        if (isSingle(array) || isEmpty(array)) {
            return array;
        }

        int[] sorted = new int[array.length];
        System.arraycopy(array, 0, sorted, 0, array.length);
        doSort(sorted);
        return sorted;
    }

    protected abstract void doSort(int[] array);
}
