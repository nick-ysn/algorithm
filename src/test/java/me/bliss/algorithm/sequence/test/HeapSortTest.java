package me.bliss.algorithm.sequence.test;

import me.bliss.algorithm.sequence.HeapSort;
import org.apache.commons.lang.ArrayUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 *
 * @author lanjue
 * @version $Id: me.bliss.algorithm.sequence.test, v 0.1 6/29/15
 *          Exp $
 */
public class HeapSortTest extends Assert {

    private HeapSort heapSort;

    private int[] a = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };

    @BeforeClass
    public void before() {
        heapSort = new HeapSort();
    }

    @AfterClass
    public void after() {

    }

    @Test
    public void testSort() throws Exception {
        final int[] array = heapSort.headSort(a);
        int[] sortedArray = { 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
        assertTrue(ArrayUtils.isEquals(array, sortedArray));
    }
}
