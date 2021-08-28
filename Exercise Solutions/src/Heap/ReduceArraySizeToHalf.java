package Heap;

import Queue.InterleaveTwoHalvesOfQueue;

import java.util.*;

public class ReduceArraySizeToHalf {


    static int minSetSize(int[] arr) {
        int n=arr.length;
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int j : arr) {
            mp.put(j, mp.getOrDefault(j, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> pair:mp.entrySet()){
            q.add(pair.getValue());
        }
        int sum=0;
        int cnt=0;
        while(n-sum>n/2){
            sum+=q.poll();
            cnt++;

        }
        return cnt;
    }


    public static void main(String[] arhs) {
        int[] num = new int[]{2,3,1,-1,-200,5,3,5,6,3,21,15,2};
        System.out.println(minSetSize(num));
    }

}
