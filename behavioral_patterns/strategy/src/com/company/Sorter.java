package behavioral_patterns.strategy.src.com.company;

import java.util.List;

public class Sorter<T extends Comparable<T>> {

    private SortStrategy<T> strategy;

    public void sort(List<T> values) {
        if (values.size() < 10) {
            strategy = new BubbleSortStrategy<T>();
        } else {
            strategy = new QuickSortStrategy<T>();
        }

        strategy.sort(values);
    }
}
