import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] dp = new int[k + 1][n + 1];

        for (int i = 1; i < n + 1; i++) {
            dp[1][i] = 1;
        }
        for (int i = 1; i < k + 1; i++) {
            dp[i][0] = 1;
        }

        for (int i = 2; i < k + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % 1000000000;
            }
        }

        System.out.println(dp[k][n]);
    }
}