import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import java.util.*;
import java.io.*;
import java.math.*;


public class DefaultJava {
    static long mod = Long.MAX_VALUE;
    static OutputStream outputStream = System.out;
    static PrintWriter out = new PrintWriter(outputStream);
    static FastReader f = new FastReader();

    public static void main(String[] args) {
        int t = f.nextInt();

        while(t-- > 0){
            solve();
        }



        out.close();
    }


    public static void solve() {

    }






    // Sort an array
    public static void sort(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: arr) {
            al.add(i);
        }
        Collections.sort(al);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
        }
    }

    // Find all divisors of n
    public static void allDivisors(int n) {
        for(int i = 1; i*i <= n; i++) {
            if(n%i == 0) {
                System.out.println(i + " ");
                if(i != n/i) {
                    System.out.println(n/i + " ");
                }
            }
        }
    }

    // Check if n is prime or not
    public static boolean isPrime(int n) {
        if(n < 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i*i <= n; i += 6) {
            if(n % i == 0 || n % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Find gcd of a and b
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

    // Find lcm of a and b
    public static long lcm(long a, long b) {
        long lcm = gcd(a, b);
        long hcf = (a * b) / lcm;
        return hcf;
    }

    // Find factorial in O(n) time
    public static long fact(int n) {
        long res = 1;
        for(int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    // Find power in O(logb) time
    public static long power(long a, long b) {
        long res = 1;
        while(b > 0) {
            if((b&1) == 1) {
                res = (res * a)%mod;
            }
            a = (a * a)%mod;
            b >>= 1;
        }
        return res;
    }

    // Find nCr
    public static long nCr(int n, int r) {
        if(r < 0 || r > n) {
            return 0;
        }
        long ans = fact(n) / (fact(r) * fact(n-r));
        return ans;
    }

    // Find nPr
    public static long nPr(int n, int r) {
        if(r < 0 || r > n) {
            return 0;
        }
        long ans = fact(n) / fact(r);
        return ans;
    }


    // sort all characters of a string
    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    // User defined class for fast I/O
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
    
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
    
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        boolean hasNext() {
            if (st != null && st.hasMoreTokens()) {
                return true;
            }
            String tmp;
            try {
                br.mark(1000);
                tmp = br.readLine();
                if (tmp == null) {
                    return false;
                }
                br.reset();
            } catch (IOException e) {
                return false;
            }
            return true;
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next()); 
        }
    
        double nextDouble() {
            return Double.parseDouble(next());
        }
    
        float nextFloat() {
            return Float.parseFloat(next());
        }
    
        boolean nextBoolean() {
            return Boolean.parseBoolean(next());
        }
    
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextArray(int n) {
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        long[] nextArrayLong(int n) {
            long[] a = new long[n];
            for(int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }
    }

}








/**
Dec  Char                           Dec  Char     Dec  Char     Dec  Char
---------                           ---------     ---------     ----------
  0  NUL (null)                      32  SPACE     64  @         96  `
  1  SOH (start of heading)          33  !         65  A         97  a
  2  STX (start of text)             34  "         66  B         98  b
  3  ETX (end of text)               35  #         67  C         99  c
  4  EOT (end of transmission)       36  $         68  D        100  d
  5  ENQ (enquiry)                   37  %         69  E        101  e
  6  ACK (acknowledge)               38  &         70  F        102  f
  7  BEL (bell)                      39  '         71  G        103  g
  8  BS  (backspace)                 40  (         72  H        104  h
  9  TAB (horizontal tab)            41  )         73  I        105  i
 10  LF  (NL line feed, new line)    42  *         74  J        106  j
 11  VT  (vertical tab)              43  +         75  K        107  k
 12  FF  (NP form feed, new page)    44  ,         76  L        108  l
 13  CR  (carriage return)           45  -         77  M        109  m
 14  SO  (shift out)                 46  .         78  N        110  n
 15  SI  (shift in)                  47  /         79  O        111  o
 16  DLE (data link escape)          48  0         80  P        112  p
 17  DC1 (device control 1)          49  1         81  Q        113  q
 18  DC2 (device control 2)          50  2         82  R        114  r
 19  DC3 (device control 3)          51  3         83  S        115  s
 20  DC4 (device control 4)          52  4         84  T        116  t
 21  NAK (negative acknowledge)      53  5         85  U        117  u
 22  SYN (synchronous idle)          54  6         86  V        118  v
 23  ETB (end of trans. block)       55  7         87  W        119  w
 24  CAN (cancel)                    56  8         88  X        120  x
 25  EM  (end of medium)             57  9         89  Y        121  y
 26  SUB (substitute)                58  :         90  Z        122  z
 27  ESC (escape)                    59  ;         91  [        123  {
 28  FS  (file separator)            60  <         92  \        124  |
 29  GS  (group separator)           61  =         93  ]        125  }
 30  RS  (record separator)          62  >         94  ^        126  ~
 31  US  (unit separator)            63  ?         95  _        127  DEL
 */


 
// (a/b)%mod == (a * moduloInverse(b)) % mod;
// moduloInverse(b) = power(b, mod-2);








