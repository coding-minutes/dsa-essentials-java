package Arrays2d;

import java.util.ArrayList;

public class WavePrint {

    public static ArrayList<Integer> WavePrint(int m, int n, ArrayList<ArrayList<Integer>> arr)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int i, j = n - 1, wave = 1;

    /* m 	- Ending row index
        n 	- Ending column index
        i, j 	- Iterator
        wave 	- for Direction
        wave = 1 - Wave direction down
        wave = 0 - Wave direction up   */
        while (j >= 0) {

            // Check whether to go in
            // upward or downward
            if (wave == 1) {

                // Print the element of the matrix
                // downward since the value of wave = 1
                for (i = 0; i < m; i++)
                    res.add(arr.get(i).get(j));
                wave = 0;
                j--;
            }
            else {

                // Print the elements of the
                // matrix upward since the value
                // of wave = 0
                for (i = m - 1; i >= 0; i--)
                    res.add(arr.get(i).get(j));
                wave = 1;
                j--;
            }
        }
        return res;
    }

}
