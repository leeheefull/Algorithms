/* baekjoon11656
 * ���̻� �迭�� ���ڿ� S�� ��� ���̻縦 ���������� ������ ���� �迭�̴�.
 * baekjoon�� ���̻�� baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n ���� �� 8������ �ְ�,
 * �̸� ���������� �����ϸ�, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon�� �ȴ�.
 * ���ڿ� S�� �־����� ��, ��� ���̻縦 ���������� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� ���ڿ� S�� �־�����. S�� ���ĺ� �ҹ��ڷθ� �̷���� �ְ�, ���̴� 1,000���� �۰ų� ����.
 * 
 * output
 * ù° �ٺ��� S�� ���̻縦 ���������� �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * example
 * baekjoon
 * ->
 * aekjoon
 * baekjoon
 * ekjoon
 * joon
 * kjoon
 * n
 * on
 * oon
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SuffixArray {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String[] suffix = new String[word.length()];
		
		for(int i=0; i<suffix.length; i++)
				suffix[i] = word.substring(i, word.length());
		
		Arrays.sort(suffix);
		for(String item: suffix)
			System.out.println(item);
	}
}