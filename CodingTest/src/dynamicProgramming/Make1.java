/* problem: (baekjoon 1463)
 * ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
 * 1. X�� 3���� ������ ��������, 3���� ������.
 * 2. X�� 2�� ������ ��������, 2�� ������.
 * 3. 1�� ����.
 * ���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�.
 * ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.
 * 
 * input
 * ù° �ٿ� 1���� ũ�ų� ����, 10^6���� �۰ų� ���� ���� N�� �־�����. 
 * 
 * output
 * ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�. 
 */

package dynamicProgramming;

import java.util.Scanner;

public class Make1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int[] dp = new int[x+1];
		dp[1] = 0;
		
		for(int i=2; i<=x; i++) {
			dp[i] = dp[i-1] + 1;
			if(i%3 == 0)
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			if(i%2 == 0)
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
		}	
		System.out.print(dp[x]);
	}
}
// idea
/***************************************
 * dp[1] = 0;
 * dp[2] = 1;			// x/2
 * dp[3] = 1;			// x/3
 * dp[4] = 1+dp[3];		// x-1 -> dp[3]
 * 						// x/2 -> dp[2]
 * dp[5] = 1+dp[4];		// x-1 -> dp[4]
 * dp[6] = 1+dp[2];		// x/3 -> dp[2]
 * 						// x/2 -> dp[3]
 * dp[7] = 1+dp[6];		// x-1 -> dp[6]
 * dp[8] = 1+dp[4];		// x/2 -> dp[4]
 * dp[9] = 1+dp[3];		// x/3 -> dp[3]
 * dp[10] = 1+dp[9];	// x-1 -> dp[9]
 ***************************************/

// example
/*******
 * 2
 * -> 1
 * 10
 * -> 3
 *******/