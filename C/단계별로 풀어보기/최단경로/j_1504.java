import java.util.*;

class Node implements Comparable<Node> {
    int end, weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}

public class j_1504 {
    static int V, E, K, mid_1, mid_2;
    static List<Node>[] list;
    static int[] dist;
    static final int INF = 100_000_000;
    static int pass = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        V = in.nextInt();
        E = in.nextInt();
        list = new ArrayList[V + 1];
        dist = new int[V + 1];
        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <= E; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int weight = in.nextInt();
            list[start].add(new Node(end, weight));
            list[end].add(new Node(start, weight));
        }
        mid_1 = in.nextInt();
        mid_2 = in.nextInt();

        dijkstra(1);

        sum_1 += dist[mid_1];
        sum_2 += dist[mid_2];

        dijkstra(mid_1);
        sum_1 += dist[mid_2];
        dijkstra(mid_2);
        sum_2 += dist[mid_1];
        dijkstra(mid_2);
        sum_1 += dist[V];
        dijkstra(mid_1);
        sum_2 += dist[V];

        int min = Math.min(sum_1, sum_2);
        if (min >= INF) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }

        in.close();
    }

    private static void dijkstra(int start) {
        Arrays.fill(dist, INF);
        PriorityQueue<Node> q = new PriorityQueue<>();
        boolean[] check = new boolean[V + 1];
        q.add(new Node(start, 0));
        dist[start] = 0;
        while (!q.isEmpty()) {
            Node curNode = q.poll();
            int cur = curNode.end;

            if (check[cur] == true)
                continue;
            check[cur] = true;

            for (Node node : list[cur]) {
                if (dist[node.end] > dist[cur] + node.weight) {
                    if (node.end == mid_2) {
                        pass = 1;
                    }
                    dist[node.end] = dist[cur] + node.weight;
                    q.add(new Node(node.end, dist[node.end]));
                }
            }
        }
    }
}
