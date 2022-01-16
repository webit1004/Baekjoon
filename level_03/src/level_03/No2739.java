package level_03;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n*i);
		}
	}
}
