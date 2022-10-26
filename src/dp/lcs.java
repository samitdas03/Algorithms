package dp;

import java.util.*;

public class lcs {
    
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bdgek";
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];
        for(int row[]: dp) {
            Arrays.fill(row, -1);
        }


        System.out.println(internal(s1, s2, n, m, 0, 0, dp));
    }

    public static int internal(String s1, String s2, int n, int m, int i, int j, int dp[][]) {
        if(i == n || j == m) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1 + internal(s1, s2, n, m, i+1, j+1, dp);
        }
        return dp[i][j] = Math.max(internal(s1, s2, n, m, i+1, j, dp), internal(s1, s2, n, m, i, j+1, dp));
    }
}
