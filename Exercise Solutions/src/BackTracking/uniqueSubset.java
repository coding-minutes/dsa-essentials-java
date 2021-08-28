package BackTracking;

import java.util.*;

public class uniqueSubset {

    public static Set<ArrayList<Integer>> s;

    public static void recur(int[] nums, ArrayList<Integer> ans, int i)
    {
        if(i == nums.length){
            ArrayList<Integer> ansToPut = new ArrayList<>(ans);
            Collections.sort(ansToPut);
            s.add(ansToPut);
            return;
        }

        ans.add(nums[i]);
        recur(nums, ans, i+1);
        ans.remove(ans.size()-1);
        recur(nums, ans, i+1);
    }

    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int[] nums){
        s = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        recur(nums, ans, 0);

        ArrayList<ArrayList<Integer>> v = new ArrayList<>(s);
        return v;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        System.out.print(uniqueSubsets(num));
    }
}
