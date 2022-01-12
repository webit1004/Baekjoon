package level_01;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[2];
		arr[0] = Integer.parseInt(br.readLine()); // 472
		arr[1] = Integer.parseInt(br.readLine()); // 385 
		int b = arr[1];
		int[] numArr = new int[3];
		br.close();
		
		for(int i = 0; i < numArr.length; i++) {
			if(b != 0) {
				numArr[i] = b%10; // 10으로 나눈 나머지
				b/=10; // 10으로 나눈 값을 b에 저장
			}
			//앞에 else를 쓰면 실행안되는 이유?
			System.out.println(arr[0]*numArr[i]); 
		}
		System.out.println(arr[0]*arr[1]);
	}
}
