package Arrays;

public class SubArraySum {

    static int largestSubarraySum1(int arr[],int n){

        int largest_sum = 0;

        for(int i=0;i<n;i++){
            for(int j=i; j<n; j++){

                int subarraySum = 0;

                for(int k=i; k<=j; k++){
                    //cout<<arr[k] <<",";
                    subarraySum += arr[k];
                }
                //put a check is subarraySum > largest_sum
                largest_sum = Math.max(largest_sum,subarraySum);

            }
        }
        return largest_sum;
    }
    // Prefix Sum Approach O(N^2)
    static int largestSubarraySum2(int[] arr, int n){

        //Prefix Sums
        int[] prefix = new int[100];
        prefix[0] = arr[0];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //largest sum login
        int largest_sum = 0;

        for(int i=0;i<n;i++){
            for(int j=i; j<n; j++){
                int subarraySum = i>0 ? prefix[j] - prefix[i-1] : prefix[j];
                //put a check is subarraySum > largest_sum
                largest_sum = Math.max(largest_sum,subarraySum);

            }
        }
        return largest_sum;
    }

    public static void main(String[] args){
        //Array Containing
        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;

        System.out.println(largestSubarraySum1(arr, n));
        System.out.println(largestSubarraySum2(arr, n));


    }

}
