package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RelativeRank {
    static class Pair{
        int first,second;
        Pair(int a, int b) {
            first = a;
            second = b;
        }
    }

    static String[] findRelativeRanks(int[] score) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return - o1.first + o2.first;
            }
        });

        for(int i=0; i<score.length; i++){
            pq.add(new Pair(score[i],i));
        }

        int n= score.length;

        String[] vec = new String[n];



        int cnt=0;


        while(!pq.isEmpty()){
            cnt++;

            if(cnt==1){
                System.out.println("hey");
                vec[pq.peek().second] = ("Gold Medal");
            }
            else if(cnt==2){
                vec[pq.peek().second]=("Silver Medal");
            }
            else if(cnt==3){
                vec[pq.peek().second] = ("Bronze Medal");
            }
            else {
                vec[pq.peek().second]= String.valueOf(((cnt)));
            }
            pq.poll();
        }

        return vec;
    }

    public static void main(String[] args){
        int[] arr = new int[]{4,3,6,8,1,9};
        String[] x = findRelativeRanks(arr);
        for(String xx: x){
            System.out.println(xx);
        }
    }

}
