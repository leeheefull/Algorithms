/* baekjoon2577
 * �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� �����
 * 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� A = 150, B = 266, C = 427 �̶��
 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�,
 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 * 
 * input
 * ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.
 * 
 * output
 * ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�.
 * ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� �����
 * 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * example
 * 150
 * 266
 * 427
 * ->
 * 3
 * 1
 * 0
 * 2
 * 0
 * 0
 * 0
 * 2
 * 0
 * 0
 */

package string;

import java.util.Scanner;

public class NumberOfNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String n = (scan.nextInt() * scan.nextInt() * scan.nextInt()) + "";
		int[] num = new int[10];

		for (int i = 0; i < n.length(); i++) {
			num[n.charAt(i) - '0']++;
		}
		for (int v : num) {
			System.out.println(v);
		}
	}
}