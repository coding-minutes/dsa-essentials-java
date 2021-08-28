package Stacks;

import java.util.Stack;

public class DuplicateParenthesis {


    boolean duplicateParentheses(String str){

        Stack<Character> Stack = new Stack<>();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == ')')
            {
                char top = Stack.peek();
                Stack.pop();

                int elementsInside = 0;
                while (top != '(')
                {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if(elementsInside < 1) {
                    return true;
                }
            }

            else
                Stack.push(ch);
        }

        return false;

    }

}
