package sorting;

import static util.IntUtil.swapInArray;

public class SelectionArraySorter extends AbstractArraySorter {

    @Override
    public void doSort(int[] sorted) {
        for (int i = 0; i < sorted.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < sorted.length; j++) {
                min = sorted[min] < sorted[j] ? min : j;
            }
            swapInArray(sorted, min, i);
        }
    }
}
