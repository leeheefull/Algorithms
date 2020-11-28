/* baekjoon10773
 * ���ڴ� ���� ����̴� ���Ƹ� ȸ���� �غ��ϱ� ���ؼ� ��θ� �����ϴ� ���̴�.
 * �����̴� ����̸� ���ͼ� ���� �����ϴ� ���ε�,
 * �ּ��ϰԵ� �׻� ���ž��� �����̴� ���� �Ǽ��� �߸� �θ��� ��� ġ�� �Ͼ�����.
 * �����̴� �߸��� ���� �θ� ������ 0�� ���ļ�, ���� �ֱٿ� ����̰� �� ���� ����� ��Ų��.
 * ����̴� �̷��� ��� ���� �޾� ���� �� �� ���� ���� �˰� �;� �Ѵ�. ����̸� ��������!
 * 
 * input
 * ù ��° �ٿ� ���� K�� �־�����. (1 �� K �� 100,000)
 * ���� K���� �ٿ� ������ 1���� �־�����.
 * ������ 0���� 1,000,000 ������ ���� ������,
 * ������ "0" �� ��쿡�� ���� �ֱٿ� �� ���� �����, �ƴ� ��� �ش� ���� ����.
 * ������ "0"�� ��쿡 ���� �� �ִ� ���� ������ ������ �� �ִ�.
 * 
 * output
 * ����̰� ���������� ���� �� ���� ���� ����Ѵ�.
 * ���������� ��� ���� ���� 231-1���� �۰ų� ���� �����̴�.
 * 
 * example
 * 4
 * 3
 * 0
 * 4
 * 0
 * -> 0
 * 
 * 10
 * 1
 * 3
 * 5
 * 4
 * 0
 * 0
 * 7
 * 0
 * 0
 * 6
 * -> 7
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0; i<n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if(tmp == 0 && !stack.empty())
				stack.pop();
			else
				stack.push(tmp);
		}
		
		while(!stack.empty())
			result += stack.pop();
		
		System.out.print(result);
	}
}