/* baekjoon 2193
 * 0�� 1�θ� �̷���� ���� �������� �Ѵ�.
 * �̷��� ������ �� Ư���� ������ ���� �͵��� �ִµ�, �̵��� ��ģ��(pinary number)�� �Ѵ�.
 * ��ģ���� ������ ������ �����Ѵ�.
 * ��ģ���� 0���� �������� �ʴ´�.
 * ��ģ�������� 1�� �� �� �������� ��Ÿ���� �ʴ´�.
 * ��, 11�� �κ� ���ڿ��� ���� �ʴ´�.
 * ���� ��� 1, 10, 100, 101, 1000, 1001 ���� ��ģ���� �ȴ�.
 * ������ 0010101�̳� 101101�� ���� 1, 2�� ��Ģ�� ����ǹǷ� ��ģ���� �ƴϴ�.
 * N(1 �� N �� 90)�� �־����� ��, N�ڸ� ��ģ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� N�� �־�����.
 * 
 * output
 * ù° �ٿ� N�ڸ� ��ģ���� ������ ����Ѵ�.
 * 
 * example
 * 3
 * -> 2
 */

package dynamicProgramming;

import java.util.Scanner;

public class PinaryNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] dp = new long[n + 1];

		if (0 < n) {
			dp[1] = 1;
		}
		if (1 < n) {
			dp[2] = 1;
		}
		for (int i = 3; i < n + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.print(dp[n]);
	}
}