package sortingAlgorithms;

public class CountingSort2 {

    public static void main(String[] args) {

        int arr[] = {1, 4, 4, 1, 0, 1};
        countingSort2(arr);
        
        for(int e: arr) {
            System.out.print(e + " ");
        }
        
    }

    public static void countingSort2(int arr[]) {

        int n = arr.length;
        int max = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int k = max + 1;

        int count[] = new int[k];

        for(int i = 0; i < k; i++) {
            count[i] = 0;
        }

        for(int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for(int i = 1; i < k; i++) {
            count[i] = count[i-1] + count[i];
        }

        int output[] = new int[n];

        for(int i = n-1; i >=0; i--) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        for(int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    
}
