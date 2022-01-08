package problemSolving;
import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Level5_1 {

	static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=1; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		// 방법 1
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최솟값, 최댓값 구하기");
		int n;
		
		do {
			System.out.print("입력할 정수의 개수 : ");
			n = sc.nextInt();
		}while(n < 1 || n > 1000000);
		System.out.println();
		
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			n = sc.nextInt();
			if(n >= -1000000 && n <= 1000000) {
				arr[i] = n;
			}
		}
		
		int min = findMin(arr);
		int max = findMax(arr);
		
		System.out.print("최솟값 : " + min);
		System.out.println("  최댓값 : " + max);
		*/
		
		// 방법 2
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 정수의 개수 : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		Arrays.sort(arr); // 배열에 저장된 원소 값을 오름차순으로 정렬
		System.out.println(arr[0] + ' ' + arr[n-1]);
		*/
		
		// 방법 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = 
					new StringTokenizer(br.readLine(), " ");
			
			int index = 0;
			int[] arr = new int[n];
			while(st.hasMoreTokens()) {
				arr[index] = Integer.parseInt(st.nextToken());
				index++;
			}
			
			Arrays.sort(arr);
			System.out.println(arr[0] + " " + arr[n-1]);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
