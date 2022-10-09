package bitManipulation;

public class CountSetBits {

    public static void main(String[] args) {

        int i = 0;
        for(int j = 0; j < 3; j++) {
            for( ; i < 5; i++) {
                System.out.println(i);
            }
            i = j;
            System.out.println();
        }
        
    }

    // Neive approach
    
    public static int countSetBits1(int n) {
        int count = 0;
        while(n > 0) {
            if(n%2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }

    public static int countSetBits2(int n) {
        int count = 0;
        while(n > 0) {
            if((n&1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    // Brain Kerningam's Algorithm

    public static int countSetBits3(int n) {
        int count = 0;
        while(n > 0) {
            n = n&(n-1);
            count++;
        }
        return count;
    }

    // Lookup table method

    public static int countSetBit4(int n) {
        int table[] = new int[256];
        table[0] = 0;
        for(int i = 1; i < 256; i++) {
            table[i] = (i&1) + table[i/2];
        }
        int count = 0;
        for(int i = 0; i < 4; i++) {
            count += table[n&0xff];
            n >>>= 8;
        }
        return count;
    }
    
}
