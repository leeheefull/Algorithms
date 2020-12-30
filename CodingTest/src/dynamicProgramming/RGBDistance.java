/* baekjoon 1149
 * RGB�Ÿ����� ���� N�� �ִ�. �Ÿ��� �������� ��Ÿ�� �� �ְ�, 1�� ������ N�� ���� ������� �ִ�.
 * ���� ����, �ʷ�, �Ķ� �� �ϳ��� ������ ĥ�ؾ� �Ѵ�. ������ ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� �־����� ��,
 * �Ʒ� ��Ģ�� �����ϸ鼭 ��� ���� ĥ�ϴ� ����� �ּڰ��� ���غ���.
 *  - 1�� ���� ���� 2�� ���� ���� ���� �ʾƾ� �Ѵ�.
 *  - N�� ���� ���� N-1�� ���� ���� ���� �ʾƾ� �Ѵ�.
 *  - i(2 �� i �� N-1)�� ���� ���� i-1��, i+1�� ���� ���� ���� �ʾƾ� �Ѵ�.
 *  
 *  input
 *  ù° �ٿ� ���� �� N(2 �� N �� 1,000)�� �־�����.
 *  ��° �ٺ��� N���� �ٿ��� �� ���� ����, �ʷ�, �Ķ����� ĥ�ϴ� ����� 1�� ������ �� �ٿ� �ϳ��� �־�����.
 *  ���� ĥ�ϴ� ����� 1,000���� �۰ų� ���� �ڿ����̴�.
 *  
 *  output
 *  ù° �ٿ� ��� ���� ĥ�ϴ� ����� �ּڰ��� ����Ѵ�.
 *  
 *  example
 *  3
 *  26 40 83
 *  49 60 57
 *  13 89 99
 *  -> 96
 */

package dynamicProgramming;

import java.util.Scanner;

public class RGBDistance {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] dp = new int[n + 1][3];
		int result = 0;

		dp[1][0] = scan.nextInt();
		dp[1][1] = scan.nextInt();
		dp[1][2] = scan.nextInt();

		for (int i = 2; i < n + 1; i++) {
			dp[i][0] = scan.nextInt() + Math.min(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] = scan.nextInt() + Math.min(dp[i - 1][0], dp[i - 1][2]);
			dp[i][2] = scan.nextInt() + Math.min(dp[i - 1][0], dp[i - 1][1]);
		}

		result = Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2]);
		System.out.print(result);
	}
}