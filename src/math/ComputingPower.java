package math;

public class ComputingPower {

    public static void main(String[] args) {
        
    }



    // Most Optimized Iterative approach (Binary Exponentiation)
    public static int powIterative(int x, int n) {
        int res = 1;
        while(n > 0) {
            if((n&1) == 1) {
                res *= x;
            }
            n >>= 1;
            x *= x;
        }
        return res;
    }


    // public static int pow(int x, int n) {
    //     if(n == 0) {
    //         return 1;
    //     }
    //     if(n%2 == 1) {
    //         return pow(x, n-1)*x;
    //     }
    //     int temp = pow(x, n/2);
    //     return temp*temp;
    // }

    public static int pow(int x, int n) {
        if(n == 0) return 1;
        int temp = pow(x, n/2);
        temp = temp*temp;
        if(n%2 == 0) {
            return temp;
        }
        return temp*x;
    }

    public static int pow1(int x, int n) {
        if(n == 0) return 1;
        int res = 1;
        for(int i = 0; i < n; i++) {
            res *= x;
        }
        return res;
    }
    
}
