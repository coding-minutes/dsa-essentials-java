package BasicSortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

public class sortWithComparator {


    ArrayList<Integer> sortingWithComparator(ArrayList<Integer> v, boolean flag){
        // your code  goes here
        if(flag) Collections.sort(v);
        else Collections.sort(v, Collections.reverseOrder());
        return v;
    }
}
