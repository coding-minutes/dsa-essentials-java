package BasicSortingAlgorithms;

import java.util.Arrays;

public class Chopsticks {
    public static int pairSticks(int[] length, int D)
    {
        // your code goes here
        Arrays.sort(length);
        int res = 0;

        for(int i=0; i<length.length-1; i++)
        {
            if (length[i + 1] - length[i] <= D) {
                res++;
                i++;
            }
        }

        return res;
    }
}
