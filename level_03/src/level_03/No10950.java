package level_03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class No10950 {

	public static void main(String[] args) throws IOException {
		// 规过1
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] sum = new int[t];
		
		for(int j = 0; j < t; j++) {
			String[] str = br.readLine().split(" ");
			sum[j] = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
		}
		for(int i = 0; i < t; i++) {	
			System.out.println(sum[i]);
		}
		*/
		// 规过2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken())
					+ Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
