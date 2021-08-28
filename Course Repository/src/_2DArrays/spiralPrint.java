package _2DArrays;

public class spiralPrint {


    static void print(int arr[][], int n, int m) {


        //4 variables
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;

        //Outer Loop (Traverse array boundary)
        while (startCol <= endCol && startRow <= endRow) {

            //Start Row
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(arr[startRow][col] + " ");
            }

            //End Col
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(arr[row][endCol] + " ");
            }

            //End Row
            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][col] + " ");
            }

            //Start Col
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                //Avoid Duplicate Printing of elements
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[row][startCol] + " ");
            }

            //update the variables to point to inner spiral
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }


    public static void main(String[] args) {

        //Print in spiral form
        int arr[][] = {{1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}};

        int n = 4, m = 4;

        print(arr, n, m);
    }
}