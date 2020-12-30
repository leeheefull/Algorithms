/* baekjoon 9012
 * ��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�.
 * �� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���.
 * �� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���.
 * ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�.
 * �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�.
 * ���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 
 * �������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�.
 * 
 * input
 * �Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. �Է��� T���� �׽�Ʈ �����ͷ� �־�����.
 * �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����.
 * �� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����.
 * �ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�. 
 * 
 * output
 * ����� ǥ�� ����� ����Ѵ�.
 * ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��,
 * �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
 * 
 * example
 * 6
 * (())())
 * (((()())()
 * (()())((()))
 * ((()()(()))(((())))()
 * ()()()()(()()())()
 * (()((())()(
 * ->
 * NO
 * NO
 * YES
 * NO
 * YES
 * NO
 * 
 * 3
 * ((
 * ))
 * ())(()
 * ->
 * NO
 * NO
 * NO
 */

package string;

import java.util.Scanner;

public class Parenthesis {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(vps(scan.next()));
		}
	}

	private static String vps(String line) {
		int left = 0;
		int right = 0;

		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '(') {
				left++;
			}
			if (line.charAt(i) == ')') {
				right++;
			}
			if (left < right) {
				return "NO";
			}
		}
		if (left != right) {
			return "NO";
		} else {
			return "YES";
		}
	}
}