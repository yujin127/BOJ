package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 음계 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int[] arr = new int[8];
		for (int i=0; i<8; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		boolean a = true; boolean d = true;
		int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};
		for (int i=0; i<8; i++) {
			if (arr[i]!=asc[i]) a = false;
			if (arr[i]!=desc[i]) d = false;
		}
		if (a) System.out.println("ascending");
		else if (d) System.out.println("descending");
		else System.out.println("mixed");
	}
}