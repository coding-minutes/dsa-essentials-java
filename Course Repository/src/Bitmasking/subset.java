package Bitmasking;

import java.util.Arrays;
import java.util.Scanner;

public class subset {

    public static void main(String[] args){

            // your code goes here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = n - i;
        }


        long start_time = System.currentTimeMillis();
        Arrays.sort(arr);
        long end_time = System.currentTimeMillis();

        System.out.print(end_time - start_time);



    }
}
