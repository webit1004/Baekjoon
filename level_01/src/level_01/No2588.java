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
				numArr[i] = b%10; // 10���� ���� ������
				b/=10; // 10���� ���� ���� b�� ����
			}
			//�տ� else�� ���� ����ȵǴ� ����?
			System.out.println(arr[0]*numArr[i]); 
		}
		System.out.println(arr[0]*arr[1]);
	}
}
