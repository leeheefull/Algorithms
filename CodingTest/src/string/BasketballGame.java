/* baekjoon1159
 * ����̴� ���� ���迡�� ���� ������� �������� �ִ�.
 * ó���� �״� �� ��⸦ �����ϴ� ����̾���.
 * �󱸿� ���� ������ �׸� ���� �� ������, �ᱹ ����̴� ������ û���ϴ� ���� �����ߴ�.
 * ����̵� ������ û���ϸ鼭 ������ �Ǳ� ���� �������� �ɷ��� �����س�����.
 * ���簳 3���̸� ǳ���� ������ ����̴� ���� �������� �� ���� �ٰ����� �־���.
 * ��� �� �׿��� ������ �� ���γ����� ������ ��ȸ�� ����� �Ǿ���.
 * �״� ��û�� �������� �����ָ� ���� ���׿��� ����� �߰�, ���� ������ǥ���� ������ �Ǿ���.
 * ������ �Ϻ��� ������ǥ ģ�� ��Ⱑ �ִ� ���̴�.
 * ����̴� ���� ��⿡ ���� ���� ����� �ۼ��ؾ� �Ѵ�.
 * ������ǥ���� ������ �� ���Ŀ� ����̴� �ſ� ����������.
 * �״� ������ �̸��� ������� ���ϰ�, �� ������ �ɷµ� ���� ���Ѵ�.
 * ����, ���� �������� ����ϱ� ���� �ϱ� ���� ���� ù ���ڰ� ���� ���� 5���� �����Ϸ��� �Ѵ�.
 * ����, ���� ù ���ڰ� ���� ������ 5���� ���ٸ�, ����̴� ���� ���� ģ�� ��⸦ ����Ϸ��� �Ѵ�.
 * ����̴� ���� ��⸦ ���� ���� �� �ִ� ���� ù ���ڸ� ��� ���غ����� �Ѵ�.
 * 
 * input
 * ù° �ٿ� ������ �� N (1 �� N �� 150)�� �־�����.
 * ���� N�� �ٿ��� �� ������ ���� �־�����.
 * (���� ���ĺ� �ҹ��ڷθ� �̷���� �ְ�, �ִ� 30�����̴�)
 * 
 * output
 * ����̰� ���� �ټ� ���� ������ �� ���� ��쿡�� "PREDAJA" (����ǥ ����)�� ����Ѵ�.
 * PREDAJA�� ũ�ξ�Ƽ�ƾ�� �׺��� �ǹ��Ѵ�.
 * ������ �� �ִ� ��쿡�� ������ ���� ù ���ڸ� ���������� ������� ��� ����Ѵ�.
 * 
 * example
 * 18
 * babic
 * keksic
 * boric
 * bukic
 * sarmic
 * balic
 * kruzic
 * hrenovkic
 * beslic
 * boksic
 * krafnic
 * pecivic
 * klavirkovic
 * kukumaric
 * sunkic
 * kolacic
 * kovacic
 * prijestolonasljednikovi
 * -> bk
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketballGame {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] alphabet = new int[26];
		String result = "";
		
		for(int i=0; i<n; i++)
			alphabet[br.readLine().charAt(0)-'a']++;
		
		for(int i=0; i<alphabet.length; i++)
			if(5 <= alphabet[i])
				result += (char)(i+'a');
		
		if(result.equals(""))
			System.out.print("PREDAJA");
		else
			System.out.print(result);
	}
}