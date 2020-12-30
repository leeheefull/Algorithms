/* baekjoon1032
 * ���� -> ���� -> cmd�� �ĺ���.
 * ���� ȭ���� ���� ���δ�.
 * ���⼭ dir�̶�� ġ�� �� ���丮�� �ִ� ������丮�� ������ ��� ���´�.
 * �̶� ���ϴ� ������ ã������ ������ ���� �ϸ� �ȴ�.
 * dir *.exe��� ġ�� Ȯ���ڰ� exe�� ������ �� ���´�.
 * "dir ����"�� ���� ġ�� �� ���Ͽ� �´� ���ϸ� �˻� ����� ���´�.
 * ���� ���, dir a?b.exe��� �˻��ϸ� ���ϸ��� ù ��° ���ڰ� a�̰�, �� ��° ���ڰ� b�̰�, Ȯ���ڰ� exe�� ���� ��� ���´�.
 * �̶� �� ��° ���ڴ� �ƹ��ų� ���͵� �ȴ�.
 * ���� ���, acb.exe, aab.exe, apb.exe�� ���´�.
 * �� ������ �˻� ����� ���� �־����� ��, �������� �� �ľ� �� ����� ���������� ����ϴ� �����̴�.
 * ���Ͽ��� ���ĺ��� "." �׸��� "?"�� ���� �� �ִ�.
 * �����ϸ� ?�� ���� ��� �Ѵ�.
 * �� ���丮���� �˻� ����� ���� ���ϸ� �ִٰ� �����ϰ�, ���� �̸��� ���̴� ��� ����.
 * 
 * input
 * ù° �ٿ� ���� �̸��� ���� N�� �־�����.
 * ��° �ٺ��� N���� �ٿ��� ���� �̸��� �־�����.
 * N�� 50���� �۰ų� ���� �ڿ����̰� ���� �̸��� ���̴� ��� ���� ���̴� �ִ� 50�̴�.
 * �����̸��� ���ĺ��� "." �׸��� "?"�θ� �̷���� �ִ�.
 * 
 * output
 * ù° �ٿ� ������ ����ϸ� �ȴ�.
 * 
 * example
 * 3
 * config.sys
 * config.inf
 * configures
 * -> config????
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMD {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = new String[n];
		String result = "";

		for (int i = 0; i < n; i++) {
			input[i] = br.readLine();
		}
		for (int i = 0; i < input[0].length(); i++) {
			boolean dif = false;
			for (int j = 0; j < n - 1; j++) {
				if (input[j].charAt(i) != input[j + 1].charAt(i)) {
					dif = true;
					break;
				}
			}
			if (dif) {
				result += "?";
			} else {
				result += input[0].charAt(i);
			}
		}
		System.out.print(result);
	}
}