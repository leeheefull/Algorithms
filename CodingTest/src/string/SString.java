/* baekjoon9086
 * ���ڿ��� �Է����� �ָ� ���ڿ��� ù ���ڿ� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * �Է��� ù �ٿ��� �׽�Ʈ ���̽��� ���� T(1 �� T �� 10)�� �־�����. 
 * �� �׽�Ʈ ���̽��� �� �ٿ� �ϳ��� ���ڿ��� �־�����. 
 * ���ڿ��� ���ĺ� A~Z �빮�ڷ� �̷������ ���ĺ� ���̿� ������ ������ ���ڿ��� ���̴� 1000���� �۴�.
 * 
 * output
 * �� �׽�Ʈ ���̽��� ���ؼ� �־��� ���ڿ��� ù ���ڿ� ������ ���ڸ� �����Ͽ� ����Ѵ�.
 * 
 * example
 * 3
 * ACDKJFOWIEGHE
 * O
 * AB
 * -> 
 * AE
 * OO
 * AB
 */

package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			char[] word = br.readLine().toCharArray();
			bw.write(word[0]);
			bw.write(word[word.length-1]);
			bw.write('\n');
		}
		bw.flush();
	}
}
