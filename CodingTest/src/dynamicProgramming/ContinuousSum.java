/* baekjoon 1912
 * n���� ������ �̷���� ������ ������ �־�����.
 * �츮�� �� �� ���ӵ� �� ���� ���� �����ؼ� ���� �� �ִ� �� �� ���� ū ���� ���Ϸ��� �Ѵ�.
 * ��, ���� �� �� �̻� �����ؾ� �Ѵ�.
 * ���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����.
 * ���⼭ ������ 12+21�� 33�� ������ �ȴ�.
 * 
 * input
 * ù° �ٿ� ���� n(1 �� n �� 100,000)�� �־����� ��° �ٿ��� n���� ������ �̷���� ������ �־�����.
 * ���� -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.
 * 
 * output
 * ù° �ٿ� ���� ����Ѵ�.
 * 
 * example
 * 10
 * 10 -4 3 1 5 6 -35 12 21 -1
 * -> 33
 * 10
 * 2 1 -4 3 4 -4 6 5 -5 1
 * -> 14
 * 5
 * -1 -2 -3 -4 -5
 * -> -1
 */

package dynamicProgramming;

import java.util.Scanner;

public class ContinuousSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n + 1];
		int[] dp = new int[n + 1];
		int result;

		for (int i = 1; i < n + 1; i++) {
			nums[i] = scan.nextInt();
		}

		dp[1] = nums[1];
		result = dp[1];
		for (int i = 2; i < n + 1; i++) {
			dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
			if (result < dp[i]) {
				result = dp[i];
			}
		}
		System.out.print(result);
	}
}