package me.bliss.algorithm.sequence.test;

import me.bliss.algorithm.sequence.InsertionSort;
import org.apache.commons.lang.ArrayUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 *
 * @author lanjue
 * @version $Id: me.bliss.algorithm.sequence.test, v 0.1 5/9/15
 *          Exp $
 */
public class InsertionSortTest extends Assert {

    private InsertionSort insertionSort;

    private int[] beforeData = new int[] { 8, 5, 1, -2, 11, -9, 53 };

    private int[] sortedData = new int[] { -9, -2, 1, 5, 8, 11, 53 };

    private int[] reversedData = new int[] { 53, 11, 8, 5, 1, -2, -9 };

    @BeforeClass
    public void before() {
        insertionSort = new InsertionSort();
    }

    @AfterClass
    public void after() {

    }

    @Test
    public void testSort() throws Exception {
        assertNotNull(insertionSort);
        final int[] sort = insertionSort.sort(beforeData);
        assertTrue(ArrayUtils.isEquals(sort, sortedData));
    }

    @Test
    public void testReverse() throws Exception {
        assertNotNull(insertionSort);
        final int[] reverse = insertionSort.reverse(beforeData);
        assertTrue(ArrayUtils.isEquals(reverse,reversedData));
    }
}
