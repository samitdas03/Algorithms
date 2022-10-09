package sortingAlgorithms;

public class CountingSort1 {

    public static void main(String[] args) {

        int arr[] = {1, 4, 4, 1, 0, 1};
        countingSort1(arr);
        
        for(int e: arr) {
            System.out.print(e + " ");
        }
        
    }

    public static void countingSort1(int arr[]) {
        
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

        int index = 0;
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < count[i]; j++) {

                arr[index] = i;
                index++;
            }
        }

    } 
    
}
