import java.util.*;

// 0000
// 0010
// 여기서 2,4 에서 뚫고가는 경우가 될수 있다.
public class j_2206 {
    public static int N, M;
    public static int visit[][];
    public static int ans = -1;
    public static int map[][];

    public static void bfs() {
        Queue<Integer[]> q = new LinkedList<Integer[]>();
        q.add(new Integer[] { 0, 0, 0, 1 });// y,x, 길 한번뚥기, depth
        visit[0][0] = 0;
        while (!q.isEmpty()) {

            Integer[] u = q.poll();
            if (u[0] == N - 1 && u[1] == M - 1) {
                ans = u[3];
                return;
            }

            if (u[1] >= 0 && u[1] < M - 1) {
                if (visit[u[0]][u[1] + 1] > u[2]) {
                    if (map[u[0]][u[1] + 1] == 0) {
                        visit[u[0]][u[1] + 1] = u[2];
                        q.add(new Integer[] { u[0], u[1] + 1, u[2], u[3] + 1 });
                    } else {
                        if (u[2] == 0) {
                            visit[u[0]][u[1] + 1] = 1;
                            q.add(new Integer[] { u[0], u[1] + 1, 1, u[3] + 1 });
                        }
                    }
                }
                // 오른쪽

            }

            if (u[1] > 0 && u[1] <= M - 1) {
                // 왼쪽
                if (visit[u[0]][u[1] - 1] > u[2]) {
                    if (map[u[0]][u[1] - 1] == 0) {
                        visit[u[0]][u[1] - 1] = u[2];
                        q.add(new Integer[] { u[0], u[1] - 1, u[2], u[3] + 1 });
                    } else {
                        if (u[2] == 0) {
                            visit[u[0]][u[1] - 1] = 1;
                            q.add(new Integer[] { u[0], u[1] - 1, 1, u[3] + 1 });
                        }
                    }

                }

            }

            if (u[0] > 0 && u[0] <= N - 1) {
                // 위
                if (visit[u[0] - 1][u[1]] > u[2]) {

                    if (map[u[0] - 1][u[1]] == 0) {
                        visit[u[0] - 1][u[1]] = u[2];
                        q.add(new Integer[] { u[0] - 1, u[1], u[2], u[3] + 1 });
                    } else {
                        if (u[2] == 0) {
                            visit[u[0] - 1][u[1]] = 1;
                            q.add(new Integer[] { u[0] - 1, u[1], 1, u[3] + 1 });
                        }
                    }
                }

            }

            if (u[0] >= 0 && u[0] < N - 1) {
                // 아래
                if (visit[u[0] + 1][u[1]] > u[2]) {
                    if (map[u[0] + 1][u[1]] == 0) {
                        visit[u[0] + 1][u[1]] = u[2];
                        q.add(new Integer[] { u[0] + 1, u[1], u[2], u[3] + 1 });
                    } else {
                        if (u[2] == 0) {
                            visit[u[0] + 1][u[1]] = 1;
                            q.add(new Integer[] { u[0] + 1, u[1], 1, u[3] + 1 });
                        }
                    }
                }
            }

        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        map = new int[N][M];
        visit = new int[N][M];
        in.nextLine();
        for (int i = 0; i < N; i++) {
            String a = in.nextLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = Character.getNumericValue(a.charAt(j));
                visit[i][j] = Integer.MAX_VALUE;
            }
        }
        bfs();

        System.out.println(ans);

        in.close();
    }

}
