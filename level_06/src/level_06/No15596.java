package level_06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No15596 {
	static long sum(int[] a) {
		long sum = 0;
		for(int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		sum(array);
		br.close();
	}

}
