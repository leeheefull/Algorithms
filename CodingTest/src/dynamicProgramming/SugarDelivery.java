/* problem: baekjoon(2839)
 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�.
 * ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�.
 * �������忡�� ����� ������ ������ ����� �ִ�.
 * ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�.
 * ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
 * output
 * ����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
 */

package dynamicProgramming;

import java.util.Scanner;

public class SugarDelivery {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); // weight
		int bags = 0; // number of bags

		while (true) {
			if (N % 5 == 0) {
				System.out.print(N / 5 + bags);
				break;
			} else if (N <= 0) {
				System.out.print(-1);
				break;
			}
			N -= 3;
			bags++;
		}
		scanner.close();
	}
}

// example
/***********
 * 18 -> 4 4 -> -1 6 -> 2 9 -> 3 11 -> 3
 ***********/