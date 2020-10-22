/* baekjoon 11720
 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 * 
 * output
 * �Է����� �־��� ���� N���� ���� ����Ѵ�.
 * 
 * example
 * 1
 * 1
 * -> 1
 * 5
 * 54321
 * -> 15
 * 25
 * 7000000000000000000000000
 * -> 7
 * 11
 * 10987654321
 * -> 46
 */
package string;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String number = scanner.next();
		int result = 0;
		
		for(int i=0; i<n; i++)
			result += number.charAt(i)-'0';
		System.out.print(result);
	}
}