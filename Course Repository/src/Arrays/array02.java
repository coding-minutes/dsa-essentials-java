package Arrays;

public class array02 {

    static void printArray(int[] arr, int n){


        System.out.println("In Function "+ arr.length);
        arr[0] = 100;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }


    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};

        int n  = arr.length;



        printArray(arr,n);

        System.out.println("In main " + arr.length);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }

}
