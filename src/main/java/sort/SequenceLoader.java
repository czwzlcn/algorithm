package sort;

import java.util.List;

/**
 * Author: czwzlcn
 * Date: 2019-02-23
 */
public interface SequenceLoader<T extends Comparable<T>> {

    List<T> loadSequence();
}
