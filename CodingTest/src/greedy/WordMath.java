/* baekjoon(1339)
 * �ν��̴� �����п����� �ܾ� ���� ������ Ǫ�� ������ �޾Ҵ�.
 * �ܾ� ���� ������ N���� �ܾ�� �̷���� ������, �� �ܾ�� ���ĺ� �빮�ڷθ� �̷���� �ִ�.
 * �̶�, �� ���ĺ� �빮�ڸ� 0���� 9������ ���� �� �ϳ��� �ٲ㼭 N���� ���� ���ϴ� �����̴�.
 * ���� ���ĺ��� ���� ���ڷ� �ٲ�� �ϸ�, �� �� �̻��� ���ĺ��� ���� ���ڷ� �ٲ������ �� �ȴ�.
 * ���� ���, GCF + ACDEB�� ����Ѵٰ� �� ��, A = 9, B = 4, C = 8, D = 6, E = 5, F = 3, G = 7�� �����Ѵٸ�,
 * �� ���� ���� 99437�� �Ǿ �ִ밡 �� ���̴�.
 * N���� �ܾ �־����� ��, �� ���� ���� �ִ�� ����� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * input
 * ù° �ٿ� �ܾ��� ���� N(1 �� N �� 10)�� �־�����.
 * ��° �ٺ��� N���� �ٿ� �ܾ �� �ٿ� �ϳ��� �־�����.
 * �ܾ�� ���ĺ� �빮�ڷθ� �̷�����ִ�.
 * ��� �ܾ ���ԵǾ� �ִ� ���ĺ��� �ִ� 10���̰�, ���� �ִ� ���̴� 8�̴�.
 * ���� �ٸ� ���ڴ� ���� �ٸ� ���ڸ� ��Ÿ����.
 * 
 * output
 * ù° �ٿ� �־��� �ܾ��� ���� �ִ��� ����Ѵ�.
 */

package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class WordMath {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		char[] word = new char[10];
		int[] weight = new int[10];
		
		Arrays.fill(word, '0');
		Arrays.fill(weight, 0);
		
		while(N-->0){
		    String tmpStr = scanner.next();
		    int w = 1;
		    for (int i=tmpStr.length()-1; 0<=i; i--) {
		        char tmpChar = tmpStr.charAt(i);
		        for (int j=0; j<10; j++) {
		            if (word[j] == tmpChar) {
		                weight[j] += w;
		                break;
		            }
		            else if (word[j] == '0') {
		            	word[j] = tmpChar;
		                weight[j] = w;
		                break;
		            }
		        }
		        w *= 10;
		    }
		}
		Arrays.sort(weight);
		
		int sum = 0;
		for (int i=9; 0<=i; i--)
		    sum += i*weight[i];
		System.out.println(sum);
	}
}

// example
/***********
 * 2
 * AAA
 * AAA
 * -> 1998
 * 
 * 2
 * GCF
 * ACDEB
 * -> 99437
 * 
 * 10
 * A
 * B
 * C
 * D
 * E
 * F
 * G
 * H
 * I
 * J
 * -> 45
 * 
 * 2
 * AB
 * BA
 * -> 187
 ***********/