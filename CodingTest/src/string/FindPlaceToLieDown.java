/* baekjoon1652
 * �� �� ���� �������ָ� �ϴ� �����̴� ������ �ϴ� �ʹ� �ǰ��ؼ� ��ó�� �ִ� �ڷ����� �ܵ����� �Ϸ�� ���� �ڱ�� �ϰ� ���� ��Ҵ�.
 * �ڷ����� �ܵ��� �ִ� ���� NxN�� ���簢��������� �����. 
 * �� �ȿ��� �ű� �� ���� ������ �̰����� ���� �־ �������� ���� �ڸ��� �����ϰ� �־���. 
 * �����̴� �� ������ ȯ�濡�� ���� �� �ִ� �ڸ��� ã�ƾ� �Ѵ�. �����̰� ���� �� �ִ� �ڸ����� ������ �ִ�. 
 * �ȹٷ� �����ؼ� 2ĭ �̻��� �� ĭ�� �����ϸ� �� ���� ���� �� ������ �� �����鼭 ���� �� �ִ�. 
 * ���η� ���� ���� �ְ� ���η� ���� ���� �ִ�. 
 * ���� ���� ������ ���� �� ���� ������ �ݵ�� ���̳� ���� ��� �ȴ�. (�߰��� �������ϰ� ���� ��찡 ����.)
 * ....X
 * ..XX.
 * .....
 * .XX..
 * X....
 * ���� ���� ������ ���� �׸�ó�� ����ٸ�, ���η� ���� �� �ִ� �ڸ��� 5���̰�, ���η� ���� �� �ִ� �ڸ��� 4�� �̴�. 
 * ���� ũ�� N�� ���� ������ �־����� ��, ���η� ���� �� �ִ� �ڸ��� ���η� ���� �� �ִ� �ڸ��� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� ���� ũ�� N�� �־�����. N�� 1�̻� 100������ �����̴�. 
 * �� ���� N�ٿ� ���� N���� ���ڰ� �����µ� '.'�� �ƹ��͵� ���� ���� �ǹ��ϰ�, 'X'�� ���� �ִ� ���� �ǹ��Ѵ�.
 * 
 * output
 * ù° �ٿ� ���η� ���� �� �ִ� �ڸ��� ���η� ���� �� �ִ� �ڸ��� ������ ����Ѵ�.
 * 
 * example
 * 5
 * ....X
 * ..XX.
 * .....
 * .XX..
 * X....
 * -> 5 4
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPlaceToLieDown {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] place = new char[n][n];
		int h = 0, v = 0;

		for (int i = 0; i < n; i++) {
			place[i] = br.readLine().toCharArray();
		}
		for (int i = 0; i < n; i++) {
			int hCnt = 0, vCnt = 0;
			for (int j = 0; j < n; j++) {
				if (place[i][j] == 'X') {
					if (2 <= hCnt) {
						h++;
					}
					hCnt = 0;
				} else {
					hCnt++;
				}
				if (place[j][i] == 'X') {
					if (2 <= vCnt) {
						v++;
					}
					vCnt = 0;
				} else {
					vCnt++;
				}
			}
			if (2 <= hCnt) {
				h++;
			}
			if (2 <= vCnt) {
				v++;
			}
		}
		System.out.print(h + " " + v);
	}
}