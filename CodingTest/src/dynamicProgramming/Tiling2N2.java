/* baekjoon 11727
 * 2��n ���簢���� 1��2, 2��1�� 2��2 Ÿ�Ϸ� ä��� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Ʒ� �׸��� 2��17 ���簢���� ä�� �Ѱ��� ���̴�.
 * 
 * input
 * ù° �ٿ� n�� �־�����. (1 �� n �� 1,000)
 * 
 * output
 * ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�.
 * 
 * example
 * 2
 * -> 3
 * 8
 * -> 171
 * 12
 * -> 2731
 */

package dynamicProgramming;

import java.util.Scanner;

public class Tiling2N2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] dp = new int[n + 1];

		dp[1] = 1;
		if (1 < n) {
			dp[2] = 3;
		}
		for (int i = 3; i < n + 1; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007;
		}
		System.out.print(dp[n]);
	}
}