package StepByStepAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level15_15 {
	/*
	 * 1912 ������ ���� n���� ������ �̷���� ������ ������ �־�����. �츮�� �� �� ���ӵ� �� ���� ���� �����ؼ� ���� �� �ִ� �� ��
	 * ���� ū ���� ���Ϸ��� �Ѵ�. ��, ���� �� �� �̻� �����ؾ� �Ѵ�.
	 * 
	 * ���� �� 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 �̶�� ������ �־����ٰ� ����. ���⼭ ������ 12+21��
	 * 33�� ������ �ȴ�.
	 * 
	 * �Է� ù° �ٿ� ���� n(1 �� n �� 100,000)�� �־����� ��° �ٿ��� n���� ������ �̷���� ������ �־�����. ����
	 * -1,000���� ũ�ų� ����, 1,000���� �۰ų� ���� �����̴�.
	 * 
	 * ��� ù° �ٿ� ���� ����Ѵ�.
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] dp = new int[N];
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
 
		/*
		 * dp[0]�� ù ���ҷ� ������ ���̻� Ž���� ���� ���� ������
		 * arr[0] ��ü ���� �ǹǷ� arr[0]���� �ʱ�ȭ ���ش�.
		 * max���� ù ��° ���ҷ� �ʱ�ȭ ���ش�.
		 */
		dp[0] = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < N; i++) {
			// (���� dp + ���� arr��) �� ���� arr�� �� ū ���� dp�� ���� 
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
			// �ִ� ���� 
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
 
	}
}