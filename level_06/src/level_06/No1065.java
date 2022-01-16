package level_06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No1065 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for(int i = 1; i < n+1; i++) {
			if(i < 100) 
				cnt += 1;
			else if(i < 1000) {
				int hun = i / 100;
				int ten = (i/10) % 10;
				int one = i % 10;
				
				if(hun - ten == ten - one)
					cnt += 1;
			}
		}
		
		System.out.println(cnt);
		br.close();
	}

}
