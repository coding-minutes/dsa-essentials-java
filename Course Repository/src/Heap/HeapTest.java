package Heap;

public class HeapTest {

    public static void main(String[] args) {
        int marks[] = {90,80,12,13,15,56,94};

        heap h = new heap(marks.length);

        for(int x:marks){
            h.push(x);
        }

        while(!h.empty()){
            System.out.println(h.top());
            h.pop(); //logn
        }
    }
}
