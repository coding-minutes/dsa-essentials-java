package Arrays2d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SubMatrixSum {


    public static int sum(ArrayList<ArrayList<Integer>> v, int sr, int sc, int er, int ec){
        int m=v.size();
        int n=v.get(0).size();
        // // int aux[m][n];
        int M=m;
        int N=n;

        ArrayList<ArrayList<Integer>> aux = new ArrayList<>(), mat=new ArrayList<>();
        for (ArrayList<Integer> integers : v) {
            ArrayList<Integer> a = new ArrayList<>(integers);
            aux.add(a);
        }

        for (ArrayList<Integer> integers : v) {
            ArrayList<Integer> a = new ArrayList<>(integers);
            mat.add(a);
        }

        int tli=sr, tlj=sc, rbi=er, rbj=ec;

        for (int i=0; i<N; i++)
            aux.get(0).set(i, mat.get(0).get(i));

        // Do column wise sum
        for (int i=1; i<M; i++)
            for (int j=0; j<N; j++)
                aux.get(i).set(j, mat.get(i).get(j) + aux.get(i - 1).get(j));


        // Do row wise sum
        for (int i=0; i<M; i++)
            for (int j=1; j<N; j++)
                aux.get(i).set(j, aux.get(i).get(j)+aux.get(i).get(j - 1));

        int res = aux.get(rbi).get(rbj);
        // Remove elements between (0, 0) and (tli-1, rbj)
        if (tli > 0)
            res = res - aux.get(tli - 1).get(rbj);

        // Remove elements between (0, 0) and (rbi, tlj-1)
        if (tlj > 0)
            res = res - aux.get(rbi).get(tlj - 1);

        // Add aux[tli-1][tlj-1] as elements between (0, 0)
        // and (tli-1, tlj-1) are subtracted twice
        if (tli > 0 && tlj > 0)
            res = res + aux.get(tli - 1).get(tlj - 1);

        return res;
    }


}
