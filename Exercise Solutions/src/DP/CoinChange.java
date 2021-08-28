package DP;

public class CoinChange {

    long coinChange(int s, int n , int[] a, long dp[][])
    {
        if (n < 0 || s < 0) return 0;
        if (s == 0) return 1;

        if (dp[s][n] != 0) return dp[s][n];

        long op1 = coinChange(s, n - 1, a, dp);
        long op2 = coinChange(s - a[n], n, a, dp);

        return dp[s][n] = op1 + op2;
    }

    long findCombinations(int n, int[] coins)
    {
        long dp[][] = new long[500][100];
        return coinChange(n, coins.length-1, coins, dp);
    }
}
