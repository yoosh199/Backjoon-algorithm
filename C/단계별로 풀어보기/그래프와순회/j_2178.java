import java.util.*;

public class j_2178 {
    static int N, M;
    static int arr[][];
    static boolean visit[][];

    static int depth2;

    // 원래 탐색할때 depth를 안썻는데 그러면 몇번째 라인 인줄 몰라서 추가함

    static void bfs(int y, int x) {
        Queue<Integer[]> q = new LinkedList<Integer[]>();

        Integer[] ia = new Integer[3];
        ia[0] = y;
        ia[1] = x;
        ia[2] = 1;
        q.add(ia);

        visit[y][x] = true;
        while (!q.isEmpty()) {
            Integer[] u = q.poll();
            x = u[1];
            y = u[0];
            int depth = u[2];
            if (y == N - 1 && x == M - 1) {
                depth2 = depth;
                break;
            }

            // 우
            if (x >= 0 && x <= M - 2) {
                if (!visit[y][x + 1]) {

                    visit[y][x + 1] = true;
                    if (arr[y][x + 1] == 1) {
                        Integer[] e = new Integer[3];
                        e[0] = y;
                        e[1] = x + 1;
                        e[2] = depth + 1;
                        q.add(e);

                    }

                }
            }
            // 하
            if (y >= 0 && y <= N - 2) {

                if (!visit[y + 1][x]) {
                    visit[y + 1][x] = true;

                    if (arr[y + 1][x] == 1) {

                        Integer[] e = new Integer[3];
                        e[0] = y + 1;
                        e[1] = x;
                        e[2] = depth + 1;
                        q.add(e);

                    }

                }
            }

            // 상
            if (y >= 1 && y <= N - 1) {
                if (!visit[y - 1][x]) {
                    visit[y - 1][x] = true;
                    if (arr[y - 1][x] == 1) {
                        Integer[] e = new Integer[3];
                        e[0] = y - 1;
                        e[1] = x;
                        e[2] = depth + 1;
                        q.add(e);

                    }

                }
            }

            // 좌
            if (x >= 1 && x <= M - 1) {
                if (!visit[y][x - 1]) {
                    visit[y][x - 1] = true;
                    if (arr[y][x - 1] == 1) {
                        Integer[] e = new Integer[3];
                        e[0] = y;
                        e[1] = x - 1;
                        e[2] = depth + 1;
                        q.add(e);

                    }
                }
            }

        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        arr = new int[N][M];
        visit = new boolean[N][M];

        String s;
        in.nextLine();
        for (int i = 0; i < N; i++) {
            s = in.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        bfs(0, 0);

        System.out.println(depth2);
        in.close();
    }
}
