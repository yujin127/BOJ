package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class 회사에있는사람_7785 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<>();
		for (int w=0; w<n; w++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			map.put(st.nextToken(), st.nextToken());
		}
		List<String> result = new ArrayList<>();
		
		for (String key : map.keySet()) {
			if (map.get(key).equals("enter")) result.add(key);
		}
		Collections.sort(result);
		for (int i=result.size()-1; i>=0; i--) {
			System.out.println(result.get(i));
		}
	}
}
