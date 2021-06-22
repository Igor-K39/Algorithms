package sorting;

public class InsertionArraySorter extends AbstractArraySorter {

    @Override
    public void doSort(int[] sorted) {
        for (int j = 1; j < sorted.length; j++) {
            int key = sorted[j];
            int i = j - 1;

            while (i >= 0 && sorted[i] > key) {
                sorted[i + 1] = sorted[i];
                i--;
            }
            sorted[i + 1] = key;
        }
    }
}
