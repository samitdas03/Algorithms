package bitManipulation;

public class KthBitSetOrNot {

    public static void main(String[] args) {
        


    }

    public static boolean kthBitSet(int n, int k) {
        if((n&(1<<(k-1))) != 0) {
            return true;
        } 
        return false;
    }

    public static boolean kthBitSet2(int n, int k) {
        return ((n>>(k-1))&1) == 1;
    }
    
}
