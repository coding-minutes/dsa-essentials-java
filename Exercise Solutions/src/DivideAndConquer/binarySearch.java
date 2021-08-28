package DivideAndConquer;

public class binarySearch {


    // A recursive binary search function. It returns
// location of x in given array arr[l..r] is present,
// otherwise -1
    int binary(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle
            // itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binary(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binary(arr, mid + 1, r, x);
        }

        // We reach here when element is not
        // present in array
        return -1;
    }

    int binarySearch(int[] v, int x)
    {
        // your code goes here

        int n = v.length;
        int result = binary(v, 0, n - 1, x);
        return result;
    }

}
