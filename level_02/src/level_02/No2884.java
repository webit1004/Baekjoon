package level_02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 알람 시계
public class No2884 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int hr = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[1]);
		br.close();
		
		if(min >= 45) min = min - 45;
		else {
			hr = (hr == 0)? 23 : hr - 1;
			min = min + 15;
		}
		
		System.out.println(hr + " " + min);
	}
}
