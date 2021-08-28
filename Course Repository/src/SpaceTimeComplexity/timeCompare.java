package SpaceTimeComplexity;

import java.util.Scanner;

public class timeCompare {


    static boolean compare(int a,int b){
        return a > b;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Sort the elements in increasing order
    static void bubble_sort(int[] a,int n){

        for(int times=1;times<=n-1;times++){
            //repeated swapping
            for(int j=0; j <= n - times - 1; j++ ){
                if(compare(a[j],a[j+1])){
                    swap(a, j, j+1);
                }
            }
        }
    }


    public static void main(String[] args) {

        // your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        //Init a Reverse Sorted Array
        for(int i=0;i<n;i++){
            arr[i] = n - i;
        }


        long start_time = System.currentTimeMillis();
        //sort(arr.begin(),arr.end());
        bubble_sort(arr,n);
        long end_time = System.currentTimeMillis();

        System.out.print( end_time - start_time );

    }

}
