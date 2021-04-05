/*
����
� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�.
���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.

���
ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.

���� �Է� 1
110
���� ��� 1
99
���� �Է� 2
1
���� ��� 2
1
���� �Է� 3
210
���� ��� 3
105
���� �Է� 4
1000
���� ��� 4
144
 */

package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1065 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                result++;
            } else if (i < 1000) {
                int[] arr = {i / 100, (i / 10) % 10, i % 10};
                if (arr[2] - arr[1] == arr[1] - arr[0]) {
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}
