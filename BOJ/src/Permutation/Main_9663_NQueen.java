package Permutation;

import java.util.Scanner;

public class Main_9663_NQueen {
	static int n, ans;
	static int[] chess;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		chess = new int[n];
		ans = 0;
		queen(0);
		System.out.println(ans);
	}
	
	static void queen(int row) {
		if (row == n) {
			ans ++;
			return;
		}
		for (int col=0; col<n; col++) {
			if (safe(row, col)) {
				chess[row] = col;  
				queen(row+1);
			}
		}
	}
	static boolean safe(int row, int col) {
		for (int i=0; i<row; i++) {
			if (col==chess[i]) return false;
			if ((row-i) == Math.abs(chess[i]-col)) return false;
		}
		return true;
	}
}
