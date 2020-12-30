/* baekjoon 10953
 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����.
 * A�� B�� �޸�(,)�� ���еǾ� �ִ�. (0 < A, B < 10)
 * 
 * output
 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
 * 
 * example
 * 5
 * 1,1
 * 2,3
 * 3,4
 * 9,8
 * 5,2
 * ->
 * 2
 * 5
 * 7
 * 17
 * 7
 */

package string;

import java.util.Scanner;

public class APlusB6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			String tmp = scan.next();
			result[i] = tmp.charAt(0) + tmp.charAt(2) - 96;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
	}
}