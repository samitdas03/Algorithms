package sortingAlgorithms;
import java.util.Scanner;


public class SelectionSort2 {

    public static void main(String[] args) {

        // creating scanner object

        Scanner sc = new Scanner(System.in);

        // input array dimension

        float size;

        do{
           System.out.print("Enter the size of the array : ");
           size = sc.nextFloat();
           if (size != (int)size || size < 0){
               System.out.println("The size of the array should be a POSITIVE INTEGER !!");
               System.out.println();
           }
        } while (size != (int)size || size < 0);

        // creating and initializing the array

        double array[] = new double[(int)size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextDouble();
        }

        // sorting the array

        int indexOfMin = 0;

        for (int i = 0; i < size - 1; i++) {
            indexOfMin = i;
            for (int j = i + 1; j < size; j++) {

                if (array[indexOfMin] > array[j]) {
                    indexOfMin = j;
                }

            }

            double temp = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin] = temp;
            
        }
        

        // output
    
        System.out.println();
        System.out.println("Sorted array:");
        System.out.print("{");

        for (int i = 0; i < size; i++) {

            if (array[i] != (int)array[i]) {
                System.out.print(array[i]);
            } else if (array[i] == (int)array[i]) {
                System.out.print((int)array[i]);
            }

            if (i < size - 1){
                System.out.print(", ");
            }

        }

        System.out.print("}");

        sc.close();
    
    }
}
