import java.util.Scanner;

public class j_1932 {
    static int triangle[][];
    static Integer[][] dp;
    

    static int tri_max(int n,int index){
        if(n==0){
            return triangle[0][0];
        }
        
        if(index==0){
            if(dp[n][index]==null){
                dp[n][index]=triangle[n][index]+tri_max(n-1, index);
            }
        }
        else if(index==n ){
            if(dp[n][index]==null){
                dp[n][index]=triangle[n][index]+tri_max(n-1, index-1);
            }
        }
        else {
            if(dp[n][index]==null){
                dp[n][index]= Math.max(triangle[n][index]+tri_max(n-1, index-1),triangle[n][index]+tri_max(n-1, index));
            }
            
        }

        return dp[n][index];
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        triangle = new int[N][N];
        dp= new Integer[N][N];

        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j=0;j<i+1;j++){
                triangle[i][j]=in.nextInt();
            }
        }
        dp[0][0]=triangle[0][0];

        for(int i=0;i<N;i++){
            max = Math.max(max,tri_max(N-1, i));
        }

        System.out.println(max);
        

        in.close();
    }
}
