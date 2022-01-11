package level_01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class prog_test {

	int[][] calculate(int[][] arr1, int[][] arr2){
		int[][] arr3 = null;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				int sum = arr1[i][j] + arr2[i][j];
				arr3[i][j] = sum;
			}
		}
		return arr3;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		StringTokenizer st = new StringTokenizer(n, " ");
		
        
        
	}

}