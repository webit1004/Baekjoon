package level_03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = br.read();// Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++)
			System.out.println(i);
		br.close();
	}

}
