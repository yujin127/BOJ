package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세탁소사장동혁_2720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] money = new int[T];
		int[] coins = {25, 10, 5, 1};
		for (int tc = 0; tc<T; tc++) {
			money[tc] = Integer.parseInt(br.readLine());
		}
		for (int m : money) {
			for (int c : coins) {
				System.out.print(m/c+" ");
				m = m % c;
			}
			System.out.println();
		}
	}
}
