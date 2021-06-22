package sorting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        InsertionArraySorterTest.class,
        MergeArraySorterTest.class,
        SelectionArraySorterTest.class
})
public class AllSortingTest {
}
