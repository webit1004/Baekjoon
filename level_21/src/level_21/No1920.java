package level_21;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이진 탐색(이분 탐색)
public class No1920 {

//	static int binSearch(int key) {
//		int lo = 0;
//		int hi = A.length - 1;
//		int ctr = (lo + hi) / 2;
//		
//		do {
//			if(key == A[ctr]) {
//				return 1;
//			}
//			else if(key < A[ctr])
//				hi = ctr - 1;
//			else
//				lo = ctr + 1;
//		}while(lo <= hi);
//		
//		return -1;
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 배열 요소 저장
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A); // 배열 정렬 필요
		
		int num = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int result;
		
		for(int i = 0; i < num; i++) {
			result = Arrays.binarySearch(A, Integer.parseInt(st.nextToken()));
			if(result >= 0)
				sb.append(1).append("\n");
			else
				sb.append(0).append("\n");
		}
		System.out.println(sb);
		
		br.close();
	}
}
