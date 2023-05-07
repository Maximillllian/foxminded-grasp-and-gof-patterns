package behavioral_patterns.strategy.src.com.company;

import java.util.List;

public interface SortStrategy<T extends Comparable<T>> {
    void sort(List<T> values);
}
