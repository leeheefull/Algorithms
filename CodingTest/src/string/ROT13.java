/* baekjoon11655
 * ROT13�� ī�̻縣 ��ȣ�� �������� ���� ���ĺ��� 13���ھ� �о �����.
 * ���� ���, "Baekjoon Online Judge"�� ROT13���� ��ȣȭ�ϸ� "Onrxwbba Bayvar Whqtr"�� �ȴ�.
 * ROT13���� ��ȣȭ�� ������ ���� �������� �ٲٷ��� ��ȣȭ�� ���ڿ��� �ٽ� ROT13�ϸ� �ȴ�.
 * �տ��� ��ȣȭ�� ���ڿ� "Onrxwbba Bayvar Whqtr"�� �ٽ� ROT13�� �����ϸ� "Baekjoon Online Judge"�� �ȴ�.
 * ROT13�� ���ĺ� �빮�ڿ� �ҹ��ڿ��� ������ �� �ִ�.
 * ���ĺ��� �ƴ� ���ڴ� ���� ���� �״�� ���� �־�� �Ѵ�.
 * ���� ���, "One is 1"�� ROT13���� ��ȣȭ�ϸ� "Bar vf 1"�� �ȴ�.
 * ���ڿ��� �־����� ��, "ROT13"���� ��ȣȭ�� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� ���ĺ� �빮��, �ҹ���, ����, ���ڷθ� �̷���� ���ڿ� S�� �־�����. S�� ���̴� 100�� ���� �ʴ´�.
 * 
 * output
 * ù° �ٿ� S�� ROT13���� ��ȣȭ�� ������ ����Ѵ�.
 * 
 * example
 * Baekjoon Online Judge
 * -> Onrxwbba Bayvar Whqtr
 * One is 1
 * -> Bar vf 1
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		for (int i = 0; i < line.length(); i++) {
			char before = line.charAt(i);
			if (!(('A' <= before && before <= 'Z') || ('a' <= before && before <= 'z'))) {
				System.out.print(before);
			} else {
				char after = (char) (before + 13);
				if (('A' <= before && before <= 'Z') && ('A' <= after && after <= 'Z')) {
					System.out.print(after);
				} else if (('a' <= before && before <= 'z') && ('a' <= after && after <= 'z')) {
					System.out.print(after);
				} else {
					System.out.print((char) (after - 26));
				}
			}
		}
	}
}