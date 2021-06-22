package sorting;

public class MergeArraySorter extends AbstractArraySorter {
    @Override
    protected void doSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int start, int end) {
        if (start == end) {
            return;
        }
        int middle = start + (end - start) / 2;
        mergeSort(array, start, middle);
        mergeSort(array, middle + 1, end);
        merge(array, start, middle, end);
    }

    private void merge(int[] array, int start, int middle, int end) {
        int[] leftArray = getSubArray(array, start, middle);
        int[] rightArray = getSubArray(array, middle + 1, end);
        int left = 0;
        int right = 0;
        int merged = start;

        while (left < leftArray.length && right < rightArray.length) {
            if (leftArray[left] < rightArray[right]) {
                array[merged] = leftArray[left];
                left++;
            } else {
                array[merged] = rightArray[right];
                right++;
            }
            merged++;
        }
        int leftExtra = leftArray.length - left;
        int rightExtra = rightArray.length - right;
        System.arraycopy(leftArray, left, array, merged, leftExtra);
        System.arraycopy(rightArray, right, array, merged + leftExtra, rightExtra);
    }

    private int[] getSubArray(int[] array, int start, int end) {
        int[] subArray = new int[end - start + 1];
        System.arraycopy(array, start, subArray, 0, subArray.length);
        return subArray;
    }
}