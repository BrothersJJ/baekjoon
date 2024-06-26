import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[n + 1][3];
        int m = 9901;

        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % m;
            dp[i][1] = (dp[i - 1][0] +dp[i - 1][2]) % m;
            dp[i][2] = (dp[i - 1][0] +dp[i - 1][1]) % m;
        }

        System.out.println((dp[n][0] + dp[n][1] + dp[n][2]) % m);
    }
}