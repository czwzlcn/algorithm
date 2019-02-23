package sort.loader;

import sort.SequenceLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Author: czwzlcn
 * Date: 2019-02-23
 */
public class ScrambledSequenceLoader implements SequenceLoader<Integer> {

    private int n;

    private int min;

    private int max;

    public ScrambledSequenceLoader(int n, int min, int max) {

        //check
        if (min <= max) {
            throw new IllegalArgumentException("边界最小值不能大于边界 最大值");
        }

        this.n = n;
        this.min = min;
        this.max = max;

    }

    public ScrambledSequenceLoader(int n) {
        this.n = n;
    }

    public List<Integer> loadSequence() {

        Random random = new Random();

        List<Integer> rlt = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            int v = random.nextInt();
            if(min<= v&& v <= max) rlt.add(v);
        }


        return rlt;
    }
}
