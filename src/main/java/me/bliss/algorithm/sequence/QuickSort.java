package me.bliss.algorithm.sequence;

/**
 *
 *
 * @author lanjue
 * @version $Id: me.bliss.algorithm.sequence, v 0.1 1/27/16
 *          Exp $
 */
public class QuickSort {

    public int partition(int[] a, int start, int end) {
        int i = start - 1;
        int x = a[end];
        for (int j = start; j < end; j++) {
            if (a[j] <= x) {
                i = i + 1;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, end);
        return i + 1;
    }

    public void sort(int[] a, int start, int end) {
        if (start < end) {
            final int medium = partition(a, start, end);
            sort(a, start, medium - 1);
            sort(a, medium + 1, end);
        }
    }

    private void swap(int[] a, int source, int target) {
        int temp = a[source];
        a[source] = a[target];
        a[target] = temp;
    }
}
