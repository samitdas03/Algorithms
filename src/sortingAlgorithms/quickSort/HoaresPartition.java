package sortingAlgorithms.quickSort;

public class HoaresPartition {

    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 4, 2, 7, 1, 10, 5};
        int n = arr.length - 1;
        int index = hoaresPartition(arr, 0, n);

        System.out.println(index);

        for(int e: arr) {
            System.out.print(e + " ");
        }
        
    }

    public static int hoaresPartition(int arr[], int l, int r) {

        int pivot = arr[l];
        int i = l - 1;
        int j = r + 1;

        while(true) {

            do{
                i++;
            } while(arr[i] < pivot);

            do{
                j--;
            } while(arr[j] > pivot);

            if(i >= j) {
                return j;
            }

            swap(arr, i, j);
        }
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
