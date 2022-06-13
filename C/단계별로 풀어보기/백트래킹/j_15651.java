import java.util.*;

public class j_15651 {
    public static StringBuilder sb = new StringBuilder();
    public static int[] arr;
    
    public static void dfs(int N,int M,int depth){
        if(depth==M){
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }



        for(int i=0;i<N;i++){
            arr[depth]=i+1;
            dfs(N,M,depth+1);
        }


    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
  
        int N = in.nextInt();
        int M = in.nextInt();
        arr = new int[M];
        dfs(N,M,0);
        System.out.printf(sb.toString());
        in.close();
    }
}
