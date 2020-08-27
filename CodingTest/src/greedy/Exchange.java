/* problem: baekjoon(5585)
 * Ÿ�δ� ���� JOI��ȭ������ ������ ���.
 * JOI��ȭ������ �ܵ����� 500��, 100��, 50��, 10��, 5��, 1���� ����� �ְ�, ������ �Ž����� ������ ���� ���� �ܵ��� �ش�.
 * Ÿ�ΰ� JOI��ȭ������ ������ ��� ī���Ϳ��� 1000�� ���� ���� ���� ��, ���� �ܵ��� ���Ե� �ܵ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ��� �Էµ� ��1�� ��쿡�� �Ʒ� �׸����� ó�� 4���� ����ؾ� �Ѵ�.
 * input
 * �Է��� ���ٷ� �̷�����ְ�, Ÿ�ΰ� ������ ��(1 �̻� 1000�̸��� ����) 1���� �������ִ�.
 * output
 * ������ ��� ������ 1�����θ� �Ǿ� �ִ�. �ܵ��� ���Ե� �ż��� ����Ͻÿ�.
 */

package greedy;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();		// money to pay		
		money = 1000 - money;		// change
		int[] coin = {500, 100, 50, 10, 5, 1};		// kind of change
		int cnt = 0;		// change money count
		
		for(int i=0; i<coin.length; i++)
			if(0<money/coin[i]) {
				cnt += money/coin[i];
				money %= coin[i];
			}
		
		System.out.print(cnt);
		scanner.close();
	}
}

//example
/********
* 380
* -> 4
********/