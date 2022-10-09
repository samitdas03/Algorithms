package math;

public class Lcm {

    public static void main(String[] args) {
        
    }



    public static int lcm1(int a, int b) {
        int lcm = FindingHcf.hcf2(a, b);
        int hcf = (a * b) / lcm;
        return hcf;
    }

    public static int lcm2(int a, int b) {
        int res = Math.max(a, b);
        while(res <= a*b) {
            if((a%res == 0) && (b%res == 0)) {
                return res;
            }
            res++;
        }
        return res;
    }
    
}
