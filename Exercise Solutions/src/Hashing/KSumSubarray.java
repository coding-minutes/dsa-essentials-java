package Hashing;

import java.util.HashMap;

public class KSumSubarray {

    int longestSubarrayKSum(int[] arr,int k){
        int n = arr.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        int pre = 0;

        int len = 0;

        for(int i=0;i<n;i++){
            pre += arr[i];

            if(pre==k){
                len = Math.max(len,i+1);
            }

            if(m.containsKey(pre-k)){
                len = Math.max(len,i - m.get(pre-k));
            }
            else{
                //store the first occ
                m.put(pre, i);
            }

        }
        return len;

    }

}
