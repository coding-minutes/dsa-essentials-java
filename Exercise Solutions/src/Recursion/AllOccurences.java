package Recursion;

import java.util.ArrayList;

public class AllOccurences {


    ArrayList<Integer> vec = new ArrayList<>();


    void helper(int k, ArrayList<Integer> v, int i){
        if(i==v.size()){
            return;
        }
        if(v.get(i)==k){
            vec.add(i);

        }
        helper(k,v,i+1);
    }

    ArrayList<Integer> findAllOccurences(int k, ArrayList<Integer> v){
        vec.clear();
        helper(k,v,0);
        return vec;
    }

}
