package Dp;

import java.util.ArrayList;
import java.util.Arrays;

public class LCS {


    static int lcs(String s1,String s2,int i,int j,int[][] dp){
        //base case
        if(i==s1.length() || j==s2.length()){
            return  0;
        }
        //check if a state is already computed
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        //rec case
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 1 + lcs(s1,s2,i+1,j+1,dp);
        }

        int op1 = lcs(s1,s2,i+1,j,dp);
        int op2 = lcs(s1,s2,i,j+1,dp);
        return dp[i][j] = Math.max(op1,op2);
    }

    public static void main(String[] args) {


        String s1 = "ABCD";
        String s2 = "ABEDG";

        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1+1][n2+1];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        System.out.println( lcs(s1,s2,0,0,dp) );


        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

}
