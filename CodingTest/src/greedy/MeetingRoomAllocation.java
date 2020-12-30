/* problem: baekjoon(1931)
 * �� ���� ȸ�ǽ��� �ִµ� �̸� ����ϰ��� �ϴ� N���� ȸ�ǿ� ���Ͽ� ȸ�ǽ� ���ǥ�� ������� �Ѵ�.
 * �� ȸ�� I�� ���� ���۽ð��� ������ �ð��� �־��� �ְ�, �� ȸ�ǰ� ��ġ�� �ʰ� �ϸ鼭 ȸ�ǽ��� ����� �� �ִ� ȸ���� �ִ� ������ ã�ƺ���.
 * ��, ȸ�Ǵ� �ѹ� �����ϸ� �߰��� �ߴܵ� �� ������ �� ȸ�ǰ� ������ �Ͱ� ���ÿ� ���� ȸ�ǰ� ���۵� �� �ִ�.
 * ȸ���� ���۽ð��� ������ �ð��� ���� ���� �ִ�.
 * �� ��쿡�� �������ڸ��� ������ ������ �����ϸ� �ȴ�.
 * input
 * ù° �ٿ� ȸ���� �� N(1 �� N �� 100,000)�� �־�����.
 * ��° �ٺ��� N+1 �ٱ��� �� ȸ���� ������ �־����µ� �̰��� ������ ���̿� �ΰ� ȸ���� ���۽ð��� ������ �ð��� �־�����.
 * ���� �ð��� ������ �ð��� 231-1���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 * output
 * ù° �ٿ� �ִ� ����� �� �ִ� ȸ���� �ִ� ������ ����Ѵ�.
 */

package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MeetingRoomAllocation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // number of meetings
		int[][] time = new int[n][2]; // time of meetings

		for (int i = 0; i < n; i++) {
			time[i][0] = scanner.nextInt();
			time[i][1] = scanner.nextInt();
		}
		int min = -1; // minimum(min!=0)
		int cnt = 0; // solution

		Arrays.sort(time, (x, y) -> x[1] == y[1] ? x[0] - y[0] : x[1] - y[1]);

		for (int i = 0; i < n; i++) {
			if (min <= time[i][0]) {
				min = time[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
		scanner.close();
	}
}


//example
/********
* 11
* 1 4
* 3 5
* 0 6
* 5 7
* 3 8
* 5 9
* 6 10
* 8 11
* 8 12
* 2 13
* 12 14
* -> 4
********/