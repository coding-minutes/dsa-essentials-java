package DP;

public class optimalGameStrategy {

    int game(int n, int[] v, int s, int e){

        if(s==e || s==e-1){
            return Math.max(v[s],v[e]);
        }

        int op1=v[s] + Math.min(game(n,v,s+2,e),game(n,v,s+1,e-1));
        int op2=v[e] + Math.min(game(n,v,s+1,e-1),game(n,v,s,e-2));
        return Math.max(op1,op2);
    }

    int MaxValue(int n, int[] v){
        int res=game(n,v,0,n-1);
        return res;
    }
}
