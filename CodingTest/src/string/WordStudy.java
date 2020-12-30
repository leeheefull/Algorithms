/* baekjoon 1157
 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����,
 * �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 * 
 * input
 * ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
 * 
 * output
 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�.
 * ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
 * 
 * example
 * Mississipi
 * -> ?
 * zZa
 * -> Z
 * z
 * -> Z
 * baaa
 * -> A
 */

package string;

import java.util.Scanner;

public class WordStudy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int[] alpa = new int[26];
		int max = -1;
		char result = '?';

		for (int i = 0; i < word.length(); i++) {
			if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				alpa[word.charAt(i) - 'A']++;
			} else {
				alpa[word.charAt(i) - 'a']++;
			}
		}
		for (int i = 0; i < alpa.length; i++) {
			if (max < alpa[i]) {
				max = alpa[i];
				result = (char) (i + 65);
			} else if (alpa[i] == max) {
				result = '?';
			}
		}
		System.out.print(result);
	}
}