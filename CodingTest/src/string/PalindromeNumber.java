/* baekjoon1259
 * � �ܾ �ڿ������� �о �Ȱ��ٸ� �� �ܾ �Ӹ�����̶�� �Ѵ�. 'radar', 'sees'�� �Ӹ�����̴�.
 * ���� �Ӹ�������� ����� �� �ִ�. ���� ���ڵ��� �ڿ������� �о ���ٸ� �� ���� �Ӹ���Ҽ���.
 * 121, 12421 ���� �Ӹ���Ҽ���. 123, 1231�� �ڿ������� ������ �ٸ��Ƿ� �Ӹ���Ҽ��� �ƴϴ�. 
 * ���� 10�� �Ӹ���Ҽ��� �ƴѵ�, �տ� ���ǹ��� 0�� �� �� �ִٸ� 010�� �Ǿ� �Ӹ���Ҽ��� ����� ���� ������, 
 * Ư���� �̹� ���������� ���ǹ��� 0�� �տ� �� �� ���ٰ� ����.
 * 
 * input
 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� ������, �� �ٸ��� 1 �̻� 99999 ������ ������ �־�����. 
 * �Է��� ������ �ٿ��� 0�� �־�����, �� ���� ������ ���Ե��� �ʴ´�.
 * 
 * output
 * �� �ٸ��� �־��� ���� �Ӹ���Ҽ��� 'yes', �ƴϸ� 'no'�� ����Ѵ�.
 * 
 * example
 * 121
 * 1231
 * 12421
 * 0
 * -> 
 * yes
 * no
 * yes
 */

package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PalindromeNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String n = br.readLine();
			if(n.equals("0"))
				break;
			if(check(n))
				bw.write("yes\n");
			else
				bw.write("no\n");
			
		}
		bw.flush();
	}
	
	private static boolean check(String n) {
		
		char[] tmp = n.toCharArray();
		int head = 0;
		int tail = tmp.length-1;
		
		while(head<tail) {
			if(tmp[head] != tmp[tail])
				return false;
			head++;
			tail--;
		}
		return true;
	}
}