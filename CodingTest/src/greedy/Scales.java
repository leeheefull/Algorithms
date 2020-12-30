/* baekjoon 2437
 * �ϳ��� ���� ������ �̿��Ͽ� ������ ���Ը� �����Ϸ��� �Ѵ�.
 * �� ������ �� ���� ������ �����̳� �߸� �÷����� ���ð� �޷� �ְ�, ������ ���̴� ����.
 * ����, ������ ���ʿ��� �����ߵ鸸 ���� �� �ְ�, �ٸ� �ʿ��� ���Ը� �����Ϸ��� ���Ǹ� �÷����� �� �ִ�.
 * ���԰� ���� ������ N���� �����߰� �־��� ��,
 * �� �ߵ��� ����Ͽ� ������ �� ���� ���� ���� ���� �� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ���, ���԰� ���� 3, 1, 6, 2, 7, 30, 1�� 7���� �����߰� �־����� ��,
 * �� �ߵ�� ������ �� ���� ���� ���� ���� �� �ּڰ��� 21�̴�.
 * 
 * input
 * ù ° �ٿ��� �������� ������ ��Ÿ���� ���� ���� N�� �־�����.
 * N�� 1 �̻� 1,000 �����̴�.
 * ��° �ٿ��� �������� ���Ը� ��Ÿ���� N���� ���� ������ ��ĭ�� ���̿� �ΰ� �־�����.
 * �� ���� ���Դ� 1�̻� 1,000,000 �����̴�.
 * 
 * output
 * ù° �ٿ� �־��� �ߵ�� ������ �� ���� ���� ���� ���� �� �ּڰ��� ����Ѵ�.
 * 
 * example
 * 7
 * 3 1 6 2 7 30 1
 * -> 21
 */

package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Scales {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] weight = new int[n];

		for (int i = 0; i < n; i++) {
			weight[i] = scanner.nextInt();
		}

		Arrays.sort(weight);
		System.out.print(min(weight));
	}

	private static int min(int[] weight) {

		int result = 0;
		for (int i = 0; i < weight.length; i++) {
			if (result + 1 < weight[i]) {
				break;
			}
			result += weight[i];
		}
		return result + 1;
	}
}