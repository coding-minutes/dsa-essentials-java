package Recursion;

import java.util.Scanner;

public class inc_dec {


    static void dec(int n){
        //base case
        if(n==0){
            return;
        }
        //towards the base case
        System.out.print(n + ",");
        dec(n-1);
    }

    static void inc(int n){
        //base case
        if(n==0){
            return;
        }
        inc(n-1);
        System.out.print(n + ",");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        dec(n);
        System.out.println();
        inc(n);

    }

}
