package Stack;

public class StackVtest {

    public static void main(String[] args) {


        StackV<Integer> s = new StackV<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);
        s.push(10);

        while (!s.empty()) {
            System.out.println(s.top());
            s.pop();
        }
    }


}
