/* baekjoon 9095
 * ���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�.
 * ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * ���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����.
 * n�� ����̸� 11���� �۴�.
 * 
 * output
 * �� �׽�Ʈ ���̽�����, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
 * 
 * example
 * 3
 * 4
 * 7
 * 10
 * ->
 * 7
 * 44
 * 274
 */

package dynamicProgramming;

import java.util.Scanner;

public class Add123 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[] dp = new int[11];
		
		dp[1] = 1; dp[2] = 2; dp[3] = 4;
		for(int i=4; i<dp.length; i++)
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		
		while(T-->0)
			System.out.println(dp[scan.nextInt()]);
	}
}