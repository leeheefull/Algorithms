/* baekjoon 2438
 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
 * 
 * input
 * ù° �ٿ� N(1 �� N �� 100)�� �־�����.
 * 
 * output
 * ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
 * 
 * example
 * 5
 * ->
 * *
 * **
 * ***
 * ****
 * *****
 */

package string;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}