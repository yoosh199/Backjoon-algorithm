import java.util.*;

public class j_24479 {

    static int N,M,R;
    static ArrayList<Integer>[] arr;
    static int[][] order; 
    static boolean visit[];
    static int depth=0;
    static void dfs(int node){
        if(!visit[node]){
            visit[node]=true;
        
            depth++;
            order[node][1]=depth;
            if(arr[node]==null){
                return;
            }
         
            for(int i=0;i<arr[node].size();i++){
                dfs(arr[node].get(i));
            }
                
        }


    }

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
        dfs(R-1);

        for(int i=0;i<N;i++){
            if(order[i][1]==0){
                System.out.println(0);
            }
            else {
                System.out.println(order[i][1]);
            }
            
        }
        in.close();
    }
}
