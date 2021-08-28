package Arrays;

public class lowerBound {


    public static int LowerBound(int[] A, int Val) {

        int sz = A.length;

        int l = 0, r = (sz-1);

        int answer = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (A[mid] > Val) {
                r = mid-1;
            }
            else {
                answer = A[mid];
                l = mid+1;
            }
        }

        return answer;

    }
}
