import java.util.*;

public class j_15650 {
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
                if(depth>0){
                    if(arr[depth-1]<i+1){

                        arr[depth]=i+1;
                        dfs(N,M,depth+1);
                        
                    }
                }
                else {arr[depth]=i+1;
                    dfs(N,M,depth+1);

                }
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

// import java.util.Scanner;
 
// public class Main {
 
// 	public static int[] arr;
// 	public static int N, M;
 
// 	public static void main(String[] args) {
 
// 		Scanner in = new Scanner(System.in);
 
// 		N = in.nextInt();
// 		M = in.nextInt();
 
// 		arr = new int[M];
        
// 		dfs(1, 0);
 
// 	}
 
// 	public static void dfs(int at, int depth) {
 
// 		if (depth == M) {
// 			for (int val : arr) {
// 				System.out.print(val + " ");
// 			}
// 			System.out.println();
// 			return;
// 		}
        
// 		for (int i = at; i <= N; i++) {
 
// 			arr[depth] = i;
// 			dfs(i + 1, depth + 1);
 
// 		}
// 	}
// }