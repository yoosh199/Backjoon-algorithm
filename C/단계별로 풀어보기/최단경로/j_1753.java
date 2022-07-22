
import java.io.*;
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

public class j_1753 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int INF = 100_000_000;
    static int v, e, k;
    static List<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());
        list = new ArrayList[v + 1];
        dist = new int[v + 1];

        Arrays.fill(dist, INF);

        for (int i = 1; i <= v; i++) {
            list[i] = new ArrayList<>();
        }
        // 리스트에 그래프 정보를 초기화
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            // start에서 end로 가는 weight 가중치
            list[start].add(new Node(end, weight));
        }

        StringBuilder sb = new StringBuilder();
        // 다익스트라 알고리즘
        dijkstra(k);
        // 출력 부분
        for (int i = 1; i <= v; i++) {
            if (dist[i] == INF)
                sb.append("INF\n");
            else
                sb.append(dist[i] + "\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean[] check = new boolean[v + 1];
        queue.add(new Node(start, 0));
        dist[start] = 0;

        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            int cur = curNode.end;

            if (check[cur] == true)
                continue;
            check[cur] = true;

            for (Node node : list[cur]) {
                if (dist[node.end] > dist[cur] + node.weight) {
                    dist[node.end] = dist[cur] + node.weight;
                    queue.add(new Node(node.end, dist[node.end]));
                }
            }
        }
    }
}

// import java.util.*;

// public class j_1753 {
// static int[] dist;
// static int[] prev;

// public static void main(String[] args) {

// Scanner in = new Scanner(System.in);
// int V = in.nextInt();
// int E = in.nextInt();
// int start = in.nextInt();
// int[] v = new int[V];
// HashMap<List<Integer>, Integer> map = new HashMap<List<Integer>, Integer>();

// ArrayList<Integer>[] e = new ArrayList[V];
// for (int i = 0; i < V; i++) {
// e[i] = new ArrayList<Integer>();
// }
// for (int i = 0; i < E; i++) {

// int a = in.nextInt();
// int b = in.nextInt();
// int c = in.nextInt();
// ArrayList<Integer> data = new ArrayList<>();
// data.add(a - 1);
// data.add(b - 1);
// map.put(data, c);
// e[a - 1].add(b - 1);

// }
// // ArrayList<Integer> data1 = new ArrayList<>();
// // data1.add(0);
// // data1.add(1);
// // System.out.println(map.get(data1));
// for (int i = 0; i < V; i++) {
// v[i] = i + 1;

// }
// di(e, start - 1, V, map);
// for (int i = 0; i < V; i++) {
// if (dist[i] == Integer.MAX_VALUE) {
// System.out.println("INF");
// } else {
// System.out.println(dist[i]);
// }

// }
// in.close();
// }

// static void di(ArrayList<Integer>[] graph, int start, int V,
// HashMap<List<Integer>, Integer> map) {
// dist = new int[V];
// prev = new int[V];

// ArrayList<Integer> q = new ArrayList<>();

// for (int i = 0; i < graph.length; i++) {
// if (start != i) {
// dist[i] = Integer.MAX_VALUE;
// }
// q.add(i);
// }

// while (!q.isEmpty()) {

// int min = Integer.MAX_VALUE;
// int u = -1;

// for (int i = 0; i < dist.length; i++) {
// if (q.contains(i)) {
// if (min > dist[i]) {
// u = i;
// min = dist[i];
// }
// }

// }
// if (u == -1) {
// return;
// }

// q.remove(Integer.valueOf(u));

// for (int i = 0; i < graph[u].size(); i++) {
// ArrayList<Integer> data = new ArrayList<>();
// data.add(u);
// data.add(graph[u].get(i));

// int alt = dist[u] + map.get(data);

// if (alt < dist[graph[u].get(i)]) {
// dist[graph[u].get(i)] = alt;
// prev[graph[u].get(i)] = u;
// }
// }
// }
// return;
// }
// }

// function Dijkstra(Graph, Source):

// dist[source] ← 0 // 소스와 소스 사이의 거리 초기화 --출발지와 출발지의 거리는 당연히 0--
// prev[source] ← undefined // 출발지 이전의 최적 경로 추적은 없으므로 Undefined

// create vertex set Q //노드들의 집합 Q(방문되지 않은 노드들의 집합) 생성 시작

// for each vertex v in Graph: // Graph안에 있는 모든 노드들의 초기화
// if v ≠ source: // V 노드가 출발지가 아닐 경우(출발지를 제외한 모든 노드!)
// dist[v] ← INFINITY // 소스와 V노드 사이에 알려지지 않은 거리 --얼마나 먼지 모르니까-- = 무한값 ( 모든 노드들을
// 초기화하는 값)
// prev[v] ← UNDEFINED // V노드의 최적경로 추적 초기화
// add v to Q // Graph에 존재하고 방금 전 초기화된 V 노드를 Q(방문되지 않은 노드들의 집합)에 추가

// //요약하자면, Graph에 존재하는 모든 노드들을 초기화한 뒤, Q에 추가함.

// while Q is not empty: // Q 집합이 공집합 아닐 경우, 루프 안으로!
// u ← vertex in Q with min dist[u] // 첫번째 반복에서는 dist[source]=0이 선택됨. 즉,
// u=source에서 시작
// remove u from Q // U 노드를 방문한 것이므로 Q집합에서 제거

// for each neighbor v of u: // U의 이웃노드들과의 거리 측정
// alt ← dist[u] + length(u, v) // 출발지 노드 부터 계산된 U노드까지의 거리 + V에서 U의 이웃노드까지의 거리
// //= source to U + V to U = source to U
// if alt < dist[v]: // 방금 V노드까지 계산한 거리(alt)가 이전에 V노드까지 계산된 거리(dist[v])보다 빠른 또는
// 가까운 경우
// dist[v] ← alt // V에 기록된 소스부터 V까지의 최단거리를 방금 V노드까지 계산한 거리로 바꿈
// prev[v] ← u // 제일 가까운 노드는 지금 방문하고 있는 노드(U)로 바꿈

// return dist[], prev[] //계산된 거리값과 목적지를 리턴
// }
