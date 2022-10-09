package math;
import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        
    }


    // Most optimized method. Time complexity O(nloglogn)
    public static void printAllPrimeUpto(int n) {
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                System.out.println(i + " ");
                for(int j = i*i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void printAllPrimeUpto2(int n) {
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i = 2; i*i <= n; i++) {
            if(isPrime[i]) {
                for(int j = 2*i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i <= n; i++) {
            if(isPrime[i]) {
                System.out.println(i + " ");
            }
        }
    }

    public static void printAllPrimeUpto3(int n) {
        for(int i = 2; i <= n; i++) {
            if(CheckingPrime.isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
    
}
