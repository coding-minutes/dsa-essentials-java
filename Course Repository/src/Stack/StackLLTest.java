package Stack;

public class StackLLTest {

    public static void main(String[] args) {
        stackLL<Character> s = new stackLL<>();
//        StackV<Character> s = new StackV<>();
        s.push('h');
        s.push('e');
        s.push('l');
        s.push('l');
        s.push('o');

        while(!s.empty()){
            System.out.println(s.top());
            s.pop();
        }


    }
}
