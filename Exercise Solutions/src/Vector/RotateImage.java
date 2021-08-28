package Vector;

public class RotateImage {

    static void swap(int[][] v, int i, int j, int k, int l){
        int temp = v[i][j];
        v[i][j] = v[k][l];
        v[k][l] = temp;
    }
    void rotate(int[][] matrix) {
        int n = matrix.length;
        int a = 0;
        int b = n-1;
        while(a<b){
            for(int i=0;i<(b-a);++i){
                swap(matrix, a,a + i, a+i, b);
                swap(matrix, a,a+i, b, b-i);
                swap(matrix, a,a+i, b-i, a);
            }
            ++a;
            --b;
        }
    }

}
