package BackTracking;

import java.util.ArrayList;

public class RatAndMice {


    void ratchase(ArrayList<String> a, int[][] b, int[][] v, int i, int j, int n, int m){
        if(i==n && j==m){
            for(int k=0;k<=n;k++){
                for(int l=0;l<=m;l++){
                    v[k][l] = b[k][l];
                }
            }
            return;
        }
        if(i!=n && a.get(i + 1).charAt(j) !='X' && b[i+1][j]!=1){
            b[i+1][j]=1;
            ratchase(a,b,v,i+1,j,n,m);
            b[i+1][j]=0;
        }
        if(i>0 && a.get(i - 1).charAt(j)!='X' && b[i-1][j]!=1){
            b[i-1][j]=1;
            ratchase(a,b,v,i-1,j,n,m);
            b[i-1][j]=0;
        }
        if(j!=m && a.get(i).charAt(j+1)!='X' && b[i][j+1]!=1){
            b[i][j+1]=1;
            ratchase(a,b,v,i,j+1,n,m);
            b[i][j+1]=0;
        }
        if(j>0 && a.get(i).charAt(j-1) !='X' && b[i][j-1]!=1){
            b[i][j-1]=1;
            ratchase(a,b,v,i,j-1,n,m);
            b[i][j-1]=0;
        }
    }

    int[][] ratAndMice(ArrayList<String> a) {
        int n = a.size();
        int m = a.get(0).length();
        int[][] v = new int[n][m];
        int[][] b = new int[n][m];

        b[0][0] = 1;

        ratchase(a,b,v,0,0,n-1,m-1);
        return v;
    }
}
