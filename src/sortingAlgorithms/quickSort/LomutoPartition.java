package sortingAlgorithms.quickSort;

public class LomutoPartition {

    public static void main(String[] args) {

        int arr[] = {10, 80, 30, 90, 40, 50, 70};
        int n = arr.length - 1;
        int a = lomutoPartition(arr, 0, n);

        System.out.println(a);

        for(int e: arr) {
            System.out.print(e + " ");
        }
        
    }

    public static int lomutoPartition(int arr[], int l, int r) {

        int pivot = arr[r];
        int i = l - 1;

        for(int j = l; j < r; j++) {

            if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, r);

        return i+1;
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
