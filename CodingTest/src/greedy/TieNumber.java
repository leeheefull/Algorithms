/* baekjoon 1744
 * ���̰� N�� ������ �־����� ��, �� ������ ���� ���Ϸ��� �Ѵ�.
 * ������, �׳� �� ������ ���� ��� ���ؼ� ���ϴ� ���� �ƴ϶�, ������ �� ���� �������� �Ѵ�.
 * � ���� �������� �� ��, ��ġ�� ������� ���� �� �ִ�.
 * ������, ���� ��ġ�� �ִ� ��(�ڱ� �ڽ�)�� ���� ���� �Ұ����ϴ�.
 * �׸��� � ���� ���� �Ǹ�, ������ ���� ���� �� ���� ���� ���� ���� �Ŀ� ���Ѵ�.
 * ���� ���, � ������ {0, 1, 2, 4, 3, 5}�� ��, �׳� �� ������ ���� ���ϸ� 0+1+2+4+3+5 = 15�̴�.
 * ������, 2�� 3�� ����, 4�� 5�� ���� �Ǹ�, 0+1+(2*3)+(4*5) = 27�� �Ǿ� �ִ밡 �ȴ�.
 * ������ ��� ���� �� �ѹ��� ���ų�, �ƴϸ� ���� �ʾƾ��Ѵ�.
 * ������ �־����� ��, ������ �� ���� ������ ������ ��, �� ���� �ִ밡 �ǰ� �ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� ������ ũ�� N�� �־�����.
 * N�� 10,000���� �۴�. ��° �ٺ��� N���� �ٿ�, ������ �� ���� �־�����.
 * ������ ���� -10,000���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
 * 
 * output
 * ���� ���� �ִ밡 ������ ������ �� ���� ����Ѵ�. ������ �׻� 231���� �۴�.
 * 
 * example
 * 4
 * -1
 * 2
 * 1
 * 3
 * -> 6
 */

package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class TieNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] numbers = new int[N];
		int start = 0;
		int end = N - 1;
		int result = 0;

		for (int i = 0; i < N; i++) {
			numbers[i] = scanner.nextInt();
		}
		Arrays.sort(numbers);

		for (; start < end; start += 2) {
			if (numbers[start] < 1 && numbers[start + 1] < 1) {
				result += numbers[start] * numbers[start + 1];
			} else {
				break;
			}
		}
		for (; 0 < end; end -= 2) {
			if (1 < numbers[end] && 1 < numbers[end - 1]) {
				result += numbers[end] * numbers[end - 1];
			} else {
				break;
			}
		}
		for (; start <= end; start++) {
			result += numbers[start];
		}
		System.out.println(result);
	}
}

/* example
 * 4
 * 2 1 1 0
 * -> 4 2 1 3
 * 8
 * 3 2 1 4 6 0 7 5
 * 6 3 2 1 4 8 5 7
 */