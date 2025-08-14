package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 방배정_13300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			int[] tmp = { gender, grade };
			list.add(tmp);
		} // 학생 정보 담은 리스트 생성
		int rooms = 0;
		for (int gr = 1; gr <= 6; gr++) {
			for (int ge = 0; ge <= 1; ge++) {
				int cnt = 0;
				for (int i = 0; i < n; i++) {
					if (list.get(i)[0] == ge && list.get(i)[1] == gr) cnt ++;
				}
				if (cnt % k == 0) rooms += cnt/k;
				else rooms += cnt/k +1;
			}
		}
		System.out.println(rooms);
	}
}
