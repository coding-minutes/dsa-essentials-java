package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WeakestRow {

    static class Pair{
        int first,second;
        Pair(int a, int b) {
            first = a;
            second = b;
        }
    }

    static ArrayList<Integer> kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.first - o2.first;
            }
        });

        for(int i=0;i<mat.length;i++)
        {
            int count=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    count++; //Counting the number of soldiers in each case
                }
            }
            pq.add(new Pair(count,i));
        }

        ArrayList<Integer> x = new ArrayList<>();
        while(k>0)
        {
            Pair temp=pq.peek();
            x.add(temp.second);
            pq.poll();
            k--;
        }
        return x;
    }

    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,1,1,1,1},{1,1,0,1,1},{0,1,0,1,0},{1,1,1,0,0}};
        System.out.println(kWeakestRows(matrix, 2));
    }


}
