package Arrays;

import java.util.ArrayList;

public class k_rotate {

    ArrayList<Integer> kRotate(ArrayList<Integer> a, int k)
    {
        ArrayList<Integer> v = new ArrayList<>();
        int n = a.size();
        k = k % n;

        for(int i = 0; i < n; i++)
        {
            if(i < k)
            {
                v.add(a.get(n + i - k));
            }
            else
            {
                v.add(a.get(i - k));
            }
        }
        return v;
    }
}
