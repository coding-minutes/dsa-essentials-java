package BasicSortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;

class longPair{
    public long first, second;
}

public class DefenceKingdom {

    long defkin(int w, int h, ArrayList<longPair> position)
    {
        // your code goes here
        ArrayList<longPair> v = new ArrayList<>(position);
        ArrayList<Long> x = new ArrayList<>(), y = new ArrayList<>();
        x.add(0L); y.add(0L);

        long maxx = Integer.MIN_VALUE, maxy = Integer.MIN_VALUE;

        for(int i=0; i<v.size(); i++)
        {
            x.add(v.get(i).first);
            y.add(v.get(i).second);
        }

        Collections.sort(x);
        Collections.sort(y);


        for (int i = 1; i < x.size(); i++) maxx = Math.max(maxx, x.get(i) - x.get(i-1) -1);
        for (int i = 1; i < y.size(); i++) maxy = Math.max(maxy, y.get(i) - y.get(i - 1) - 1);
        maxx = Math.max(maxx, w - x.get(x.size() - 1));
        maxy = Math.max(maxy, h- y.get(y.size() - 1));

        return (maxx * maxy);

    }
}
