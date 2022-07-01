import java.util.*;

public class j_24444 {
    static StringBuilder sb = new StringBuilder();
    static int N,M,R;
    static ArrayList<Integer>[] arr;
    static int[][] order; 
    static boolean visit[];
    static int depth=0;
    
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        R = in.nextInt();

        arr = new ArrayList[N];
        visit = new boolean[N];
        order = new int[N][2];
        for(int i=0;i<N;i++){
            arr[i] = new ArrayList<Integer>();
            order[i][0]=i+1;
        }
        for(int i=0;i<M;i++){
            int a = in.nextInt();
            int b= in.nextInt();
            arr[a-1].add(b-1);
            arr[b-1].add(a-1);
        }
        for(int i=0;i<N;i++){
            Collections.sort(arr[i]);
        }

        bfs(R-1);
        for(int i=0;i<N;i++){
           
            System.out.println(order[i][1]);
            
            
        }
        in.close();
    }


    static void bfs(int node){
        Queue<Integer> q = new LinkedList<>(); 

        visit[node]=true;
        q.add(node);
        while(!q.isEmpty()){
            
            int u =q.poll();
            depth++;
            order[u][1]=depth;
            for(int i=0;i<arr[u].size();i++){
                if(!visit[arr[u].get(i)]){
                    visit[arr[u].get(i)]=true;
                    q.add(arr[u].get(i));
                }
            }
        }

        return;
    }
}

// bfs(V, E, R) {  # V : 정점 집합, E : 간선 집합, R : 시작 정점
//     for each v ∈ V - {R}
//         visited[v] <- NO;
//     visited[R] <- YES;  # 시작 정점 R을 방문 했다고 표시한다.
//     enqueue(Q, R);  # 큐 맨 뒤에 시작 정점 R을 추가한다.
//     while (Q ≠ ∅) {
//         u <- dequeue(Q);  # 큐 맨 앞쪽의 요소를 삭제한다.
//         for each v ∈ E(u)  # E(u) : 정점 u의 인접 정점 집합.(정점 번호를 오름차순으로 방문한다)
//             if (visited[v] = NO) then {
//                 visited[v] <- YES;  # 정점 v를 방문 했다고 표시한다.
//                 enqueue(Q, v);  # 큐 맨 뒤에 정점 v를 추가한다.
//             }
//     }
// }