/* baekjoon 2743 
 * ���ĺ����θ� �̷���� �ܾ �Է¹޾�, �� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� ���� �ҹ��ڿ� �빮�ڷθ� �̷���� �ܾ �־�����. �ܾ��� ���̴� �ִ� 100�̴�.
 * 
 * output
 * ù° �ٿ� �Է����� �־��� �ܾ��� ���̸� ����Ѵ�.
 * 
 * example
 * pulljima
 * -> 8
 */

package string;

import java.util.Scanner;

public class MeasureWordLength {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		System.out.print(word.length());
	}
}