/* problem: (baekjoon 1541)
 * �����̴� ����� +, -, �׸��� ��ȣ�� ������ ���̰� �ִ� 50�� ���� �������.
 * �׸��� ���� �����̴� ��ȣ�� ��� ������.
 * �׸��� ���� �����̴� ��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ������� �Ѵ�.
 * ��ȣ�� ������ �ļ� �� ���� ���� �ּҷ� ����� ���α׷��� �ۼ��Ͻÿ�.
 * input
 * ù° �ٿ� ���� �־�����. ���� '0'~'9', '+', �׸��� '-'������ �̷���� �ְ�, ���� ó���� ������ ���ڴ� �����̴�.
 * �׸��� �����ؼ� �� �� �̻��� �����ڰ� ��Ÿ���� �ʰ�, 5�ڸ����� ���� ���ӵǴ� ���ڴ� ����.
 * ���� 0���� ������ �� �ִ�.
 * output
 * ù° �ٿ� ������ ����Ѵ�.
 */

package greedy;

import java.util.Scanner;

public class LostParenthesis {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		String[] splitMinus = data.split("\\-");	// split minus
		
		int result = plus(splitMinus[0]);
		for(int i=1; i<splitMinus.length; i++)
			result -= plus(splitMinus[i]);
		
		System.out.print(result);
		scanner.close();
	}

	private static int plus(String splitMinus) {
		
		String[] num = splitMinus.split("\\+");		// split plus
		
		int result = 0;
		for(String item: num)
			result += Integer.parseInt(item);
		
		return result;
	}
}

// example
/***********
 * 55-50+40
 * -> -35
 ***********/