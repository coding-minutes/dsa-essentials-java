package Vector;

public class VectorTest {

    public static void main(String[] args) {
        Vector<Character> vc = new Vector<Character>(4);
        vc.push_back('a');
        vc.push_back('b');
        vc.push_back('c');

        for(int i=0;i < vc.size();i++){
            System.out.println(vc.get(i));
        }


        Vector<Integer> v = new Vector<Integer>(4);

        v.push_back(1);
        v.push_back(2);
        v.push_back(3);
        v.push_back(4);
        v.push_back(15);
        v.push_back(6);
        v.pop_back();

        System.out.println(v.front());
        System.out.println(v.back());
        System.out.println(v.at(2));
        System.out.println(v.size());
        System.out.println(v.capacity());





    }
}
