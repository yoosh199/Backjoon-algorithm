import java.util.*;

public class j_15649 {
    public static int[] arr;
	public static boolean[] visit;

    public static void dfs(int N,int M,int depth){
        if(depth==M){
            for(int i=0;i<M;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=0;i<N;i++){
            if(!visit[i]){
                visit[i]=true;
                arr[depth]=i+1;
                dfs(N,M,depth+1);
                visit[i]=false;
            }
        }
    }
    public static void main(String[] args){


       

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        visit = new boolean[N];
        arr = new int[M];

        dfs(N,M,0);
        in.close();
    }
}