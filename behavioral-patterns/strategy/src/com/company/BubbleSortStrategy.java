package com.company;

import java.util.List;

public class BubbleSortStrategy<T extends Comparable<T>> implements SortStrategy<T> {
    @Override
    public void sort(List<T> values) {
        for (int i = 1; i < values.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (values.get(j).compareTo(values.get(j + 1)) > 0) {
                    T tmp = values.get(j);
                    values.set(j, values.get(j+1));
                    values.set(j+1, tmp);
                }
            }
        }
    }
}
