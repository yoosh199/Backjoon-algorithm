import java.util.*;

class Node implements Comparable<Node> {
    int end;
    int weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

public class j_1167 {
    static int N;
    static boolean[] visit;
    static ArrayList<Node>[] list;
    static int max_tree = -1;
    static int max = -1;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        list = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        int MAX = -1;

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < N; i++) {
            int start = in.nextInt();
            while (true) {

                int end = in.nextInt();
                if (end == -1) {
                    break;
                }
                int weight = in.nextInt();
                list[start].add(new Node(end, weight));

            }
        }

        dfs(1, 0);
        Arrays.fill(visit, false);
        dfs(max_tree, 0);
        System.out.println(max);
        in.close();
    }

    static void dfs(int start, int sum) {

        if (visit[start]) {

            if (sum > max) {
                max = sum;
                max_tree = start;
            }

        } else {
            visit[start] = true;
        }

        for (Node node : list[start]) {
            if (!visit[node.end]) {
                visit[node.end] = true;
                sum += node.weight;
                dfs(node.end, sum);
                sum -= node.weight;
                visit[node.end] = false;
            }

        }

        return;
    }
}
