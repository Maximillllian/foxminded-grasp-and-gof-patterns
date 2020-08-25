package com.company;

import java.util.List;

public class QuickSortStrategy<T extends Comparable<T>> implements SortStrategy<T> {

    @Override
    public void sort(List<T> values) {
        int currentMinIdx = 0;
        int currentMaxIdx = values.size() - 1;
        sort(values, currentMinIdx, currentMaxIdx);
    }

    private void sort(List<T> values, int currentMinIdx, int currentMaxIdx) {
        if (currentMinIdx >= currentMaxIdx) {
            return;
        }

        var pivotIdx = partition(values, currentMinIdx, currentMaxIdx);

        sort(values, currentMinIdx, pivotIdx);
        sort(values, pivotIdx + 1, currentMaxIdx);
    }

    private int partition(List<T> values, int currentMinIdx, int currentMaxIdx) {

        var pivot = getPivot(values, currentMinIdx, currentMaxIdx);
        int leftIdx = currentMinIdx;
        int rightIdx = currentMaxIdx;

        do {
            while (values.get(leftIdx).compareTo(pivot) < 0) {
                leftIdx++;
            }
            while (values.get(rightIdx).compareTo(pivot) > 0) {
                rightIdx--;
            }

            if (leftIdx < rightIdx) {
                T tmp = values.get(leftIdx);
                values.set(leftIdx, values.get(rightIdx));
                values.set(rightIdx, tmp);
                leftIdx++;
                rightIdx--;
            }

        } while (leftIdx < rightIdx);

        return rightIdx;
    }

    private T getPivot(List<T> values, int minIdx, int maxIdx) {
        int idx = getPivotIdx(minIdx, maxIdx);
        return values.get(idx);
    }

    private int getPivotIdx(int minIdx, int maxIdx) {
        return (minIdx + maxIdx) / 2;
    }
}
