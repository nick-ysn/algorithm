package me.bliss.algorithm.sequence;

/**
 * 归并排序
 *
 * @author lanjue
 * @version $Id: me.bliss.algorithm.sequence, v 0.1 5/9/15
 *          Exp $
 */
public class MergeSort {

    public void merge(int[] data, int start, int mid, int end) {

        int leftIndex = start;
        int rightIndex = mid + 1;
        //左边数组长度
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        final int[] leftArray = new int[leftLength];
        final int[] rightArray = new int[rightLength];

        //拷贝左边数组
        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = data[leftIndex + i];
        }
        //拷贝右边数组
        for (int i = 0; i < rightLength; i++) {
            rightArray[i] = data[rightIndex + i];
        }

        int i = 0, j = 0;
        for (int k = start; k <= end; k++) {
            if (i < leftLength && j < rightLength) {
                if (leftArray[i] < rightArray[j]) {
                    data[k] = leftArray[i];
                    i++;
                } else {
                    data[k] = rightArray[j];
                    j++;
                }
            } else if (i < leftLength) {
                while (i < leftLength) {
                    data[k] = leftArray[i];
                    i++;
                    k++;
                }
            } else {
                while (j < rightLength) {
                    data[k] = rightArray[j];
                    j++;
                    k++;
                }
            }

        }
    }

    public void mergeSort(int[] data, int start, int end) {
        if (start < end) {
            int medium = (int) Math.floor((end + start) / 2);
            mergeSort(data, start, medium);
            mergeSort(data, medium + 1, end);
            merge(data, start, medium, end);
        }
    }

}
