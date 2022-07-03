import java.util.*;

public class j_7576 {

    static int N, M;
    static int arr[][];
    static boolean visit[][];
    static ArrayList<Integer[]> starts = new ArrayList<Integer[]>();
    static int depth2 = 0;

    static void dfs() {
        Queue<Integer[]> q = new LinkedList<Integer[]>();

        for (int i = 0; i < starts.size(); i++) {

            q.add(starts.get(i));
            visit[starts.get(i)[0]][starts.get(i)[1]] = true;
        }

        while (!q.isEmpty()) {
            Integer[] u = q.poll();
            int y = u[0];
            int x = u[1];
            int depth = u[2];
            depth2 = depth;
            // 우
            if (x >= 0 && x <= M - 2) {
                if (!visit[y][x + 1]) {

                    visit[y][x + 1] = true;
                    if (arr[y][x + 1] == 0) {
                        arr[y][x + 1] = 1;
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

                    if (arr[y + 1][x] == 0) {
                        arr[y + 1][x] = 1;
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
                    if (arr[y - 1][x] == 0) {
                        arr[y - 1][x] = 1;
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
                    if (arr[y][x - 1] == 0) {
                        arr[y][x - 1] = 1;
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

        M = in.nextInt();
        N = in.nextInt();
        arr = new int[N][M];
        visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
                if (arr[i][j] == 1) {
                    starts.add(new Integer[] { i, j, 0 });
                }

            }
        }

        dfs();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(depth2);
        in.close();
    }
}

// 1. 1이 두개 이상이면 동시에 해야되는데
// 2. 여러개면 여러개 전부 depth +1 까지 탐색한다음 넘어가기
// 3. 입력 받을때 n*m 한다음 -1 뺀 값이 채워져야함, 이때 1값도 같이 카운트