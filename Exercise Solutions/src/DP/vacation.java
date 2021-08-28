package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class vacation {


    int topDown(ArrayList<int[]> v, int n, int i, int dp[][], int prev)
    {
        if (i == n) return 0;
        if (dp[i][prev] != -1) return dp[i][prev];

        int op1 = Integer.MIN_VALUE, op2 = Integer.MIN_VALUE, op3 = Integer.MIN_VALUE;

        if (prev != 1) op1 = (v.get(i)[0]) + topDown(v, n, i + 1, dp, 1);
        if (prev != 2) op2 = (v.get(i)[1]) + topDown(v, n, i + 1, dp, 2);
        if (prev != 3) op3 = (v.get(i)[2]) + topDown(v, n, i + 1, dp, 3);

        return dp[i][prev] = Math.max(op1, Math.max(op2, op3));
    }

    int vacation(int[] a, int[] b, int[] c)
    {
        ArrayList<int[]> v = new ArrayList<>();
        int n = a.length;

        for(int i = 0; i < n; i++)
        {
            v.add(new int[]{a[i], b[i], c[i]});
        }

        int[][] dp = new int[n][4];
        for(int[] vv: dp){
            Arrays.fill(vv, -1);
        }
        return topDown(v, n, 0, dp, 0);
    }

}
