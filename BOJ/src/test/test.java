package test;

import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		int zero = 0;
        int cnt = 0;
        while (!tmp.equals("1")){
            cnt ++;
            int tmp_zero = 0;
            for (int i=0; i<tmp.length(); i++){
                if (tmp.charAt(i) == '0'){
                    zero ++;
                    tmp_zero++;
                }
            }
            int fin = tmp.length()-tmp_zero;
            Stack<Integer> stack = new Stack<>();
            while (!(fin/2.0==0)){
                stack.push(fin%2);
                fin = fin/2;
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()){
                sb.append(stack.pop());
            }
            tmp = sb.toString();
        }
        int[] answer = new int[2];
        answer[0] = cnt;
        answer[1] = zero;
        System.out.println(answer[0]+", "+answer[1]);
	}
}
