package sort.sorter;

import sort.SequenceLoader;
import sort.Sorter;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Author: czwzlcn
 * Date: 2019-02-23
 */
public class HeapSorter<T extends Comparable<T>> implements Sorter<T> {

    public List<T> sort(SequenceLoader<T> loader) {

        List<T> toSortList = loader.loadSequence();

        Queue<T> priorityQueue = new PriorityQueue<T>(toSortList);

        return new ArrayList<T>(priorityQueue);
    }
}
