package Recursion;

public class bubbleSortRecur {


    static boolean compare(int a,int b){
        return a > b;
    }

    //Sort the elements in increasing order
    static void bubble_sort_rec(int a[],int n){

        //base case
        if(n==1){
            return;
        }

        for(int j=0;j<n-1;j++){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        bubble_sort_rec(a,n-1);
    }

    static void bubble_sort_rec_2(int a[],int n,int j){

        //base case
        if(n==1 || n==0){
            return;
        }
        if(j==n-1){
            //reduce the problem size, and reset j to 0
            bubble_sort_rec_2(a,n-1,0);
            return;
        }
        if(a[j]>a[j+1]){
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
        }
        bubble_sort_rec_2(a,n,j+1);
    }




    public static void main(String[] args){
        int[] arr = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;

        bubble_sort_rec_2(arr,n,0);

        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}
