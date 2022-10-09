package bitManipulation;
import java.util.*;

public class XorUptoN {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long xor = 0;
        if(n%4 == 0) {
            xor = n;
        } else if(n%4 == 1) {
            xor = 1;
        } else if(n%4 == 2) {
            xor = n + 1;
        } else {
            xor = 0;
        }

        System.out.println(xor);

        sc.close();


    }
    
}
