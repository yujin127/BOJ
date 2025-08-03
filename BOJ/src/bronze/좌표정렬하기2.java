package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 좌표정렬하기2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for (int i=0; i<N; i++) {
			String[] temp = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(temp[0]);
			arr[i][1] = Integer.parseInt(temp[1]);
		}
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				if (a[1]!=b[1]) return a[1]-b[1];
				else return a[0]-b[0];
			}
		});
		for (int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
