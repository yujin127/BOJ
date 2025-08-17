package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 빙고_2578 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[5][5];
		for (int i=0; i<5;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<5;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		} // 빙고판 입력
		int[] num = new int[25];
		for (int i=0; i<5;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<5;j++) {
				num[i*5+j]= Integer.parseInt(st.nextToken());
			}
		} // 사회자 점수 입력
		
		for (int k=0; k<4; k++) {
			for (int i=0; i<5; i++) {
				for (int j=0; j<5; j++) {
					if(arr[i][j] == num[k]) {
						arr[i][j] = -1;
						break;
					}
				}
			}
		}
		int ans = 4;
		
		for (int k=4; k<25; k++) {
			ans ++;
			for (int i=0; i<5; i++) {
				for (int j=0; j<5; j++) {
					if(arr[i][j] == num[k]) {
						arr[i][j] = -1; 
					}
				}
			}
			// 빙고인지 아닌지 체크 
			int bingo = 0;
			int x1 = 0;
			int x2 = 0;
			for (int i=0; i<5; i++) {
				int r = 0;
				int c = 0;
				if(arr[i][i]==-1) x1++;
				if(arr[i][4-i]==-1) x2++;
				for (int j=0; j<5; j++) {
					// 가로 빙고 체크 
					if (arr[i][j]==-1) r++;
					// 세로 빙고 체크 
					if (arr[j][i]==-1) c++;
				}
				if (r==5) bingo ++;
				if (c==5) bingo ++;
				if (x1==5) bingo ++;
				if (x2==5) bingo ++;
			}
			if (bingo >= 3) break;	
		}
		
		System.out.println(ans);

	}	
}
