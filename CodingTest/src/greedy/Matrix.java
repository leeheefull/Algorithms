/* baekjoon 1080
 * 
 * problem
 * 0�� 1�θ� �̷���� ��� A�� ��� B�� �ִ�. �̶�, ��� A�� ��� B�� �ٲٴµ� �ʿ��� ������ Ƚ���� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ����� ��ȯ�ϴ� ������ � 3*3ũ���� �κ� ��Ŀ� �ִ� ��� ���Ҹ� ������ ���̴�. (0 -> 1, 1 -> 0)
 * 
 * input
 * ù° �ٿ� ����� ũ�� N M�� �־�����. N�� M�� 50���� �۰ų� ���� �ڿ����̴�.
 * ��° �ٺ��� N���� �ٿ��� ��� A�� �־�����, �� �����ٺ��� N���� �ٿ��� ��� B�� �־�����.
 * 
 * output
 * ù° �ٿ� ������ ������ ����Ѵ�. ���� A�� B�� �ٲ� �� ���ٸ� -1�� ����Ѵ�.
 */

package greedy;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		char[][] matrix = new char[N][M];
		boolean[][] key = new boolean[N][M];	// init: false
		int cnt = 0;
		
		for(int i=0; i<N; i++)
			matrix[i] = scanner.next().toCharArray();
		
		for(int i=0; i<N; i++) {
			char[] tmp = scanner.next().toCharArray();
			for(int j=0; j<M; j++)
				if(matrix[i][j] != tmp[j]) {
					key[i][j] = true;
					cnt++;
				}
		}
		
		if(cnt == 0)	System.out.print(0);
		else			System.out.print(checker(key));
	}

	private static int checker(boolean[][] key) {
		
		int N = key.length;
		int M = key[0].length;
		if(N<3 || M<3)	return -1;
		int cnt = 0;
		
		for(int i=0; i<=N-3; i++)
			for(int j=0; j<=M-3; j++) {
				if(i == N-3 && !(key[i][j] == key[i+1][j] && key[i][j] == key[i+2][j]))
					return -1;
				if(j == M-3 && !(key[i][j] == key[i][j+1] && key[i][j] == key[i][j+2]))
					return -1;
				if(key[i][j])
					cnt += reverse(key, i, j);
			}

		for(int i=N-2; i<N; i++)
			for(int j=M-2; j<M; j++)
				if(key[N-3][M-3] != key[i][j])
					return -1;
		return cnt;
	}

	private static int reverse(boolean[][] key, int x, int y) {
		for(int i=x; i<x+3; i++)
			for(int j=y; j<y+3; j++)
				key[i][j] = !key[i][j];
		return 1;
	}
}

/* example
 * 3 4
 * 0000
 * 0010
 * 0000
 * 1001
 * 1011
 * 1001
 * -> 2
 */