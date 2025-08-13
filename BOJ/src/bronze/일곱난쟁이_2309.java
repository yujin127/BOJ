package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		int p1=0;
		int p2=0;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					p1 = arr[i];
					p2 = arr[j];
					break;
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			if (arr[i] != p1 && arr[i] != p2)
				System.out.println(arr[i]);
		}
	}
}
