package sortingAlgorithms;

public class Merge2Array {

    public static void main(String[] args) {
        
        int arr1[] = {3, 6, 7, 9, 11};
        int arr2[] = {2, 5, 11, 15};

        merge2Array(arr1, arr2);


    }

    public static void merge2Array(int arr1[], int arr2[]) {

        int n = arr1.length;
        int m = arr2.length;

        int i = 0, j = 0;

        while(i < n && j < m) {

            if(arr1[i] >= arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
            }
        }

        while(i < n) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while(j < m) {
            System.out.print(arr2[j] + "");
            j++;
        }

    }
    
}
