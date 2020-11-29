/* baekjoon1100
 * ü������ 8*8ũ���̰�, ���� ĭ�� �Ͼ� ĭ�� �����ư��鼭 ��ĥ�Ǿ� �ִ�. ���� ���� ��ĭ (0,0)�� �Ͼ���̴�.
 * ü������ ���°� �־����� ��, �Ͼ� ĭ ���� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٺ��� 8���� �ٿ� ü������ ���°� �־�����. ��.���� �� ĭ�̰�, ��F���� ���� ���� �ִ� ĭ�̴�.
 * 
 * output
 * ù° �ٿ� ������ ������ ����Ѵ�.
 * 
 * example
 * .F.F...F
 * F...F.F.
 * ...F.F.F
 * F.F...F.
 * .F...F..
 * F...F.F.
 * .F.F.F.F
 * ..FF..F.
 * -> 1
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhiteBlank {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		
		for(int i=0; i<8; i++) {
			String tmp = br.readLine();
			for(int j=0; j<8; j++)
				if((i+j)%2 == 0 && tmp.charAt(j) == 'F')
					result++;
		}
		System.out.print(result);
	}
}