/* baekjoon 1783
 * ���� ����Ʈ�� N �� M ũ�� ü������ ���� ���ʾƷ� ĭ�� ��ġ�� �ִ�.
 * ���� ����Ʈ�� �ǰ��� ���� ü���� ����Ʈ�� �ٸ��� 4�����θ� ������ �� �ִ�.
 * 2ĭ ����, 1ĭ ������
 * 1ĭ ����, 2ĭ ������
 * 1ĭ �Ʒ���, 2ĭ ������
 * 2ĭ �Ʒ���, 1ĭ ������
 * ���� ����Ʈ�� ������ �����Ϸ��� �ϰ�, ������ �ϸ鼭 �湮�� ĭ�� ���� �ִ�� �Ϸ��� �Ѵ�.
 * ���� ����Ʈ�� �̵� Ƚ���� 4������ ���� �ʴٸ�, �̵� ����� ��� �� ���� ����ؾ� �Ѵ�.
 * �̵� Ƚ���� 4������ ���� ���(�湮�� ĭ�� 5�� �̸�)���� �̵� ����� ���� ������ ����.
 * ü������ ũ�Ⱑ �־����� ��, ���� ����Ʈ�� ���࿡�� �湮�� �� �ִ� ĭ�� �ִ� ������ ���غ���.
 * 
 * input
 * ù° �ٿ� ü������ ���� ���� N�� ���� ���� M�� �־�����.
 * N�� M�� 2,000,000,000���� �۰ų� ���� �ڿ����̴�.
 * 
 * output
 * ���� ����Ʈ�� ���࿡�� �湮�� �� �ִ� ĭ�� ������ �ִ��� ����Ѵ�.
 * 
 * example
 * 100 50
 * -> 48
 * 1 1
 * -> 1
 * 17 5
 * -> 4
 * 2 4
 * -> 2
 * 20 4
 * -> 4
 * 
 */

package greedy;

import java.util.Scanner;

public class SickKnight {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		System.out.println(chess(N, M));
	}

	private static int chess(int n, int m) {
		if(n == 1)		return 1;
		else if(n == 2)	return Math.min(4, (m+1)/2);
		else {
			if(m < 7)	return Math.min(4, m);
			else		return m-2;
		}
	}
}