/* baekjoon 11053
 * ���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡
 * ���� �� �����ϴ� �κ� ������ A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�.
 * 
 * input
 * ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.
 * ��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)
 * 
 * output
 * ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ����Ѵ�.
 * 
 * example
 * 6
 * 10 20 10 30 20 50
 * -> 4
 */

package dynamicProgramming;

import java.util.Scanner;

public class LIS {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] dp = new int[n];
		int max = 0;
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
			dp[i] = 1;
			
			for(int j=0; j<i; j++)
				if(a[j]<a[i] && dp[i]<dp[j]+1)
					dp[i] = dp[j]+1;
			
			if(max<dp[i])
				max = dp[i];
		}
		System.out.print(max);
	}
}