package level_02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 성적 판별
public class No9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(br.readLine());
		br.close();
		
		String str = 
				s >= 90 ? "A" : (
                s >= 80 ? "B" : (
				s >= 70 ? "C" : (
                s >= 60 ? "D" : "F"
                )));
		System.out.println(str);
	}
}
