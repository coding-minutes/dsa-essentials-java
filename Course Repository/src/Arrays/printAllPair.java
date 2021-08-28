package Arrays;

public class printAllPair {
    static void printSubarrays(int arr[],int n){

        for(int i=0;i<n;i++){
            for(int j=i; j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + ",");
                }
                System.out.println();
            }

        }

    }

// Print the sum of each subarray & find out the largest sum


    public static void main(String[] args){
        //Array Containing

        int arr[] = {-2,3,4,5,-12,6,2,3};
        int n = arr.length;

        printSubarrays(arr,n);

    }

}
