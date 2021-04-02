/*
Ÿ�� ä���
�ð� ����	�޸� ����	����	    ����	    ���� ���	���� ����
2 ��	    128 MB  	28581   10028	7879    	35.262%
����
3��N ũ���� ���� 2��1, 1��2 ũ���� Ÿ�Ϸ� ä��� ����� ���� ���غ���.

�Է�
ù° �ٿ� N(1 �� N �� 30)�� �־�����.

���
ù° �ٿ� ����� ���� ����Ѵ�.

���� �Է� 1
2
���� ��� 1
3
 */

package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2133 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[31];

        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 3;

        for (int i = 4; i <= n; i = i + 2) {
            dp[i] = dp[i - 2] * 3;
            for (int j = i - 4; j >= 0; j = j - 2) {
                dp[i] = dp[i] + dp[j] * 2;
            }
        }
        System.out.print(dp[n]);
    }
}
