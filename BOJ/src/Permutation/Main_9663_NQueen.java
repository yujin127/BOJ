package Permutation;

import java.util.Scanner;

public class Main_9663_NQueen {
	static int n, ans;
	static int[] chess;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		chess = new int[n];
		ans =0; 
		queen(0);
	}
	static void queen(int row) {
		if (row == n) {
			ans ++;
			return;
		}
		
	}
	
}
