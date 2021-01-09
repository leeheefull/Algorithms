/* baekjoon 2935
���� �ð��� ����� �� �л��� �ִ�.
�� �л��� ������ �����ϴ� ��ſ� �۷ι� ���� ���⿡ ���ؼ� ����ϰ� �־���.
����� ���� �����Ǹ鼭 �� �л��� ��Ҹ��� ������, �ᱹ �������� ũ�� �г��Ͽ���.
�̷��� �л����� ���� �ð��� ����� ������ ��� �ذ��ؾ� �ұ�?
������ �ʵ��б� ���������� ������ ����̴� �� ������ ���� ������ �ذ��Ѵ�.
�л����� ������Ű�� ���� ĥ�ǿ� ���� ������ ���ְ�, ���̵鿡�� ������ �� ������ Ǯ�� �Ѵ�.
�л����� ������ �ݹ� Ǯ�� �ٽ� ����� ���� �����ϱ� ���ؼ�, ���ڸ� �ſ� ũ�� �Ѵ�.
���� �ʵ��б��̱� ������, �л����� ������ ������ �����.
��, ���� 10�� �������� ������ �ٸ� ���� �б����� ����� �ʾұ� ������, �������� ���ִ� ���� ��� 10�� ���� �����̴�.
���� �ð����� ������ Ǫ�� ���� ���� ���ؼ�, �������� ���ִ� ���ڴ� �ִ� 100�ڸ��̴�.
ĥ�ǿ� ���� �ִ� ������ �־����� ��, ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

input
ù° �ٿ� ���� ���� A�� �־�����.
��° �ٿ� ������ + �Ǵ� *�� �־�����.
��° �ٿ� ���� ���� B�� �־�����.
A�� B�� ��� 10�� ���� �����̰�, ���̴� �ִ� 100�ڸ��̴�.

output
ù° �ٿ� ����� ����Ѵ�.
����� A+B �Ǵ� A*B�̸�, �Է¿��� �־����� �����ڿ� ���� �����ȴ�.

example
1000
*
100
-> 100000
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Noise {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String operator = br.readLine();
        String B = br.readLine();

        if (A.length() < B.length()) {
            String tmp = A;
            A = B;
            B = tmp;
        }
        if (operator.equals("+")) {
            if (A.length() == B.length()) {
                System.out.print("2" + A.substring(1));
                return;
            }
            System.out.print(A.substring(0, A.length() - B.length()) + B);
        } else if (operator.equals("*")) {
            System.out.print(A + B.substring(1));
        }
        br.close();
    }
}