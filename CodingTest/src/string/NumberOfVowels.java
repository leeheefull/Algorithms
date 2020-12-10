/* baekjoon10987
 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ �־�����. �̶�, ����(a, e, i, o, u)�� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� �ܾ �־�����. �ܾ��� ���̴� 1���� ũ�ų� ����, 100���� �۰ų� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * output
 * ù° �ٿ� ������ ������ ����Ѵ�.
 * 
 * example
 * baekjoon
 * -> 4
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfVowels {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int result = 0;
		
		for(int i=0; i<word.length(); i++)
			if(check(word.charAt(i)))
				result++;
		
		System.out.print(result);
	}
	
	private static boolean check(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			return true;
		else
			return false;
	}
}