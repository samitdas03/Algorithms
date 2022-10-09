package sortingAlgorithms.quickSort;

public class QuickSort_Naive {

    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 4, 2, 7, 1, 10, 5};
        int n = arr.length - 1;
        quickSort_Naive(arr, 0, n);

        for(int e: arr) {
            System.out.print(e + " ");
        } 
        
    }

    public static void quickSort_Naive(int arr[], int l, int r) {

        if(l >= r) {
            return;
        }

        int p = (l + r)/2;

        int fix = NaivePartition.naivePartition(arr, l, p, r);
        quickSort_Naive(arr, l, fix-1);
        quickSort_Naive(arr, fix+1, r);

    }
    
}
