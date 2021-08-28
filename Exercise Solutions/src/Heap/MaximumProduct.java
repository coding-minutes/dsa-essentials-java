package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumProduct {


    static int maxProduct(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<nums.length; i++){
            q.add((nums[i]-1));
        }


        int p=q.peek();
        q.poll();
        return p*q.peek();
    }

    public static void main(String[] arhs) {
        int[] num = new int[]{2,3,1,-1,-200,5};
        System.out.println(maxProduct(num));
    }




}
