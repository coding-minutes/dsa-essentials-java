package BasicSortingAlgorithms;

public class optimisedBubbleSort {

    int[] optimizedBubbleSort(int[] arr){
        // your code  goes here
        int i, j, n=arr.length;
        boolean swapped;
        for (i = 0; i < n-1; i++)
        {
            swapped = false;
            for (j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }

            // IF no two elements were swapped by inner loop, then break
            if (!swapped)
                break;
        }

        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
