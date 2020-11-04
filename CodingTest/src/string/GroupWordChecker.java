/* baekjoon 1316
 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�.
 * ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����,
 * kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������,
 * aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
 * �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input 
 * ù° �ٿ� �ܾ��� ���� N�� ���´�.
 * N�� 100���� �۰ų� ���� �ڿ����̴�.
 * ��° �ٺ��� N���� �ٿ� �ܾ ���´�.
 * �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
 * 
 * output
 * ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.
 * 
 * example
 * 3
 * happy
 * new
 * year
 * -> 3
 * 4
 * aba
 * abab
 * abcabc
 * a
 * -> 1
 */

package string;

import java.util.Scanner;

public class GroupWordChecker {
	 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 0;
		
		for (int i=0; i<n; i++)
			if (checker(scan.next()) == true)
				result++;
		
		System.out.println(result);
	}
 
	public static boolean checker(String word) {

		boolean[] check = new boolean[26];
		int prev = 0;

		for(int i = 0; i < word.length(); i++) {
			int tmp = word.charAt(i);
			if (prev != tmp) {
				if (check[tmp-'a'] == false) {
					check[tmp-'a'] = true;
					prev = tmp;
				}
				else
					return false;
			}
		}
		return true;
	}
}