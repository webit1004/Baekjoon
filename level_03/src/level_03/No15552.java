package level_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
public class No15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(Integer.parseInt(st.nextToken()) 
					+ Integer.parseInt(st.nextToken()) + "\n");
		}
		br.close();
		bw.flush(); // *버퍼 비우기 (필수!)
		bw.close(); // 버퍼 닫기
	}

}
