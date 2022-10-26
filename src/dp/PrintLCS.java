package dp;
// import java.util.*;

public class PrintLCS {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bdgek";
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i = n; i >= 0; i--) {
            for(int j = m; j >= 0; j--) {
                if(i == n || j == m) {
                    dp[i][j] = 0;
                } else if(s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }

        System.out.println(dp[0][0]);

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while(i < n && j < m) {
            if(s1.charAt(i) == s2.charAt(j)) {
                sb.append(s1.charAt(i));
                i++;
                j++;
            } else if(dp[i+1][j] >= dp[i][j+1]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(sb);
    }
}
