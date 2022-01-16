package level_06;

public class No4673 {
	static int isSelfNum(int num) {
		int sum = num;
		
		while(num != 0) {
			sum += (num % 10);
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		boolean[] ck = new boolean[100001];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			int sum = isSelfNum(i);
			
			if(sum < 10001)
				ck[sum] = true;
			
			if(!ck[i]) // false인 인덱스(selfnumber) 출력 
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
