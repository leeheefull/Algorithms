/* baekjoon 11726
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
 * 그림
 * 
 * input
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 
 * output
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
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