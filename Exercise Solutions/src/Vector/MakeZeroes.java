package Vector;

import java.util.ArrayList;

public class MakeZeroes {


    ArrayList<ArrayList<Integer>> makeZeroes(ArrayList<ArrayList<Integer>> arr){
        // your code goes here
        ArrayList<Integer> r = new ArrayList<>(),c = new ArrayList<>();
        int n = arr.size(), m = arr.get(0).size();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr.get(i).get(j) == 0){
                    r.add(i); c.add(j);
                }
            }
        }

        for(int x : r){
            for(int i=0; i<n; i++){
                arr.get(x).set(i, 0);
            }
        }
        for(int x : c){
            for(int i=0; i<n; i++){
                arr.get(i).set(x, 0);
            }
        }

        return arr;
    }
}
