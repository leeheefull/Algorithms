/* baekjoon 1932
 *         7
 *       3   8
 *     8   1   0
 *   2   7   4   4
 * 4   5   2   6   5
 * �� �׸��� ũ�Ⱑ 5�� ���� �ﰢ���� �� ����̴�.
 * �� ���� 7���� �����ؼ� �Ʒ��� �ִ� �� �� �ϳ��� �����Ͽ� �Ʒ������� ������ ��,
 * �������� ���õ� ���� ���� �ִ밡 �Ǵ� ��θ� ���ϴ� ���α׷��� �ۼ��϶�.
 * �Ʒ����� �ִ� ���� ���� ������ ���õ� ���� �밢�� ���� �Ǵ� �밢�� �����ʿ� �ִ� �� �߿����� ������ �� �ִ�.
 * �ﰢ���� ũ��� 1 �̻� 500 �����̴�.
 * �ﰢ���� �̷�� �ִ� �� ���� ��� �����̸�, ������ 0 �̻� 9999 �����̴�.
 * 
 * input
 * ù° �ٿ� �ﰢ���� ũ�� n(1 �� n �� 500)�� �־�����, ��° �ٺ��� n+1��° �ٱ��� ���� �ﰢ���� �־�����.
 * 
 * output
 * ù° �ٿ� ���� �ִ밡 �Ǵ� ��ο� �ִ� ���� ���� ����Ѵ�.
 * 
 * example
 * 5
 * 7
 * 3 8
 * 8 1 0
 * 2 7 4 4
 * 4 5 2 6 5
 * -> 30
 */

package dynamicProgramming;

import java.util.Scanner;

public class IntegerTriangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] dp = new int[n][n];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<=i; j++)
				dp[i][j] = scan.nextInt();
		
		for(int i=n-2; 0<=i; i--)
			for(int j=0; j<=i; j++)
				dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]) + dp[i][j];
		
		System.out.print(dp[0][0]);
	}
}