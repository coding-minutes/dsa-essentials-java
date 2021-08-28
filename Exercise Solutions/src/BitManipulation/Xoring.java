package BitManipulation;

import java.util.ArrayList;

public class Xoring {


    int xoring(ArrayList<Integer> v)
    {
        int res=0;
        for(int x : v)
            res ^= x;
        return res;
    }
}
