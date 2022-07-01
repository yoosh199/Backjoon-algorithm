import java.util.*;

public class j_2606 {

    static int V,E;
    static ArrayList<Integer>[] arr;
    static int count=0;
    static boolean visit[];
    static int depth=0;
    static void dfs(int node){
        if(!visit[node]){
            visit[node]=true;
        
            count++;
            
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
    
        V = in.nextInt();
        E = in.nextInt();
        

        arr = new ArrayList[V];
        visit = new boolean[V];
        
        for(int i=0;i<V;i++){
            arr[i] = new ArrayList<Integer>();
        
        }
        for(int i=0;i<E;i++){
            int a = in.nextInt();
            int b= in.nextInt();
            arr[a-1].add(b-1);
            arr[b-1].add(a-1);
        }
        
        dfs(0);

        System.out.println(count-1);
        
        in.close();
    }
}