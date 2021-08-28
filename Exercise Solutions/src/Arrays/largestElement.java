package Arrays;
import java.util.ArrayList;

public class largestElement {

    int largestElement(ArrayList<Integer> A) {

        int largestEle = Integer.MIN_VALUE;

        for (int element : A ) {
            largestEle = Math.max(largestEle, element);
        }

        return largestEle;
    }
}
