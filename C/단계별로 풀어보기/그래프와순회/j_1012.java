import java.util.*;

public class j_1012 {

    static boolean visit[][];
    static int arr[][];
    static int N;
    static int M;
    static int K;
    static int cabbage_group=0;
    static int cabbage_group_count=0;

    static void dfs(int y,int x){
        

        if(!visit[y][x]){
            visit[y][x]=true;
    
            if(arr[y][x]==1){
                cabbage_group_count++;
                //상
                if(y>=1 && y<=N-1){
                    dfs(y-1,x);
                }

                //하
                if(y>=0 && y<=N-2){
                    dfs(y+1,x);
                }

                //좌
                if(x>=1 && x<=M-1){
                    dfs(y,x-1);
                }
                //우
                if(x>=0 && x<=M-2){
                    dfs(y,x+1);
                }
            }
            else {
                return;
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = in.nextInt();


        for(int t=0;t<T;t++){
            M = in.nextInt();
            N = in.nextInt();
            K = in.nextInt();
            visit =new boolean[N][M];
            arr =new int[N][M];
    
            for(int i=0;i<K;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                arr[b][a]=1;
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    dfs(i,j);
                    if(cabbage_group_count>0){
                        cabbage_group++;
                        cabbage_group_count=0;
                    }
                }
            }  
            sb.append(cabbage_group).append("\n");
            cabbage_group=0;
        }
        System.out.printf(sb.toString());
        in.close();
    }
}