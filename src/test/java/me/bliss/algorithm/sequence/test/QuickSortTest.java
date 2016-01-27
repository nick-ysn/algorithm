package me.bliss.algorithm.sequence.test;

import me.bliss.algorithm.sequence.QuickSort;
import org.apache.commons.lang.ArrayUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 *
 * @author lanjue
 * @version $Id: me.bliss.algorithm.sequence.test, v 0.1 1/27/16
 *          Exp $
 */
public class QuickSortTest extends Assert {

    private QuickSort quickSort;

    private int[] data = new int[] { 1, 8, 2, 5, 8, 8, 2, 6, 3, 2, 7 };

    private int[] reverseData = new int[] { 1, 2, 2, 2, 3, 5, 6, 7, 8, 8, 8 };

    @BeforeMethod
    public void setUp() throws Exception {
        quickSort = new QuickSort();
    }

    @Test
    public void testQuickSort() throws Exception {
        assertNotNull(quickSort);
        quickSort.sort(data, 0, data.length - 1);
        assertTrue(ArrayUtils.isEquals(data, reverseData));
    }
}
