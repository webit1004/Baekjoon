package level_07;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		String str = br.readLine();
		
		for(int i = 0; i < n; i++) {
			sum += str.charAt(i) - '0';
		}
		
		System.out.println(sum);
		br.close();
	}

}