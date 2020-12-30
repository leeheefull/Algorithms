/* baekjoon 2437
 * 하나의 양팔 저울을 이용하여 물건의 무게를 측정하려고 한다.
 * 이 저울의 양 팔의 끝에는 물건이나 추를 올려놓는 접시가 달려 있고, 양팔의 길이는 같다.
 * 또한, 저울의 한쪽에는 저울추들만 놓을 수 있고, 다른 쪽에는 무게를 측정하려는 물건만 올려놓을 수 있다.
 * 무게가 양의 정수인 N개의 저울추가 주어질 때,
 * 이 추들을 사용하여 측정할 수 없는 양의 정수 무게 중 최솟값을 구하는 프로그램을 작성하시오.
 * 예를 들어, 무게가 각각 3, 1, 6, 2, 7, 30, 1인 7개의 저울추가 주어졌을 때,
 * 이 추들로 측정할 수 없는 양의 정수 무게 중 최솟값은 21이다.
 * 
 * input
 * 첫 째 줄에는 저울추의 개수를 나타내는 양의 정수 N이 주어진다.
 * N은 1 이상 1,000 이하이다.
 * 둘째 줄에는 저울추의 무게를 나타내는 N개의 양의 정수가 빈칸을 사이에 두고 주어진다.
 * 각 추의 무게는 1이상 1,000,000 이하이다.
 * 
 * output
 * 첫째 줄에 주어진 추들로 측정할 수 없는 양의 정수 무게 중 최솟값을 출력한다.
 * 
 * example
 * 7
 * 3 1 6 2 7 30 1
 * -> 21
 */

package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Scales {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] weight = new int[n];

		for (int i = 0; i < n; i++) {
			weight[i] = scanner.nextInt();
		}

		Arrays.sort(weight);
		System.out.print(min(weight));
	}

	private static int min(int[] weight) {

		int result = 0;
		for (int i = 0; i < weight.length; i++) {
			if (result + 1 < weight[i]) {
				break;
			}
			result += weight[i];
		}
		return result + 1;
	}
}