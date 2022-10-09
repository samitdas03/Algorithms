package sortingAlgorithms.quickSort;
// import sortingAlgorithms.LomutoPartition;

public class QuickSort_Lomuto {

    public static void main(String[] args) {

        int arr[] = {8, 4, 7, 9, 3, 10, 5};
        int n = arr.length - 1;
        quickSort_Lomuto(arr, 0, n);

        for(int e: arr) {
            System.out.print(e + " ");
        }        
    }

    public static void quickSort_Lomuto(int arr[], int l, int r) {

        if(r > l) {

            int p = LomutoPartition.lomutoPartition(arr, l, r);
            quickSort_Lomuto(arr, l, p-1);
            quickSort_Lomuto(arr, p+1, r);
        }
    }


    
}
