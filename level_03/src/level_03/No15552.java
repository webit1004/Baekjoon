package level_03;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

// Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
// BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
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
		bw.flush(); // *���� ���� (�ʼ�!)
		bw.close(); // ���� �ݱ�
	}

}
