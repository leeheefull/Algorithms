/* baekjoon 11721
 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� �ܾ �־�����.
 * �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�.
 * ���̰� 0�� �ܾ�� �־����� �ʴ´�.
 * 
 * output
 * �Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�.
 * �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� �̸��� ���ڸ� ����� ���� �ִ�.
 * 
 * example
 * BaekjoonOnlineJudge
 * -> 
 * BaekjoonOn
 * lineJudge
 * 
 * OneTwoThreeFourFiveSixSevenEightNineTen
 * ->
 * OneTwoThre
 * eFourFiveS
 * ixSevenEig
 * htNineTen
 */

package string;

import java.util.Scanner;

public class Break10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		for(int i=0; i<input.length(); i++) {
			if(i != 0 && i%10 == 0)
				System.out.println();
			System.out.print(input.charAt(i));
		}
	}
}