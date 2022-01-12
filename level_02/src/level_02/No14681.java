package level_02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 사분면 고르기
public class No14681 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		br.close();

		String res = (x>0 && y>0)? "1" : ((x<0 && y>0)? "2" : ((x<0 && y<0)? "3" : "4"));
		System.out.println(res);
	}
}
