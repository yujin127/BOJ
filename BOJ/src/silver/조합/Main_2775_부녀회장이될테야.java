package silver.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2775_부녀회장이될테야 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] dp = new int[k+1][n+1];
			// 0층 채워주기
			for (int i=1; i<=n; i++) dp[0][i] = i;
			// 각 층의 1호 채워주기 
			for (int j=0; j<=k; j++) dp[j][1] = 1;
			// dp 계산 시작 
			for (int i=1; i<=k; i++) {
				for (int j=2; j<=n; j++) {
					dp[i][j] = dp[i][j-1] + dp[i-1][j];
				}
			}
			System.out.println(dp[k][n]);
		}
	}
}
