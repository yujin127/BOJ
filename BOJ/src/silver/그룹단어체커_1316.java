package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 그룹단어체커_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = 0; // 그룹 단어 갯수세기
		for (int i=0; i<n; i++) {
			String tmp = br.readLine();
			// 중복 단어 체크할 리스트 
			List<Character> check = new ArrayList<>();
			// 첫번째 단어 무조건 추가해놓기 
			check.add(tmp.charAt(0));
			boolean flag = true; // 그룹단어인지 체크 
			for (int j=1; j<tmp.length(); j++) {
				// 현재단어와 이전단어가 다르면 
				if (tmp.charAt(j) != tmp.charAt(j-1)) {
					// 체크리스트에 해당 단어 없으면 추가 
					if (!check.contains(tmp.charAt(j))){
						check.add(tmp.charAt(j));
					} else { // 체크리스트에 해당 단어 있다면...? 
						flag = false;
					}
				// 현재 단어와 이전단어가 같다면 
				} else {
					continue;
				}
			}
			if (flag) result ++;
		}
		System.out.println(result);
	}
	
}
