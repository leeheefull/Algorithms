/* baekjoon1439
 * �ټ��̴� 0�� 1�θ� �̷���� ���ڿ� S�� ������ �ִ�. 
 * �ټ��̴� �� ���ڿ� S�� �ִ� ��� ���ڸ� ���� ���� ������� �Ѵ�. 
 * �ټ��̰� �� �� �ִ� �ൿ�� S���� ���ӵ� �ϳ� �̻��� ���ڸ� ��� ��� ������ ���̴�. 
 * ������ ���� 1�� 0����, 0�� 1�� �ٲٴ� ���� �ǹ��Ѵ�.
 * ���� ��� S=0001100 �� ��,
 * ��ü�� �������� 1110011�� �ȴ�.
 * 4��° ���ں��� 5��° ���ڱ��� �������� 1111111�� �Ǿ 2�� ���� ��� ���� ���ڷ� ���� �� �ִ�.
 * ������, ó������ 4��° ���ں��� 5��° ���ڱ��� ���ڸ� �������� �� ���� 0000000�� �Ǿ 1�� ���� ��� ���� ���ڷ� ���� �� �ִ�.
 * ���ڿ� S�� �־����� ��, �ټ��̰� �ؾ��ϴ� �ൿ�� �ּ� Ƚ���� ����Ͻÿ�.
 * 
 * intput
 * ù° �ٿ� ���ڿ� S�� �־�����. S�� ���̴� 100������ �۴�.
 * 
 * output
 * ù° �ٿ� �ټ��̰� �ؾ��ϴ� �ൿ�� �ּ� Ƚ���� ����Ѵ�.
 * 
 * example
 * 0001100
 * -> 1
 */

package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TurnOver {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int zero = 0;
		int one = 0;

		if (str[0] == '0') {
			zero++;
		} else {
			one++;
		}

		for (int i = 1; i < str.length; ++i) {
			if (str[i] == '0' && str[i - 1] == '1') {
				zero++;
			} else if (str[i] == '1' && str[i - 1] == '0') {
				one++;
			}
		}
		System.out.println(Math.min(one, zero));
	}
}
