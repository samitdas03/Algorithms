package sortingAlgorithms.quickSort;

public class QuickSort_Hoares {

    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 4, 2, 7, 1, 10, 5};
        int n = arr.length - 1;
        quickSort_Hoares(arr, 0, n);

        for(int e: arr) {
            System.out.print(e + " ");
        } 
        
    }

    public static void quickSort_Hoares(int arr[], int l, int r) {

        if(l < r) {
            
            int p = HoaresPartition.hoaresPartition(arr, l, r);
            quickSort_Hoares(arr, l, p);
            quickSort_Hoares(arr, p+1, r);
        }
    }
    
}
