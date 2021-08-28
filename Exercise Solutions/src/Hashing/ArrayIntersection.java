package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayIntersection {

    ArrayList<Integer> intersection(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<nums1.size();i++)
        {
            map.put(nums1.get(i), map.getOrDefault(nums1.get(i), 0)+ 1);
        }

        for(int i=0;i<nums2.size();i++)
        {
            if(map.getOrDefault(nums2.get(i), 0) != 0)
            {
                result.add(nums2.get(i));
                map.put(nums2.get(i),0);
            }
        }
        Collections.sort(result);
        return result;
    }


}
