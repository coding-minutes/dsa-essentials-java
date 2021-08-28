package Vector;

import java.util.*;

public class VectorFruits {

    static class Pair implements Comparable<Pair> {

        String first;
        int second;

        Pair(String a, int b){
            first =a;
            second = b;
        }

        @Override
        public int compareTo(Pair o) {
            return o.second - this.second;
        }
    }
    public static void main(String[] args) {
        List<Pair> fruits = new ArrayList<>(Arrays.asList(
                new Pair("apple",10),
                new Pair("mango",100),
                new Pair("guava",20),
                new Pair("papaya",40),
                new Pair("orange",60),
                new Pair("banana",120))
        );

        Collections.sort(fruits);

        for(Pair x : fruits){
            System.out.println( x.first + " "+x.second);
        }

    }
}
