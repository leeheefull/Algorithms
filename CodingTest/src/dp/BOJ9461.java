/*
�ĵ��� ���� ������ó�ٱ���з�
�ð� ����	�޸� ����	����      ����	���� ���	���� ����
1 ��	    128 MB  	42747	 17868	14731   	40.423%
����
������ �׸��� ���� �ﰢ���� ���� ������� ������ �ִ�.
ù �ﰢ���� ���ﰢ������ ���� ���̴� 1�̴�.
�� �������� ������ ���� �������� ���ﰢ���� ��� �߰��Ѵ�.
�������� ���� �� ���� ���̸� k�� ���� ��, �� ���� ���̰� k�� ���ﰢ���� �߰��Ѵ�.

�ĵ��� ���� P(N)�� ������ �ִ� ���ﰢ���� ���� �����̴�.
P(1)���� P(10)���� ù 10�� ���ڴ� 1, 1, 1, 2, 2, 3, 4, 5, 7, 9�̴�.

N�� �־����� ��, P(N)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, N�� �־�����. (1 �� N �� 100)

���
�� �׽�Ʈ ���̽����� P(N)�� ����Ѵ�.

���� �Է� 1
2
6
12
���� ��� 1
3
16
 */

package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ9461 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine()); // test case
        long[] p = new long[101];

        for (int i = 0; i < p.length; i++) {
            if (i == 0) {
                p[i] = 0;
            } else if (i <= 3) {
                p[i] = 1;
            } else if (i == 4) {
                p[i] = 2;
            } else {
                p[i] = p[i - 1] + p[i - 5];
            }
        }

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            bw.write(p[n] + "\n");
        }
        bw.flush();
    }
}