package Vector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class SortingCabs {

    static class Pair{
        int first, second;
    }

    ArrayList<Pair> sortCabs(ArrayList<Pair> v){
        // your code  goes here
        ArrayList<Pair> vv = new ArrayList<>(v);
        vv.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {
                double x = Math.sqrt((a.first*a.first) + (a.second*a.second));
                double y = Math.sqrt((b.first*b.first) + (b.second*b.second));
                if(x < y){
                    return -1;
                }else if(x > y){
                    return 1;
                }
                return 0;
            }
        });
        return vv;
    }
}
