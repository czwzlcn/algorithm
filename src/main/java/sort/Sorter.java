package sort;

import java.util.List;

public interface Sorter<T extends Comparable<T>> {

    List<T> sort(SequenceLoader<T> loader);
}
