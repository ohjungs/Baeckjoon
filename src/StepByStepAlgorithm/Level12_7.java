package StepByStepAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Level12_7 {
	/*
	 * 11651 ��ǥ �����ϱ� 2 ���� 2���� ��� ���� �� N���� �־�����. ��ǥ�� y��ǥ�� �����ϴ� ������, y��ǥ�� ������ x��ǥ��
	 * �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� ���� ���� N (1 �� N �� 100,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� i������ ��ġ xi�� yi��
	 * �־�����. (-100,000 �� xi, yi �� 100,000) ��ǥ�� �׻� �����̰�, ��ġ�� ���� �� ���� ����.
	 * 
	 * ��� ù° �ٺ��� N���� �ٿ� ���� ������ ����� ����Ѵ�.
	 */
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[][] arr = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			// ��ġ ����
			arr[i][1] = in.nextInt();
			arr[i][0] = in.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < N; i++) {
			// ��ġ ����
			System.out.println(arr[i][1] + " " + arr[i][0]);
		}
	}
}