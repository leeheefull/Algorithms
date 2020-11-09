/* baekjoon 11726
 * 2��n ũ���� ���簢���� 1��2, 2��1 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Ʒ� �׸��� 2��5 ũ���� ���簢���� ä�� �� ���� ����� ���̴�.
 * �׸�
 * 
 * input
 * ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)
 * 
 * output
 * ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�.
 * 
 * example
 * 2
 * -> 2
 * 9
 * -> 55
 */

package dynamicProgramming;

import java.util.Scanner;

public class Tiling2N {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] dp = new int[n+1];
		
		dp[0] = 1;	dp[1] = 1;
		for(int i=2; i<=n; i++)
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
			
		System.out.println(dp[n]);
	}
}