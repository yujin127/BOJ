package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/10798

public class 세로읽기_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		String[] tokens = new String[5];
//		for (int i = 0; i < 5; i++) {
//			tokens[i] = br.readLine();
//		}
//		int max = Integer.MIN_VALUE;
//		char[][] arr = new char[5][];
//		for (int i = 0; i < 5; i++) {
//			arr[i] = new char[tokens[i].length()];
//			if (arr[i].length > max)
//				max = arr[i].length;
//			for (int j = 0; j < tokens[i].length(); j++) {
//				arr[i][j] = tokens[i].charAt(j);
//			}
//		}
//
//		for (int j = 0; j < max; j++) {
//			for (int i = 0; i < 5; i++) {
//				if (j < arr[i].length) {
//					System.out.print(arr[i][j]);
//				}
//			}
//		}
		int max = Integer.MIN_VALUE;
		String[] arr = new String[5];
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<arr.length;i++) {
			arr[i] = br.readLine();
			if (max<arr[i].length())max = arr[i].length();
		}
		for (int j=0; j<max; j++) {
			for (int i=0; i<5; i++) {
				if (i<arr[i].length()) sb.append(arr[i].charAt(j));
			}
		}
		System.out.println(sb);
		
	}
}
