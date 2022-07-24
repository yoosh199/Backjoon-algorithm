import java.util.*;

public class j_13549 {
    static int map[] = new int[100001];
    static boolean check[] = new boolean[100001];
    static int N, K;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        check[N] = true;
        while (!q.isEmpty()) {
            int u = q.poll();

            if (u == K) {
                break;

            }

            if (u * 2 <= 100000 && check[2 * u] == false) {
                q.add(2 * u);
                map[2 * u] = map[u];

                check[2 * u] = true;
            }
            if (u > 0 && u <= 100000 && check[u - 1] == false) {
                q.add(u - 1);
                check[u - 1] = true;
                map[u - 1] = map[u] + 1;
            }
            if (u >= 0 && u < 100000 && check[u + 1] == false) {
                q.add(u + 1);
                check[u + 1] = true;
                map[u + 1] = map[u] + 1;
            }

        }
        System.out.println(map[K]);
        in.close();
    }
}
