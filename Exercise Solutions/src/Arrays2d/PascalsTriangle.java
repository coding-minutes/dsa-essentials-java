package Arrays2d;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {


    public static int binomialCoeff(int n, int k){
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }


    public static List<List<Integer>> printPascal(int n){

        List<List<Integer>> res = new ArrayList<>();
        for (int line = 0; line < n; line++){

            List<Integer> v = new ArrayList<>();
            for (int i = 0; i <= line; i++){
                v.add(binomialCoeff(line, i));
            }

            res.add(v);
        }
        return res;
    }

    public static void main(String[] args){
        System.out.println(printPascal(6));
    }
}
