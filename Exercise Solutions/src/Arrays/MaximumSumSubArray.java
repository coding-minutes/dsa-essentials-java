package Arrays;

public class MaximumSumSubArray {


    int maxSumSubarray(int[] A) {


        boolean f =true;
        int rr=Integer.MIN_VALUE;
        for(int x : A){
            if(x >0 ) f = false;
            if(x > rr) rr = x;
        }
        if(f) return rr;

        int maxSumFromPrevIndexToLeft = 0;

        int finalAnswer = 0;

        int temporary  = 0;

        int arraySize = A.length;
        for (int i = 0; i < arraySize; i++) {
            temporary = maxSumFromPrevIndexToLeft + A[i];
            if (temporary < A[i]) {
                maxSumFromPrevIndexToLeft = A[i];
            }
            else {
                maxSumFromPrevIndexToLeft = temporary;
            }
            finalAnswer = Math.max(finalAnswer, maxSumFromPrevIndexToLeft);
        }

        return finalAnswer;

    }
}
