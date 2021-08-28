package Vector;

import java.util.ArrayList;
import java.util.Comparator;

public class sortFruits {
    class Pair{
        String first;
        int second;
    }

    class SortComparator implements Comparator<Pair>{
        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.second - o2.second;
        }
    }


    class NameComparator implements Comparator<Pair>{
        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.first.compareTo(o2.first);
        }
    }

    ArrayList<Pair> sortFruits(ArrayList<Pair> v, String S){
        ArrayList<Pair> vv = new ArrayList<>(v);

        if(S=="name") vv.sort(new NameComparator());
        else vv.sort(new SortComparator());
        return vv;
    }
}
