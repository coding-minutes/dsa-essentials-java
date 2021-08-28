package Recursion;

import java.util.Scanner;

public class factorial {

    static int fact(int n){
        //base case
        if(n==0){
            return 1;
        }
        //rec case
        int ans = n*fact(n-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fact(n));
    }


}
