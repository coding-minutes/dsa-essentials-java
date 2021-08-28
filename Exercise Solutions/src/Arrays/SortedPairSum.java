package Arrays;

class Pair{
    public int a, b;
    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}

public class SortedPairSum {


    Pair closestSum(int[] arr, int x){
        int res_l = 0, res_r = 0;
        int n = arr.length;
        int l = 0, r = n-1, diff = Integer.MAX_VALUE;

        while (r > l)
        {
            if (Math.abs(arr[l] + arr[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] - x);
            }

            if (arr[l] + arr[r] > x)
                r--;
            else
                l++;
        }

        return new Pair(arr[res_l], arr[res_r]);
    }
}
