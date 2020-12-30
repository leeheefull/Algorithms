/* problem: (baekjoon 1463)
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * 1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * 2. X가 2로 나누어 떨어지면, 2로 나눈다.
 * 3. 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
 * 연산을 사용하는 횟수의 최솟값을 출력하시오.
 * 
 * input
 * 첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다. 
 * 
 * output
 * 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다. 
 */

package dynamicProgramming;

import java.util.Scanner;

public class Make1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int[] dp = new int[x + 1];
		dp[1] = 0;

		for (int i = 2; i <= x; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}
		}
		System.out.print(dp[x]);
	}
}

// example
/*******
 * 2 -> 1 10 -> 3
 *******/