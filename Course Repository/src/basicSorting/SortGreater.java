package basicSorting;

import java.util.Arrays;
import java.util.Collections;

public class SortGreater {



    public static void main(String[] args){

        Integer[] arr = {10,9,8,6,5,4,3,2,11,16,8};

        Arrays.sort(arr, Collections.reverseOrder());


        for(int k: arr){
            System.out.println(k);
        }


    }

}
