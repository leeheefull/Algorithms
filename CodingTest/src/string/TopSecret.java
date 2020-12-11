/* baekjoon11365
 * ����� ���� ���ٰ� �̻��� ������ �߰��ߴ�.
 * �� �������� ��ȣ�� ���� �־��µ�, �ȶ��� ����� ��ȣ�� �������� �ص��ȴٴ� ���� �߰��ߴ�.
 * �� ��ȣ�� �ص��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * �� �ٿ� �ϳ��� ��ȣ�� �־�����.
 * ��ȣ�� ���̴� 500�� ���� �ʴ´�.
 * ������ �ٿ��� "END"�� �־�����.
 * (END�� �ص����� �ʴ´�.)
 * 
 * output
 * �� ��ȣ�� �ص��� ���� �� �ٿ� �ϳ��� ����Ѵ�.
 * 
 * example
 * !edoc doog a tahW
 * noitacitsufbo
 * erafraw enirambus detcirtsernu yraurbeF fo tsrif eht no nigeb ot dnetni eW
 * lla sees rodroM fo drol eht ,ssertrof sih nihtiw delaecnoC
 * END
 * -> 
 * What a good code!
 * obfustication
 * We intend to begin on the first of February unrestricted submarine warfare
 * Concealed within his fortress, the lord of Mordor sees all
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TopSecret {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String line = br.readLine();
			
			if(line.equals("END"))
				break;
			
			for(int i=0; i<line.length(); i++) 
				System.out.print(line.charAt(line.length()-1-i));
			System.out.println();
		}
	}
}