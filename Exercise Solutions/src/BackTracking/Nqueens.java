package BackTracking;

public class Nqueens {

    public static int cnt;
    public static int isSafe(int N, int mat[][], int r, int c)
    {
        // return 0 if two queens share the same column
        for (int i = 0; i < r; i++)
        {
            if (mat[i][c] == 1) {
                return 0;
            }
        }

        // return 0 if two queens share the same `` diagonal
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--)
        {
            if (mat[i][j] == 1) {
                return 0;
            }
        }

        // return 0 if two queens share the same `/` diagonal
        for (int i = r, j = c; i >= 0 && j < N; i--, j++)
        {
            if (mat[i][j] == 1) {
                return 0;
            }
        }

        return 1;
    }


    public static void solve(int N,int mat[][], int r)
    {
        // if `N` queens are placed successfully, print the solution
        if (r == N)
        {
            cnt++;
            return;
        }

        // place queen at every square in the current row `r`
        // and recur for each valid movement
        for (int i = 0; i < N; i++)
        {
            // if no two queens threaten each other
            if (isSafe(N, mat, r, i) == 1)
            {
                // place queen on the current square
                mat[r][i] = 1;

                // recur for the next row
                solve(N,mat, r + 1);

                // backtrack and remove the queen from the current square
                mat[r][i] = 0;
            }
        }
    }


    public static int nQueen(int n){
        cnt =0;
        int arr[][] = new int[20][20];

        solve(n,arr,0);
        return cnt;

    }


}
