import java.util.*;
import java.io.*;

public class Hello {

    public static void main(String[] args) {

        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);

        // out.println("sfsf");
        // out.print(5);

        out.println(lcm(1, 187));


        out.close();

    }


    public static long gcd(long a, long b) {
        long dividend = a > b ? a : b;
        long divisor =  a < b ? a : b;
        
        while(divisor > 0) {
            long reminder = dividend % divisor;
            dividend = divisor;
            divisor = reminder;
        }
        return dividend;
    }

    public static long lcm(long a, long b) {
        long lcm = gcd(a, b);
        long hcf = (a * b) / lcm;
        return hcf;
    }
    
}
