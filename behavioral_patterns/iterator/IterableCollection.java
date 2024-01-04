package behavioral_patterns.iterator;

import behavioral_patterns.iterator.iterator.IteratorType;

import java.util.Iterator;

public interface IterableCollection<E> {
    Iterator<E> createIterator(IteratorType type);
}
