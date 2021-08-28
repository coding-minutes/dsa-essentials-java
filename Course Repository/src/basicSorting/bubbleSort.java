package basicSorting;

public class bubbleSort {

    static boolean compare(int a,int b){
        return a > b;
    }
    static void bubble_sort(int a[],int n){

        for(int times=1;times<=n-1;times++){
            //repeated swapping
            for(int j=0; j <= n - times - 1; j++ ){
                if(compare(a[j],a[j+1])){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] =temp;
                }
            }

        }
    }




    public static void main(String[] args){
        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;


        bubble_sort(arr,n);
        for(int k: arr){
            System.out.println(k);
        }

    }

}
