package Arrays;

public class Kadanes {


    static int maximum_subarray_sum(int arr[],int n){

        int cs = 0;
        int largest = 0;

        for(int i=0;i<n;i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            largest = Math.max(largest, cs);
        }

        return largest;
    }


    public static void main(String[] args){
        //Array Containing
        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;

        System.out.println(maximum_subarray_sum(arr, n));
    }

}
