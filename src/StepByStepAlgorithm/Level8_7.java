package StepByStepAlgorithm;

import java.util.Scanner;

public class Level8_7 {
	/*
	 * 2839�� ������� ���� ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ�
	 * �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
	 * 
	 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6����
	 * �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
	 * 
	 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
	 * 
	 * ��� ����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
	 */
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
		
		
		if (N == 4 || N == 7) {
			System.out.println(-1);
		}
		else if (N % 5 == 0) {
			System.out.println(N / 5);
		}
		else if (N % 5 == 1 || N % 5 == 3) {
			System.out.println((N / 5) + 1);
		}
		else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println((N / 5) + 2);
		}
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); int
		 * N = Integer.parseInt(br.readLine());
		 * 
		 * 
		 * if (N == 4 || N == 7) { System.out.println(-1); } else if (N % 5 == 0) {
		 * System.out.println(N / 5); } else if (N % 5 == 1 || N % 5 == 3) {
		 * System.out.println((N / 5) + 1); } else if (N % 5 == 2 || N % 5 == 4) {
		 * System.out.println((N / 5) + 2); }
		 */
	}
}