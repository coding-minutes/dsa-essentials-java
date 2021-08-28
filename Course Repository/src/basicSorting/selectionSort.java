package basicSorting;

public class selectionSort {

    static void selection_sort(int a[],int n){

        for(int pos = 0; pos <= n-2; pos++){

            int current = a[pos];
            int min_position = pos;

            //find out the element
            for(int j=pos; j<n; j++){

                if(a[j] < a[min_position]){
                    min_position = j;
                }

            }
            //swap outside the loop
            int temp = a[min_position];
            a[min_position] = a[pos];
            a[pos] = temp;
        }


    }


    public static void main(String[] args){
        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;


        selection_sort(arr,n);
        for(int k: arr){
            System.out.println(k);
        }

    }
}
