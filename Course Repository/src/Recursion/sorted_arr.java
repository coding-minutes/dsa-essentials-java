package Recursion;



public class sorted_arr {



    static boolean isSortedTwo(int arr[],int i,int n){
        if(i==n-1){
            return true;
        }
        if(arr[i]<arr[i+1] && isSortedTwo(arr,i+1,n)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {



        int arr[] = {1,2,3,5,16,7};
        int n = arr.length;

        System.out.println(isSortedTwo(arr,0,n));


    }
}
