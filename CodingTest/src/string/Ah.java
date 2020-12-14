/* baekjoon4999
 * ��ȯ�̴� ����ƾ ��� �ܼ�Ʈ���� �Ҹ��� �ʹ� ���� ������ ���Ŀ��� �ɷȴ�.
 * �ǻ�� ��ȯ�̿��� "aaah"�� ���غ���� ���״�. 
 * ��Ÿ���Ե� ��ȯ�̴� �ǻ簡 ���ϴ¸�ŭ �Ҹ��� ��� �� �� ���� ��찡 �־���.
 * ������ �ǻ�� ��ȯ�̿��� Ư���� ������ "aah"�� ���غ���� ��û�Ѵ�. 
 * � �ǻ�� "aaaaaah"�� �䱸�ϱ⵵ �ϰ�, "h"�� �䱸�ϴ� �ǻ絵 �ִ�.
 * ��� �ǻ�� �ڽ��� ���ϴ� ������ "aah"�� ���� ���ϸ� ������ ���� �� ����.
 * ����, ��ȯ�̴� ������ �ڽ��� �󸶳� ��� "aah"�� �� �� �ִ��� �˾Ƴ°�, 
 * �ڱⰡ �Ҹ��� �� �ִ� ������ "aah"�� �䱸�ϴ� �ǻ縦 �湮�Ϸ��� �Ѵ�.
 * ��ȯ�̰� �� �� �ִ� "aah"�� ���̿� �ǻ簡 �䱸�ϴ� ���̰� �־�����. 
 * �̶�, �� ������ �����ϴ��� ���ƾ��ϴ����� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * �Է��� �� �ٷ� �̷���� �ִ�. ù° ���� ��ȯ�̰� ���� ��� �� �� �ִ� "aaah"�̴�.
 * ��° ���� �ǻ簡 ��⸦ ���ϴ� "aah"�̴�. �� ���ڿ��� ��� a�� h�θ� �̷���� �ִ�.
 * a�� ������ 0���� ũ�ų� ����, 999���� �۰ų� ������, �׻� h�� �������� �ϳ��� �־�����.
 *
 * output
 * ��ȯ�̰� �� ������ �����ϸ� "go"��, �ƴϸ� "no"�� ����Ѵ�.
 * 
 * example
 * aaah
 * aaaaah
 * -> no
 * aaah
 * ah
 * -> go
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ah {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(br.readLine().length() >= br.readLine().length() ? "go" : "no");
	}
}