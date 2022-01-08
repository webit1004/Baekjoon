package problemSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Level5_3 {	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] cnt = new int[10]; // 0~9 개수 저장
			int total;
			
			total = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
			
			while(total != 0) {
				cnt[total%10]++;
				total/=10;
			}
			
			for(int result : cnt) {
				System.out.println(result);
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
