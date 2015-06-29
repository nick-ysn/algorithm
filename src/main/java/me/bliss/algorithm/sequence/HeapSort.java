package me.bliss.algorithm.sequence;

/**
 *  堆排序
 *
 * @author lanjue
 * @version $Id: me.bliss.algorithm.sequence, v 0.1 6/13/15
 *          Exp $
 */
public class HeapSort {

    //维护最大堆
    private void maxHeap(int[] a, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest;
        if (left < heapSize && a[i] < a[left]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right < heapSize && a[largest] < a[right]) {
            largest = right;
        }
        if (largest != i) {
            swap(a, largest, i);
            maxHeap(a, largest, heapSize);
        }
    }

    //构造最大堆
    private void buildMaxHeap(int[] a) {
        for (int i = (int) Math.floor((a.length - 1) / 2); i >= 0; i--) {
            maxHeap(a, i, a.length);
        }
    }

    public int[] headSort(int[] a) {
        final int[] array = a.clone();
        buildMaxHeap(array);
        int heapSize = array.length-1;
        for (int i = array.length - 1; i >= 1; i--, --heapSize) {
            swap(array, 0, i);
            maxHeap(array, 0, heapSize);
        }
        return array;
    }

    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
