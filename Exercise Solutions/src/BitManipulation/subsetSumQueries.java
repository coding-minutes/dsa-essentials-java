package BitManipulation;

import java.util.ArrayList;
import java.util.BitSet;

public class subsetSumQueries{

    public static void shiftLeft(BitSet bs, int n) {
        for(int j = 0 ; j < n; j++) {
            for (int i = bs.length() - 1; i >= 0; i = bs.previousSetBit(i - 1)) {
                bs.clear(i);
                bs.set(i + 1);
            }
        }
    }

    static ArrayList<Boolean> subsetSum(int[] v, int[] q)
    {
        ArrayList<Boolean> b = new ArrayList<>();

        BitSet bit = new BitSet(10000);
        bit.clear();
        bit.set(0);

        for (int j : v) {
            BitSet bs = (BitSet) bit.clone();
            shiftLeft(bs, j);
            bit.or(bs);
        }

        for (int x : q) {
            if (bit.get(x)) {
                b.add(true);
            } else {
                b.add(false);
            }
        }

        return b;
    }

}
