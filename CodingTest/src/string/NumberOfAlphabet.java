/* baekjoon10808
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����.
 * �� ���ĺ��� �ܾ �� ���� ���ԵǾ� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * output
 * �ܾ ���ԵǾ� �ִ� a�� ����, b�� ����, ��, z�� ������ �������� �����ؼ� ����Ѵ�.
 * 
 * example
 * baekjoon
 * -> 1 1 0 0 1 0 0 0 0 1 1 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0
 */

package string;

import java.util.Scanner;

public class NumberOfAlphabet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int[] alphabet = new int[26];
		
		for(int i=0; i<word.length(); i++)
			alphabet[word.charAt(i)-'a']++;
		
		for(int i=0; i<alphabet.length; i++)
			System.out.print(alphabet[i] + " ");
	}
}