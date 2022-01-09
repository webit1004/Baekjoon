package level_05;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class No10818 {
	public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 입력받을 숫자 개수
			int n = Integer.parseInt(br.readLine());
			// 숫자들 input
			StringTokenizer st = 
					new StringTokenizer(br.readLine(), " ");
			
			int index = 0;
			int[] arr = new int[n];
			while(st.hasMoreTokens()) {
				arr[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			
			Arrays.sort(arr);
			System.out.println(arr[0] + " " + arr[n-1]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
    }
}
