/* baekjoon4999
 * 재환이는 저스틴 비버 콘서트에서 소리를 너무 많이 질러서 인후염에 걸렸다.
 * 의사는 재환이에게 "aaah"를 말해보라고 시켰다. 
 * 안타깝게도 재환이는 의사가 원하는만큼 소리를 길게 낼 수 없는 경우가 있었다.
 * 각각의 의사는 재환이에게 특정한 길이의 "aah"를 말해보라고 요청한다. 
 * 어떤 의사는 "aaaaaah"를 요구하기도 하고, "h"만 요구하는 의사도 있다.
 * 모든 의사는 자신이 원하는 길이의 "aah"를 듣지 못하면 진단을 내릴 수 없다.
 * 따라서, 재환이는 집에서 자신이 얼마나 길게 "aah"를 낼 수 있는지 알아냈고, 
 * 자기가 소리낼 수 있는 길이의 "aah"를 요구하는 의사를 방문하려고 한다.
 * 재환이가 낼 수 있는 "aah"의 길이와 의사가 요구하는 길이가 주어진다. 
 * 이때, 그 병원에 가야하는지 말아야하는지를 알아내는 프로그램을 작성하시오.
 * 
 * input
 * 입력은 두 줄로 이루어져 있다. 첫째 줄은 재환이가 가장 길게 낼 수 있는 "aaah"이다.
 * 둘째 줄은 의사가 듣기를 원하는 "aah"이다. 두 문자열은 모두 a와 h로만 이루어져 있다.
 * a의 개수는 0보다 크거나 같고, 999보다 작거나 같으며, 항상 h는 마지막에 하나만 주어진다.
 *
 * output
 * 재환이가 그 병원에 가야하면 "go"를, 아니면 "no"를 출력한다.
 * 
 * example
 * aaah
 * aaaaah
 * -> no
 * aaah
 * ah
 * -> go
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ah {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(br.readLine().length() >= br.readLine().length() ? "go" : "no");
	}
}