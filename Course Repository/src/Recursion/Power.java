package Recursion;

import java.util.Scanner;

public class Power {



    static int power(int a,int n){
        //base case
        if(n==0){
            return 1;
        }
        return a * power(a,n-1);
    }

    static int fastPower(int a,int n){
        if(n==0){
            return 1;
        }

        int subProb = fastPower(a,n/2);
        int subProbSq = subProb*subProb;
        if((n&1) == 1){
            return a*subProbSq;
        }
        return subProbSq;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),n = scanner.nextInt();

        System.out.println(power(a,n));
        System.out.println(fastPower(a,n));

    }
}
