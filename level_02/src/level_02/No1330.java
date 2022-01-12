package level_02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//두 수 비교하기
public class No1330 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		br.close();
		
		String str = (a<b)? "<" : ((a>b ? ">" : "=="));
		System.out.println(str);
	}

}
