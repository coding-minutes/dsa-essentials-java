package basicSorting;

import java.util.Arrays;
import java.util.Collections;

public class inBuildSort {



    public static void main(String[] args){

        int arr[] = {10,9,8,6,5,4,3,2,11,16,8};
        int n = arr.length;

        Arrays.sort(arr);


        for(int k: arr){
            System.out.println(k);
        }


    }

}
