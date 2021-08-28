package Bitmasking;

import java.util.Scanner;

public class common_ops {


    static int getIthBit(int n,int i){
        int mask = (1<<i);
        return (n & mask) > 0 ? 1 : 0;
    }

    static int setIthBit(int n,int i){

        int mask = (1<<i);
        n = (n|mask);
        return n;
    }

    static int clearIthBit(int n,int i){

        int mask = ~(1<<i);
        n = n & mask;
        return n;
    }

    static int updateIthBit(int n,int i,int v){
        clearIthBit(n,i);
        int mask = (v<<i);
        n = n|mask; //sets the right value
        return n;
    }

    static int clearLastIBits(int n,int i){
        int mask = (-1 << i);
        n = n & mask;
        return n;
    }

    static int clearBitsInRange(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int mask = a|b;
        n = n & mask;
        return n;
    }


    public static void main(String[] args){

        int n = 31;
        Scanner scanner = new Scanner(System.in);
//        int i=1;
//        int j=3;
//        i = scanner.nextInt();
//        System.out.println(getIthBit(n,i));
//        n = setIthBit(n,i);
//        n = clearIthBit(n,i);
//        n = updateIthBit(n,i,0);
//        n = clearLastIBits(n,i);
//        n = clearBitsInRange(n,i,j);
//
//        System.out.println(n);
    }
}
