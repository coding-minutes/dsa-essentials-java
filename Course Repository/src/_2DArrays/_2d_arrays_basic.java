package _2DArrays;

import java.util.Scanner;

public class _2d_arrays_basic {
    static void print(int arr[][], int n,int m){

        //Print
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){

        //constrain
        int[][] arr = new int[1000][100];
        //n rows m columns
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(),m = scn.nextInt();


        //take input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 arr[i][j] = scn.nextInt();
            }
        }
        //print the array
        print(arr,n,m);
    }

}
