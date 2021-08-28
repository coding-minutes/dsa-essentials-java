package _2DArrays;

public class _2d_array_sorted_search {

    static class Pair{
        int first, second;
        Pair(int a, int b){
            first= a;
            second = b;
        }
    }

    static Pair staircaseSearch(int arr[][],int n,int m,int key){

        //later if the element is not present return {-1,-1}

        if(key < arr[0][0] || key>arr[n-1][m-1]){
            return new Pair(-1,-1);
        }

        //staircase search
        int i=0;
        int j = m-1;

        while(i<=n-1 && j>=0){

            if(arr[i][j]==key){
                return new Pair(i,j);
            }
            else if(arr[i][j]>key){
                j--;
            }
            else{
                i++;
            }
        }

        return new Pair(-1,-1);
    }


    public static void main(String[] args){

        //2D Row & Column Wise Sorted Array
        int arr[][] = { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}};

        int n = 4,m=4;

        Pair coords = staircaseSearch(arr,n,m,27);

        System.out.println(coords.first + " " + coords.second);

    }

}
