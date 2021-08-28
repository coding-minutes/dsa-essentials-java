package DivideAndConquer;

public class quickSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] a,int s,int e){

        int pivot = a[e];
        int i = s - 1;

        for(int j=s;j<e;j++){
            if(a[j] < pivot){
                i++;
                swap(a, a[i],a[j]);
            }
        }

        swap(a, a[i+1],a[e]);
        return i + 1;

    }

    static void quicksort(int[] a, int s,int e){
        //Base Case
        if(s>=e){
            return;
        }
        //Rec Case
        int p = partition(a,s,e);
        quicksort(a,s,p-1);
        quicksort(a,p+1,e);
    }


    public static void main(String[] args) {

        int[]  arr = new int[]{10,5,2,0,7,6,4};
        int n = arr.length;

        quicksort(arr,0,n-1);

        for(int x :arr){
            System.out.println(x);
        }

    }


}
