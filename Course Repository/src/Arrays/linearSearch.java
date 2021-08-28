package Arrays;

import java.util.Scanner;

public class linearSearch {


    static int linear_search(int[] arr, int n, int key){

        for(int i=0; i<n; i++){
            //Check if current element matches with the key
            if(arr[i] == key){
                return i;
            }
        }
        //out of the loop
        return -1;
    }


    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int[] arr = {10,15,12,9,6,4,3,10,8};
        int n = arr.length;

        int key = scn.nextInt();

        int index = linear_search(arr,n,key);
        if(index!=-1){
            System.out.println(key  + " is present at index " +  index);
        }
        else{
            System.out.println(key  + " is NOT Found!");
        }

    }

}
