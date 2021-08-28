package Recursion;

import java.util.ArrayList;

public class ArrayMerge2D {


    static void merge_row(int[][] mat,int i, int cs, int cm, int ce){
        ArrayList<Integer> sorted = new ArrayList<>();
        int x=cs;
        int y=cm+1;
        //cout<<x<<" "<<cm<<" "<<y<<" "<<ce<<endl;
        while(x<=cm && y<=ce){
            if(mat[i][x]<mat[i][y]){
                sorted.add(mat[i][x]);
                x++;
            }
            else{
                sorted.add(mat[i][y]);
                y++;
            }
        }


        while(x<=cm){
            sorted.add(mat[i][x]);
            x++;
        }
        while(y<=ce){
            sorted.add(mat[i][y]);
            y++;
        }
        int k=0;
        for(int j=cs; j<=ce; j++){
            mat[i][j]= sorted.get(k);
            k++;
        }
    }
    static void merge_col(int[][] mat,int j, int rs, int rm, int re){
        ArrayList<Integer> sorted = new ArrayList<>();
        int x=rs;
        int y=rm+1;
        while(x<=rm && y<=re){
            if(mat[x][j]<mat[y][j]){
                sorted.add(mat[x][j]);
                x++;
            }
            else{
                sorted.add(mat[y][j]);
                y++;
            }
        }
        while(x<=rm){
            sorted.add(mat[x][j]);
            x++;
        }
        while(y<=re){
            sorted.add(mat[y][j]);
            y++;
        }
        int k=0;
        for(int i=rs; i<=re; i++){
            mat[i][j]= sorted.get(k);
            k++;
        }
    }


    static void merge(int m, int n, int[][] mat, int rs, int rm, int re,int cs, int cm, int ce){



        //for sorting rows
        for(int i=rs; i<=re; i++){
            merge_row(mat,i,cs,cm,ce);
        }

        //for sorting columns
        for(int j=cs; j<=ce; j++){
            merge_col(mat,j,rs,rm,re);
        }
        return;

    }

    static void merge_sort(int m, int n, int[][] mat, int rs, int re, int cs, int ce){
        //cout<<rs<<" "<<re<<endl;
        //cout<<cs<<" "<<ce<<endl;
        if(rs>=re && cs>=ce){
            return;
        }


        int rm=(rs+re)/2;
        int cm=(cs+ce)/2;

        // cout<<rs<<" "<<rm<<" "<<re<<" "<<cs<<" "<<cm<<" "<<ce<<endl;


        //for dividing into subarrays
        merge_sort(m,n,mat,rs,rm,cs,cm);
        merge_sort(m,n,mat,rm+1,re,cs,cm);
        merge_sort(m,n,mat,rs,rm,cm+1,ce);
        merge_sort(m,n,mat,rm+1,re,cm+1,ce);


        //for merging sorted subarrays
        merge(m,n,mat,rs,rm,re,cs,cm,ce);
        return;
    }

    static int[][] mergeSort(int m, int n, int[][] v){
        merge_sort(m,n,v,0,m-1,0,n-1);
        return v;
    }

    public static void main(String[] ags){
        int[][] arr = new int[][]{{3,2,5,2},{1,2,4,1}};
        arr = mergeSort(2,4,arr);
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
