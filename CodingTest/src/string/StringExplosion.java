/* baekjoon9935
 * ����̴� ���ڿ��� ���� ���ڿ��� �ɾ� ���Ҵ�.
 * ���� ���ڿ��� �����ϸ� �� ���ڴ� ���ڿ����� �������, ���� ���ڿ��� �������� �ȴ�.
 * ������ ������ ���� �������� ����ȴ�.
 * ���ڿ��� ���� ���ڿ��� �����ϰ� �ִ� ��쿡, ��� ���� ���ڿ��� �����ϰ� �ȴ�. 
 * ���� ���ڿ��� ������� �̾� �ٿ� ���ο� ���ڿ��� �����.
 * ���� ���� ���ڿ��� ���� ���ڿ��� ���ԵǾ� ���� ���� �ִ�.
 * ������ ���� ���ڿ��� ���ڿ��� ���� ������ ��ӵȴ�.
 * ����̴� ��� ������ ���� �Ŀ� � ���ڿ��� ������ ���غ����� �Ѵ�. 
 * �����ִ� ���ڰ� ���� ��찡 �ִ�. 
 * �̶��� "FRULA"�� ����Ѵ�.
 * ���� ���ڿ��� ���� ���ڸ� �� �� �̻� �������� �ʴ´�.
 * 
 * input
 * ù° �ٿ� ���ڿ��� �־�����. 
 * ���ڿ��� ���̴� 1���� ũ�ų� ����, 1,000,000���� �۰ų� ����.
 * ��° �ٿ� ���� ���ڿ��� �־�����. 
 * ���̴� 1���� ũ�ų� ����, 36���� �۰ų� ����.
 * �� ���ڿ��� ��� ���ĺ� �ҹ��ڿ� �빮��, ���� 0, 1, ..., 9�θ� �̷���� �ִ�.
 * 
 * output
 * ù° �ٿ� ��� ������ ���� �� ���� ���ڿ��� ����Ѵ�.
 * 
 * example
 * mirkovC4nizCC44
 * C4
 * -> mirkovniz
 * 
 * 12ab112ab2ab
 * 12ab
 * -> FRULA
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExplosion {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		StringBuilder exp = new StringBuilder(br.readLine());
		StringBuilder ans = new StringBuilder();
				
		for (int i = 0; i < str.length; i++) {
            ans.append(str[i]);
            if (exp.length() <= ans.length()){
                int index = ans.length() - exp.length();
                if (ans.substring(index).equals(exp.toString())) {
                    ans.delete(index, index + exp.length());
                }
            }
        }
		
		if(ans.length() == 0)
			System.out.print("FRULA");
		else
			System.out.print(ans.toString());
	}
}