/* baekjoon5052
 * ��ȭ��ȣ ����� �־�����.
 * �̶�, �� ����� �ϰ����� �ִ��� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ��ȭ��ȣ ����� �ϰ����� �����Ϸ���, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ����� �Ѵ�.
 * ���� ���, ��ȭ��ȣ ����� �Ʒ��� ���� ��츦 �����غ���
 *  - �����ȭ: 911
 *  - ���: 97 625 999
 *  - ����: 91 12 54 26
 *  �� ��쿡 �����̿��� ��ȭ�� �� �� �ִ� ����� ����. 
 *  ��ȭ�⸦ ��� ������ ��ȣ�� ó�� �� �ڸ��� ������ ���� �ٷ� �����ȭ�� �ɸ��� �����̴�. 
 *  ����, �� ����� �ϰ����� ���� ����̴�.
 *  
 *  input
 *  ù° �ٿ� �׽�Ʈ ���̽��� ���� t�� �־�����. (1 �� t �� 50) 
 *  �� �׽�Ʈ ���̽��� ù° �ٿ��� ��ȭ��ȣ�� �� n�� �־�����. (1 �� n �� 10000) 
 *  ���� n���� �ٿ��� ��Ͽ� ���ԵǾ� �ִ� ��ȭ��ȣ�� �ϳ��� �־�����. 
 *  ��ȭ��ȣ�� ���̴� ���� 10�ڸ��̸�, ��Ͽ� �ִ� �� ��ȭ��ȣ�� ���� ���� ����.
 *  
 *  output
 *  �� �׽�Ʈ ���̽��� ���ؼ�, �ϰ��� �ִ� ����� ��쿡�� YES, �ƴ� ��쿡�� NO�� ����Ѵ�.
 *  
 *  example
 *  2
 *  3
 *  911
 *  97625999
 *  91125426
 *  5
 *  113
 *  12340
 *  123440
 *  12345
 *  98346
 *  -> 
 *  NO
 *  YES
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumberList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String[] lines = new String[n];
			boolean isConsistency = true;

			for (int i = 0; i < n; i++) {
				lines[i] = br.readLine();
			}
			Arrays.sort(lines, new Comparator<String>() {
				@Override
				public int compare(String str1, String str2) {
					return str1.compareTo(str2);
				}
			});
			for (int i = 1; i < n; i++) {
				if (lines[i].startsWith(lines[i - 1])) {
					isConsistency = false;
					break;
				}
			}
			System.out.println(isConsistency ? "YES" : "NO");
		}
	}
}