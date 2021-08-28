package Graph;

public class FindStarInGraph {

    class Pair{
        int first, second;
        public Pair(int a,int b){
            first = a;
            second = b;
        }
    }
    int findCenter(int[][] v) {

        Pair f=new Pair(v[0][0],v[0][1]);
        Pair s=new Pair(v[1][0],v[1][1]);

        if(f.first==s.first){
            return f.first;
        }
        else if(f. first==s.second){
            return f.first;
        }
        else if(f.second==s.first){
            return f.second;
        }
        else{
            return f.second;
        }

    }
}
