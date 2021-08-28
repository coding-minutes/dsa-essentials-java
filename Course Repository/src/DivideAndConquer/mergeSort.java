package DivideAndConquer;

import java.util.ArrayList;

public class mergeSort {


    //helper method
    static void merge(int[] array,int s,int e){
        int i = s;
        int m = (s+e)/2;
        int j = m + 1;

        ArrayList<Integer> temp = new ArrayList<>();


        while(i<=m && j<=e){
            if(array[i] < array[j]){
                temp.add(array[i]);
                i++;
            }
            else{
                temp.add(array[j]);
                j++;
            }
        }

        //copy rem elements from first array
        while(i<=m){
            temp.add(array[i++]);
        }

        // or copy rem elements from second array
        while(j<=e){
            temp.add(array[j++]);
        }

        //copy back the eleemtns from temp to original array
        int k = 0 ;
        for(int idx = s; idx <=e ;idx++){
            array[idx] = temp.get(k++);
        }
    }

    //sorting method
    static void mergesort(int[] arr,int s,int e){
        //base case
        if(s>=e){
            return;
        }
        //rec case
        int mid = (s+e)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid+1,e);
        merge(arr,s,e);
    }

    public static void main(String[] args) {

        int[] arr = new int[]{10,5,2,0,7,6,4};

        int s = 0;
        int e = arr.length-1;
        mergesort(arr,s,e);
        for(int x : arr){
            System.out.print(x  + " ");
        }
        System.out.println();
    }


}
