package Stack;

import java.util.Stack;

public class inBuildStack {

    public static void main(String[] args) {
        Stack<String> books=new Stack<>();

        books.push("C++");
        books.push("Java");
        books.push("Python");
        books.push("OS");

        while(!books.empty()){
            System.out.println(books.peek());
            books.pop();
        }



    }
}
