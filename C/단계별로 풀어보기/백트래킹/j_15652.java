import java.util.*;;

public class j_15652 {
    public static StringBuilder sb = new StringBuilder();
    public static int[] arr;
    public static boolean[] visit;
    public static int N,M;

    public static void dfs(int at,int depth){
        if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
 
		for (int i=at;i<=N;i++){
            dfs(i, depth+1);
        }
 
	
    }

    // public static void dfs(int N,int M,int depth){
    //     if(depth==M){
    //         for (int val : arr) {
    //             sb.append(val).append(" ");
    //         }
    //         sb.append("\n");
    //         return;
    //     }



    //     for(int i=0;i<N;i++){
    //         if(!visit[i]){
    //             for(int j=0;j<i;j++){
    //                 visit[j]=true;
    //             }
                
    //             arr[depth]=i+1;
    //             dfs(N,M,depth+1);
    //             for(int j=0;j<i;j++){
    //                 visit[j]=false;
    //             }
    //         }
            
            
            
    //     }


    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
  
        N= in.nextInt();
        M = in.nextInt();
        arr = new int[M];
        // visit = new boolean[N];
        
        // dfs(N,M,0);
        dfs(1,0);
        System.out.printf(sb.toString());
        in.close();
    }
}
