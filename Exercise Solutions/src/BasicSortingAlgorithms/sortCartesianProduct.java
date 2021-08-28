package BasicSortingAlgorithms;

import java.util.ArrayList;

import java.util.Comparator;

class Pair{
    int first, second;
    Pair(int a, int b){
        first = a; second=b;
    }
}

class SortCartesian implements Comparator<Pair>
{
    public int compare(Pair a, Pair b)
    {
        if(a.first != b.first)
            return a.first - b.first;
        return a.second - b.second;

    }
}

public class sortCartesianProduct {

    public static ArrayList<Pair> sortCartesian(ArrayList<Pair> v)
    {
        ArrayList<Pair> list = new ArrayList<>(v);
        list.sort(new SortCartesian());
        return list;
    }

}
