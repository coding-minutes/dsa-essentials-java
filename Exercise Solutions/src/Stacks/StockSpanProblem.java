package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {


    int[] stockSpanner(int[] a){
        Stack<Integer> s = new Stack<>();
        int n = a.length;
        s.push(0);
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && a[s.peek()] <= a[i]) {
                s.pop();
            }
            if (!s.empty()) {
                arr[i] = i - s.peek();
            } else arr[i] = i + 1;
            s.push(i);
        }
        return arr;
    }

}
