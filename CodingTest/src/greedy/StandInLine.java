/* baekjoon 1138
 * N���� ������� ���� ��ħ �� �ٷ� ����.
 * �� ������� �ڸ��� ������� ���� ���ϰ� ���ν��� ���ô�� ����.
 * ��� �� ������� ���ν��� ������� �� ���� ��ġ�� ����� ���´ٴ� ���� �˾Ҵ�.
 * �׸��� ��ħ�� �ڱⰡ ����� ���� �Ͱ� ������� ���� �� ��ġ�� �´��� Ȯ���Ѵ�.
 * ������� �ڱ⺸�� ū ����� ���ʿ� �� �� �־��������� ����Ѵ�.
 * N���� ����� �ְ�, ������� Ű�� 1���� N���� ��� �ٸ���.
 * �� ������� ����ϴ� ������ �־��� ��, ���� ��� ���� �ϴ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� ����� �� N�� �־�����.
 * N�� 10���� �۰ų� ���� �ڿ����̴�.
 * ��° �ٿ��� Ű�� 1�� ������� ���ʴ�� �ڱ⺸�� Ű�� ū ����� ���ʿ� �� ���� �־����� �־�����.
 * i��° ���� 0���� ũ�ų� ����, N-i���� �۰ų� ����.
 * 
 * output
 * ù° �ٿ� ���� �� ������� Ű�� ����Ѵ�.
 */

package greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandInLine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] tall = new int[N+1];	// input
		List<Integer> line = new ArrayList<>();	// result
		line.add(0);
		
		for(int i=1; i<=N; i++)
			tall[i] = scanner.nextInt();
		
		for(int i=N; 1<=i; i--)
			line.add(tall[i], i);
		
		for(int i=0; i<N; i++)
			System.out.print(line.get(i) + " ");
	}
}

/* example
 * 4
 * 2 1 1 0
 * -> 4 2 1 3
 * 8
 * 3 2 1 4 6 0 7 5
 * 6 3 2 1 4 8 5 7
 */