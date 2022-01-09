package level_01;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No1000 {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int index = 0;
			int[] arr = new int[2];
			
			while(st.hasMoreTokens()) {
				arr[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			
			System.out.println(arr[0]+arr[1]);
			
		}catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
