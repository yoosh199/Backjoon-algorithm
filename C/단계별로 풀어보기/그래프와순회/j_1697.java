import java.util.*;

public class j_1697 {
    static int N, K;

    static int time[] = new int[100001];

    static int left(int x) {

        return x - 1;
    }

    static int right(int x) {
        return x + 1;
    }

    static int multiply(int x) {
        return x * 2;
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(N);

        while (!q.isEmpty()) {
            Integer u = q.poll();
            // 여기서 이제 위의 함수 3개 다실행

            if (u == K) {
                return;
            }
            if (u >= 0 && u < 100000 && time[u + 1] == 0) {
                time[u + 1] = time[u] + 1;
                q.add(u + 1);
            }

            if (u <= 100000 && u > 0 && time[u - 1] == 0) {
                time[u - 1] = time[u] + 1;
                q.add(u - 1);
            }

            if (u * 2 <= 100000 && time[u * 2] == 0) {
                time[u * 2] = time[u] + 1;
                q.add(u * 2);
            }

        }

        return;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        K = in.nextInt();

        if (N >= K) {
            System.out.println(N - K);
        } else {
            bfs();
            System.out.println(time[K]);
        }

        in.close();
    }
}

// import java.util.*;

// public class j_1697 {
// static int N, K;

// static int time[] = new int[100001];

// static int left(int x) {

// return x - 1;
// }

// static int right(int x) {
// return x + 1;
// }

// static int multiply(int x) {
// return x * 2;
// }

// static void bfs() {
// Queue<Integer[]> q = new LinkedList<Integer[]>();
// int depth = 1;
// q.add(new Integer[] { N, depth });

// while (!q.isEmpty()) {
// Integer[] u = q.poll();
// // 여기서 이제 위의 함수 3개 다실행

// if (time[u[0]] == 0) {
// time[u[0]] = u[1];
// if (u[0] * 2 <= 100000) {
// q.add(new Integer[] { multiply(u[0]), u[1] + 1 });

// }
// if (u[0] >= 1 && u[0] <= 100000) {
// q.add(new Integer[] { left(u[0]), u[1] + 1 });
// }
// if (u[0] <= 99999 && u[0] >= 0) {
// q.add(new Integer[] { right(u[0]), u[1] + 1 });
// }

// } else {
// if (time[u[0]] > u[1]) {
// time[u[0]] = u[1];
// if (u[0] * 2 <= 100000) {
// q.add(new Integer[] { multiply(u[0]), u[1] + 1 });

// }
// if (u[0] >= 1 && u[0] <= 100000) {
// q.add(new Integer[] { left(u[0]), u[1] + 1 });
// }
// if (u[0] <= 99999 && u[0] >= 0) {
// q.add(new Integer[] { right(u[0]), u[1] + 1 });
// }

// }
// }
// if (u[0] == K) {
// return;
// }

// }

// return;
// }

// public static void main(String[] args) {

// Scanner in = new Scanner(System.in);
// N = in.nextInt();
// K = in.nextInt();

// if (N >= K) {
// System.out.println(N - K);
// } else {
// bfs();
// System.out.println(time[K] - 1);
// }

// in.close();
// }
// }
