/* baekjoon2902
 * KMP �˰����� KMP�� ������ �̸� ���� ����� ���� Knuth, Morris, Prett�̱� �����̴�.
 * �̷��� �˰��򿡴� �߰��� ����� ���� ���� �̸��� ���̴� ��찡 ����.
 * �� �ٸ� ����, ������ ���Ī ��ȣȭ �˰��� RSA�� �̸� ���� ����� �̸��� Rivest, Shamir, Adleman�̴�.
 * ������� �̷��� ��� ���� �� �˰����� �� ���� ���·� �θ���.
 * ù ��°�� ���� ��� ����, �̸� ������(-)���� �̾� ���� ���̴�.
 * ���� ���, Knuth-Morris-Pratt�̴�. �̰��� �� ���¶�� �θ���.
 * �� ��°�� ª�� ���´� ���� ����� ���� ù ���ڸ� ���� �θ��� ���̴�.
 * ���� ���, KMP�̴�.
 * �����̴� ���ϸ��� �ڽ��� �� ���� ��� �޸��忡 ������´�.
 * ���� �ڱ� ����, ���� �Ϸ� ������ �ߴ��� �ǻ��� ���� ������ �Ϸ縦 �����Ѵ�.
 * �Ϸ�� �� �޸� ���� ��, ���ݱ��� �� ���¿� ª�� ���¸� ��� ���� ���� ���� �߰��ߴ�.
 * �̷��� �� ���·� �Ϸ� ���� ����ϴٰ��� �޸��� ������ �δ�Ǿ� �Ļ�� ���� ���ϱ� ������, �����δ� ª�� ���·� ����Ϸ��� �Ѵ�.
 * �� ������ �˰��� �̸��� �־����� ��, �̸� ª�� ���·� �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * �Է��� �� �ٷ� �̷���� �ְ�, �ִ� 100������ ���� ���ĺ� �빮��, �ҹ���, �׸��� ������ ('-', �ƽ�Ű�ڵ� 45)�θ� �̷���� �ִ�.
 * ù ��° ���ڴ� �׻� �빮���̴�.
 * �׸���, ������ �ڿ��� �ݵ�� �빮���̴�.
 * �� ���� ��� ���ڴ� ��� �ҹ����̴�.
 * 
 * output
 * ù �ٿ� ª�� ���� �̸��� ����Ѵ�.
 * 
 * example
 * Knuth-Morris-Pratt
 * -> KMP
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhyKMP {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String output = "";
		
		output += input.charAt(0);
		for(int i=1; i<input.length(); i++)
			if(input.charAt(i) == '-')
				output += input.charAt(i+1);
		
		System.out.print(output);
	}
}