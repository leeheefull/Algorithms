/* baekjoon1120
 * ���̰� N���� ���� ���ڿ� X�� Y�� ���� ��, �� ���ڿ� X�� Y�� ���̴� X[i] �� Y[i]�� i�� �����̴�. 
 * ���� ���, X=��jimin��, Y=��minji���̸�, ���� ���̴� 4�̴�.
 * �� ���ڿ� A�� B�� �־�����. 
 * �̶�, A�� ���̴� B�� ���̺��� �۰ų� ����. 
 * ���� A�� ���̰� B�� ���̿� ������ �� ���� ������ ���� ������ �� �� �ִ�.
 * A�� �տ� �ƹ� ���ĺ��̳� �߰��Ѵ�.
 * A�� �ڿ� �ƹ� ���ĺ��̳� �߰��Ѵ�.
 * �̶�, A�� B�� ���̰� �����鼭, A�� B�� ���̸� �ּҷ� �ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� A�� B�� �־�����. 
 * A�� B�� ���̴� �ִ� 50�̰�, A�� ���̴� B�� ���̺��� �۰ų� ����, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 
 * output
 * A�� B�� ���̰� �����鼭, A�� B�� ���̸� �ּҰ� �ǵ��� ���� ��, �� ���̸� ����Ͻÿ�.
 * 
 * example
 * adaabc aababbc
 * -> 2
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDiff {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<=str[1].length()-str[0].length(); i++) {
			int cnt = 0;
			for (int j=0; j<str[0].length(); j++)
				if (str[0].charAt(j) != str[1].charAt(i + j))
					cnt++;
			min = Math.min(cnt, min);
		}		
	    System.out.println(min);
	}
}