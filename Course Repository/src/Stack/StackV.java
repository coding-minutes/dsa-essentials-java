package Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StackV<T>{

    private ArrayList<T> arr = new ArrayList<>();

    void push(T data){
        arr.add(data);
    }
    void pop(){
        arr.remove(arr.size()-1);
    }
    T top(){
        int lastIdx = arr.size() - 1;
        return arr.get(lastIdx);
    }
    boolean empty(){
        return arr.size()==0;
    }

}
