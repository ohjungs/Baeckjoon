package StepByStepAlgorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level25_4 {
    // 2606 문제
    // 신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다. 한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든
    // 컴퓨터는 웜 바이러스에 걸리게 된다.

    // 예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자. 1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는
    // 2번과 5번 컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다. 하지만 4번과
    // 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.

    // 어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때, 1번 컴퓨터를 통해 웜
    // 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.

    // 입력
    // 첫째 줄에는 컴퓨터의 수가 주어진다. 컴퓨터의 수는 100 이하이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다. 둘째 줄에는
    // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다. 이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는
    // 컴퓨터의 번호 쌍이 주어진다.

    // 출력
    // 1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.

    static int node[][]; // 그래프 배열
    static int check[]; // 방문 배열

    static void bfs(int start) { // BFS 메소드
        Queue<Integer> queue = new LinkedList<>();

        check[start] = 1;
        queue.offer(start);
        int cnt = 0; // 감염 된 컴퓨터의 수
        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int i = 1; i < node.length; i++) { // 차례대로 1번과 연결 된 컴퓨터들을 찾아 cnt변수 증가
                if (node[x][i] == 1 && check[i] != 1) {
                    queue.offer(i);
                    check[i] = 1;
                    cnt++;
                }
            }
        }
        System.out.println(cnt); // 모든 탐색을 마치고 cnt 출력
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 컴퓨터의 수
        int m = sc.nextInt(); // 네트워크 상에 연결되어 있는 컴퓨터 쌍의 수 즉, 간선의 수

        node = new int[n + 1][n + 1];
        check = new int[n + 1];
        for (int i = 0; i < m; i++) { // 그래프 구성
            int a = sc.nextInt();
            int b = sc.nextInt();
            node[a][b] = 1;
            node[b][a] = 1;

        }

        bfs(1);

    }
}
