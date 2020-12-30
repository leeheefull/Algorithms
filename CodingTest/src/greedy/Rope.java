/*problem: baekjoon(2217)
 * N(1��N��100,000)���� ������ �ִ�.
 * �� ������ �̿��Ͽ� �̷� ���� ��ü�� ���ø� �� �ִ�.
 * ������ ������ �� ���⳪ ���̰� �ٸ��� ������ �� �� �ִ� ��ü�� �߷��� ���� �ٸ� ���� �ִ�.
 * ������ ���� ���� ������ ���ķ� �����ϸ� ������ ������ �ɸ��� �߷��� ���� �� �ִ�.
 * k���� ������ ����Ͽ� �߷��� w�� ��ü�� ���ø� ��, ������ �������� ��� ���� w/k ��ŭ�� �߷��� �ɸ��� �ȴ�.
 * �� �����鿡 ���� ������ �־����� ��, �� �������� �̿��Ͽ� ���ø� �� �ִ� ��ü�� �ִ� �߷��� ���س��� ���α׷��� �ۼ��Ͻÿ�.
 * ��� ������ ����ؾ� �� �ʿ�� ������, ���Ƿ� �� ���� ������ ��� ����ص� �ȴ�.
 * input
 * ù° �ٿ� ���� N�� �־�����.
 * ���� N���� �ٿ��� �� ������ ��ƿ �� �ִ� �ִ� �߷��� �־�����.
 * �� ���� 10,000�� ���� �ʴ� �ڿ����̴�.
 * output
 * ù° �ٿ� ���� ����Ѵ�.
 */

package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Rope {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] ropes = new int[N];

		for (int i = 0; i < N; i++) {
			ropes[i] = scanner.nextInt();
		}
		int max = 0;
		Arrays.sort(ropes);

		for (int i = 0; i < N; i++) {
			max = Math.max(max, ropes[i] * (N - i));
		}
		System.out.printf("%d\n", max);
		scanner.close();
	}
}
