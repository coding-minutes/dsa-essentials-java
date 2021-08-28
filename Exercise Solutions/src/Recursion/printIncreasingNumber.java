package Recursion;

import java.util.ArrayList;

public class printIncreasingNumber {


    void help(int i, int n, ArrayList<Integer> v)
    {
        if(i > n) return;
        v.add(i);
        help(i+1, n, v);
    }

    ArrayList<Integer> increasingNumbers(int N) {
        ArrayList<Integer> v = new ArrayList<>();
        help(1, N, v);
        return v;
    }
}
