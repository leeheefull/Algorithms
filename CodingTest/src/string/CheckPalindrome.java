/* baekjoon10988
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ �־�����.
 * �̶�, �� �ܾ �Ӹ�������� �ƴ��� Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Ӹ�����̶� ������ ���� ���� �Ųٷ� ���� �� �Ȱ��� �ܾ ���Ѵ�. 
 * level, noon�� �Ӹ�����̰�, baekjoon, online, judge�� �Ӹ������ �ƴϴ�.
 * 
 * input
 * ù° �ٿ� �ܾ �־�����.
 * �ܾ��� ���̴� 1���� ũ�ų� ����, 100���� �۰ų� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * output
 * ù° �ٿ� �Ӹ�����̸� 1, �ƴϸ� 0�� ����Ѵ�.
 * 
 * example
 * level
 * -> 1
 * baekjoon
 * -> 0
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int check = 1;
		
		for(int i=0; i<word.length()/2; i++)
			if(word.charAt(i) != word.charAt(word.length()-1-i)) {
				check = 0;
				break;
			}
			
		System.out.print(check);
	}
}