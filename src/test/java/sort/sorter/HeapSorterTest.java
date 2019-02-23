package sort.sorter;

import org.junit.Test;
import sort.loader.ScrambledSequenceLoader;

import java.util.List;

public class HeapSorterTest {

    @Test
    public void sort() {

        HeapSorter<Integer> heapSorter = new HeapSorter<Integer>();

        ScrambledSequenceLoader loader = new ScrambledSequenceLoader(10);

        List<Integer> sortedElList = heapSorter.sort(loader);

        assert isSorted(sortedElList);
    }

    private <T extends Comparable<? super T>> boolean isSorted(List<T> list) {

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).compareTo(list.get(i-1))>0) return false;
        }

        return true;
    }
}