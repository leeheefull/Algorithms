/* baekjoon 1152
 * ���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����.
 * �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 * 
 * input
 * ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����.
 * �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�.
 * �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����.
 * ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.
 * 
 * output
 * ù° �ٿ� �ܾ��� ������ ����Ѵ�.
 * 
 * example
 * The Curious Case of Benjamin Button
 * -> 6
 *  Mazatneunde Wae Teullyeoyo
 *  -> 3
 *  Teullinika Teullyeotzi 
 *  -> 2
 */

package string;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		int cnt = 0;
		
		if(!sentence.equals("") && !sentence.equals(" ")) {
			cnt = 1;
			for(int i=1; i<sentence.length()-1; i++)
				if(sentence.charAt(i) == ' ')
					cnt++;
		}
		System.out.print(cnt);
	}
}