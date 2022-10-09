package sortingAlgorithms.quickSort;

public class NaivePartition {

    public static void main(String[] args) {

    }

    public static int naivePartition(int arr[], int l, int p, int r) {

        int n = r - l + 1;
        int tempArr[] = new int[n];
        int index = 0;
        int res = 0;

        for(int i = l; i <= r; i++) {

            if(arr[i] < arr[p]) {
                tempArr[index] = arr[i];
                index++;
            }
        }
        for(int i = l; i <= r; i++) {

            if(arr[i] == arr[p]) {
                tempArr[index] = arr[i];
                index++;
            }
        }

        res = l + index - 1;

        for(int i = l; i <= r; i++) {

            if(arr[i] > arr[p]) {
                tempArr[index] = arr[i];
                index++;
            }
        }

        for(int i = l; i <= r; i++) {
            arr[i] = tempArr[i-l];
        }

        return res;

    }
    
}
