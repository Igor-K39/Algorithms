package sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static util.IntUtil.generateIntArray;
import static util.IntUtil.swapInArray;

class AbstractArraySorterTest {
    private static final int ARRAY_LENGTH = 10;
    private static final int MIN_VALUE = 0;
    private static final int MAX_VALUE = 10;
    private final ArraySorter SORTER;
    private final int[] staticArray = {3, 5, 10, 7, 9, 8, 1, 4, 1, 0};
    private int[] sortedStaticArray;
    private int[] randomArray;
    private int[] sortedRandomArray;

    protected AbstractArraySorterTest(ArraySorter sorter) {
        this.SORTER = sorter;
    }

    @Before
    public void setUp() {
        randomArray = generateIntArray(ARRAY_LENGTH, MIN_VALUE, MAX_VALUE);
        sortedRandomArray = Arrays.copyOf(randomArray, randomArray.length);
        sortedStaticArray = Arrays.copyOf(staticArray, staticArray.length);
        Arrays.sort(sortedRandomArray);
        Arrays.sort(sortedStaticArray);
    }

    @Test
    public void doStaticSort() {
        int[] newSortedStaticArray = SORTER.sort(staticArray);
        Assert.assertArrayEquals(sortedStaticArray, newSortedStaticArray);
    }

    @Test
    public void doRandomSort() {
        int[] newRandomArray = SORTER.sort(randomArray);
        Assert.assertArrayEquals(sortedRandomArray, newRandomArray);
    }

    @Test
    public void doIncorrectRandomSort() {
        int[] newRandomArray = SORTER.sort(randomArray);
        int middle = newRandomArray.length / 2;
        int last = newRandomArray.length - 1;
        boolean fail = true;

        swapInArray(newRandomArray, middle, last);
        for (int i = 0; i < newRandomArray.length; i++) {
            if (newRandomArray[i] != randomArray[i]) {
                fail = false;
                break;
            }
        }

        if (fail) {
            Assert.fail();
        }
    }
}
