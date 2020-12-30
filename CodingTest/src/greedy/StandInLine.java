/* baekjoon 1138
 * N명의 사람들은 매일 아침 한 줄로 선다.
 * 이 사람들은 자리를 마음대로 서지 못하고 오민식의 지시대로 선다.
 * 어느 날 사람들은 오민식이 사람들이 줄 서는 위치를 기록해 놓는다는 것을 알았다.
 * 그리고 아침에 자기가 기록해 놓은 것과 사람들이 줄을 선 위치가 맞는지 확인한다.
 * 사람들은 자기보다 큰 사람이 왼쪽에 몇 명 있었는지만을 기억한다.
 * N명의 사람이 있고, 사람들의 키는 1부터 N까지 모두 다르다.
 * 각 사람들이 기억하는 정보가 주어질 때, 줄을 어떻게 서야 하는지 출력하는 프로그램을 작성하시오.
 * 
 * input
 * 첫째 줄에 사람의 수 N이 주어진다.
 * N은 10보다 작거나 같은 자연수이다.
 * 둘째 줄에는 키가 1인 사람부터 차례대로 자기보다 키가 큰 사람이 왼쪽에 몇 명이 있었는지 주어진다.
 * i번째 수는 0보다 크거나 같고, N-i보다 작거나 같다.
 * 
 * output
 * 첫째 줄에 줄을 선 순서대로 키를 출력한다.
 */

package greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandInLine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] tall = new int[N + 1]; // input
		List<Integer> line = new ArrayList<>(); // result
		line.add(0);

		for (int i = 1; i <= N; i++) {
			tall[i] = scanner.nextInt();
		}

		for (int i = N; 1 <= i; i--) {
			line.add(tall[i], i);
		}

		for (int i = 0; i < N; i++) {
			System.out.print(line.get(i) + " ");
		}
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