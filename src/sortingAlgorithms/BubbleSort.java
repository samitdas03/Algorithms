package sortingAlgorithms;
import java.util.Scanner;

public class BubbleSort {

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

        double temp = 0;
        boolean check;

        for (int i = 0; i < size - 1; i++) {
            check = true;
            for (int j = 0; j < size - 1 - i; j++) {

                if (array[j] <= array[j + 1]) {
                    continue;
                } else if (array[j] > array[j + 1]) {
                    check = false;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

            if (check) {
                break;
            }
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
