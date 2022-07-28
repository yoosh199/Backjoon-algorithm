import java.util.*;;

public class j_11725 {
    static int N;
    static ArrayList<Integer>[] list;
    static boolean visit[];
    static int[] parent;;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        list = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();

        }
        Queue<Integer[]> q = new LinkedList<>();

        for (int i = 0; i < N - 1; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        bfs();
        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
        in.close();
    }

    static void dfs(int start) {

        if (!visit[start]) {
            visit[start] = true;
            for (int i = 0; i < list[start].size(); i++) {
                if (!visit[list[start].get(i)]) {
                    parent[list[start].get(i)] = start;
                    dfs(list[start].get(i));
                }

            }
        }

    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        visit[1] = true;
        for (int i = 0; i < list[1].size(); i++) {
            q.add(list[1].get(i));
            parent[list[1].get(i)] = 1;
            visit[list[1].get(i)] = true;
        }

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int i = 0; i < list[u].size(); i++) {
                if (!visit[list[u].get(i)]) {
                    q.add(list[u].get(i));
                    parent[list[u].get(i)] = u;
                    visit[list[u].get(i)] = true;
                }

            }

        }
    }

}
