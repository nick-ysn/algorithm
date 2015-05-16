package me.bliss.algorithm.sequence.test;

import me.bliss.algorithm.sequence.MergeSort;
import org.apache.commons.lang.ArrayUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 *
 * @author lanjue
 * @version $Id: me.bliss.algorithm.sequence.test, v 0.1 5/16/15
 *          Exp $
 */
public class MergeSortTest extends Assert {

    private MergeSort mergeSort;

    @BeforeClass
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    public void testMergeSort() throws Exception {
        assertNotNull(mergeSort);
        int[] data = new int[] { 2, 4, 1, -1, 0, 3, 8, -5 };
        int[] sortedArray = new int[] { -5, -1, 0, 1, 2, 3, 4, 8 };
        mergeSort.mergeSort(data, 0, data.length - 1);
        assertTrue(ArrayUtils.isEquals(data, sortedArray));
    }
}
