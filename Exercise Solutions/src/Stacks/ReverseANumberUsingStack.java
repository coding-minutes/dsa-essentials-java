package Stacks;

import java.util.Stack;

public class ReverseANumberUsingStack {


    int reverse(int n){

        int number = n;
        Stack<Integer> st = new Stack<>();
        while (number != 0)
        {
            st.push(number % 10);
            number = number / 10;
        }

        int rev = 0;
        int i = 1;

        while (!st.empty())
        {
            rev = rev + (st.peek() * i);
            st.pop();
            i = i * 10;
        }

        return rev;

    }
}
