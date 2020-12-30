/* baekjoon4949
 * ����� ������ �� �����־�� �Ѵ�. ��� ��, ���� ��� �׸��� ���� ��ȣ�� ������ ��ȣó�� ���̴�.
 * �������� �ӹ��� � ���ڿ��� �־����� ��, ��ȣ���� ������ �� ������ �ִ��� �Ǵ��ϴ� ���α׷��� ¥�� ���̴�.
 * ���ڿ��� ���ԵǴ� ��ȣ�� �Ұ�ȣ("()") �� ���ȣ("[]")�� 2�����̰�, ���ڿ��� ������ �̷�� ������ �Ʒ��� ����.
 * ��� ���� �Ұ�ȣ("(")�� ������ �Ұ�ȣ(")")�͸� ¦�� �̷�� �Ѵ�.
 * ��� ���� ���ȣ("[")�� ������ ���ȣ("]")�͸� ¦�� �̷�� �Ѵ�.
 * ��� ������ ��ȣ���� �ڽŰ� ¦�� �̷� �� �ִ� ���� ��ȣ�� �����Ѵ�.
 * ��� ��ȣ���� ¦�� 1:1 ��Ī�� �����ϴ�. ��, ��ȣ �ϳ��� �� �̻��� ��ȣ�� ¦�������� �ʴ´�.
 * ¦�� �̷�� �� ��ȣ�� ���� ��, �� ���̿� �ִ� ���ڿ��� ������ ������ �Ѵ�.
 * �����̸� ���� ���ڿ��� �־����� �� �������� ���ڿ����� �ƴ����� �Ǵ��غ���.
 * 
 * input
 * �ϳ� �Ǵ� �����ٿ� ���ļ� ���ڿ��� �־�����.
 * �� ���ڿ��� ���� ���ĺ�, ����, �Ұ�ȣ("( )") ���ȣ("[ ]")������ �̷���� ������, ���̴� 100���ں��� �۰ų� ����.
 * �Է��� ������������ �� �������� �� �ϳ�(".")�� ���´�.
 * 
 * output
 * �� �ٸ��� �ش� ���ڿ��� ������ �̷�� ������ "yes"��, �ƴϸ� "no"�� ����Ѵ�.
 * 
 * example
 * So when I die (the [first] I will see in (heaven) is a score list).
 * [ first in ] ( first out ).
 * Half Moon tonight (At least it is better than no Moon at all].
 * A rope may form )( a trail in a maze.
 * Help( I[m being held prisoner in a fortune cookie factory)].
 * ([ (([( [ ] ) ( ) (( ))] )) ]).
 *  .
 * .
 * ->
 * yes
 * yes
 * no
 * no
 * no
 * yes
 * yes
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> bracket = new Stack<Character>();

		while (true) {
			bracket.clear();
			String line = br.readLine();
			if (line.equals(".")) {
				break;
			}
			for (int i = 0; i < line.length(); i++) {
				char tmp = line.charAt(i);
				if (tmp == '(' || tmp == '[') {
					bracket.push(tmp);
				} else if (tmp == ')' || tmp == ']') {
					if (bracket.isEmpty() || (bracket.peek() == '(' && tmp == ']')
							|| (bracket.peek() == '[' && tmp == ')')) {
						bracket.push(tmp);
						break;
					}
					bracket.pop();
				}
			}
			if (bracket.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}