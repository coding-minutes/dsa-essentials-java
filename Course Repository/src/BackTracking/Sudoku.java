package BackTracking;

public class Sudoku {


    static boolean isSafe(int[][] mat, int i, int j, int no){


        //Check for row and col
        for(int k=0;k<9;k++){
            if(mat[k][j]==no||mat[i][k]==no){
                return false;
            }
        }
        //check for subgrid

        int sx = (i/3)*3;
        int sy = (j/3)*3;

        for(int x=sx; x<sx + 3;x++){
            for(int y =sy;y<sy + 3;y++){
                if(mat[x][y]==no){
                    return false;
                }
            }
        }
        return true;
    }




    static boolean solveSudoku(int[][] mat,int i,int j,int n){
        //base case
        if(i==n){
            //print the solution later
            for(int ii=0;ii<9;ii++){
                for(int jj=0;jj<9;jj++){
                    System.out.print(mat[ii][jj] + " ");
                }
                System.out.println();
            }

            return true;
        }

        //rec case
        if(j==n){
            return solveSudoku(mat,i+1,0,n);
        }

        //skip  the prefilled cell
        if(mat[i][j]!=0){
            return solveSudoku(mat,i,j+1,n);
        }

        //cell to be filled
        //try out all possibilites
        for(int no=1;no<=n;no++){
            //whether it is safe to place the number or not
            if(isSafe(mat,i,j,no)){

                mat[i][j] = no;
                boolean solveSubproblem = solveSudoku(mat,i,j+1,n);
                if(solveSubproblem){
                    return true;
                }
            }

        }
        // if no option works, backtracking
        mat[i][j] = 0;
        return false;
    }


    public static void main(String[] args) {

        int n = 9;
        int[][] mat =
        {{5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}};


        if(!solveSudoku(mat,0,0,n)){
            System.out.println("No solution exists!");
        }


    }

}
