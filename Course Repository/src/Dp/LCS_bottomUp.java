package Dp;

import java.util.ArrayList;
import java.util.Collections;

public class LCS_bottomUp {


    static int lcs(String s1,String s2){
        //bottom up approach to lcs
        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dp = new int[n1+1][n2+1];


        //1,1 ... n1,n2
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){

                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    int op1 = dp[i-1][j];
                    int op2 = dp[i][j-1];
                    dp[i][j] = Math.max(op1,op2);
                }
            }
        }

        //print
	/*
	for(int i=0;i<=n1;i++){
		for(int j=0;j<=n2;j++){
			cout<<dp[i][j]<<" ";
		}
		cout<<endl;
	}
	*/

        ArrayList<Character> result = new ArrayList<>();
        int i=n1,j=n2;
        while(i!=0 && j!=0){
            if(dp[i][j]==dp[i][j-1]){
                j--;
            }
            else if(dp[i][j]==dp[i-1][j]){
                i--;
            }
            else{
                result.add(s1.charAt(i-1));
                i--;
                j--;
            }
        }
        Collections.reverse(result);

        for(char x:result){
            System.out.print(x + ",");
        }

        return dp[n1][n2];

    }

    public static void main(String[] args) {


        String s1 = "ABCD";
        String s2 = "ABEDG";

        System.out.println();
        System.out.println(lcs(s1, s2));

    }

}
