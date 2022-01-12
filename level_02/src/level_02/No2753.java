package level_02;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//À±³â ÆÇº°
public class No2753 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int yr = Integer.parseInt(br.readLine());
		int result = 0;
		br.close();
		
		while(yr >= 1 && yr <= 4000) {
			if(yr % 4 == 0)
				if(yr % 400 == 0 || yr % 100 != 0) {
					result = 1;
					break;
				}
			result = 0;
			break;
		}
		System.out.println(result);
	}
}
