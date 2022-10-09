package math;

public class FindingHcf {

    public static void main(String[] args) {
        
    }


    public static int hcf1(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int hcf2(int a, int b) {
        if(b == 0) {
            return a;
        }
        return hcf2(b, a%b);
    }

    public static int GCD(int a, int b) {
        int dividend = a > b ? a : b;
        int divisor =  a < b ? a : b;
        
        while(divisor > 0) {
            int reminder = dividend % divisor;
            dividend = divisor;
            divisor = reminder;
        }
        return dividend;
    }
    
}
