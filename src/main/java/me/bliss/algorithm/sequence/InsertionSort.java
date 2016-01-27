package me.bliss.algorithm.sequence;

import org.springframework.stereotype.Component;

/**
 *
 * 插入排序
 * @author lanjue
 * @version $Id: me.bliss.algorithm.sequence, v 0.1 5/9/15
 *          Exp $
 */
@Component
public class InsertionSort {

    public int[] sort(int[] array) {
        final int[] data = array.clone();
        for (int i = 0; i < data.length - 1; i++) {
            int key = data[i + 1];
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        return data;
    }

    public int[] reverse(int[] array) {
        final int[] data = array.clone();
        for (int i = 0; i < data.length - 1; i++) {
            int key = data[i + 1];
            while (i >= 0 && data[i] < key) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        return data;
    }

}
