package Stacks;

import java.util.Stack;

public class NextGreaterElement {

    int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] arr1 = new int[n];

        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--)
        {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();

            if (s.empty())
                arr1[i] = -1;
            else
                arr1[i] = s.peek();

            s.push(arr[i]);
        }
        return arr1;
    }
}
