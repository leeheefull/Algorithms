/* problem baekjoon(11047)
 * �ر԰� ������ �ִ� ������ �� N�����̰�, ������ ������ �ſ� ���� ������ �ִ�.
 * ������ ������ ����ؼ� �� ��ġ�� ���� K�� ������� �Ѵ�.
 * �̶� �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� N�� K�� �־�����. (1 �� N �� 10, 1 �� K �� 100,000,000)
 * ��° �ٺ��� N���� �ٿ� ������ ��ġ Ai�� ������������ �־�����.
 * (1 �� Ai �� 1,000,000, A1 = 1, i �� 2�� ��쿡 Ai�� Ai-1�� ���)
 * output
 * ù° �ٿ� K���� ����µ� �ʿ��� ���� ������ �ּڰ��� ����Ѵ�.
 */

package greedy;

import java.util.Scanner;

public class Coin0 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();		// number of coins
		int K = scanner.nextInt();		// sum
		int[] A = new int[N];			// value of coin
		for(int i=0; i<N; i++)
			A[i] = scanner.nextInt();
		int result = 0;
		
		for(int i=N-1; -1<i; i--)
			if(A[i]<=K) {
				result += K/A[i];
				K = K%A[i];
			}
		
		System.out.print(result);
		scanner.close();
	}
}

// example
/**********
 * 10 4200
 * 1
 * 5
 * 10
 * 50
 * 100
 * 500
 * 1000
 * 5000
 * 10000
 * 50000
 * -> 6
 **********/