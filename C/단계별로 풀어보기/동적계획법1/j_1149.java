import java.util.Scanner;

public class j_1149 {
    static int cost[][];
    static int dp[][];
    static int Red =0;
    static int Green=1;
    static int Blue=2;

    static int paint(int N,int color){
        if(dp[N-1][color]==0){
            if(color==Red){
                dp[N-1][Red]=cost[N-1][Red]+Math.min(paint(N-1, Blue), paint(N-1, Green));
           }
           else if(color==Green){
                dp[N-1][Green]=cost[N-1][Green]+Math.min(paint(N-1, Blue), paint(N-1, Red));
           }
           else{
                dp[N-1][Blue]=cost[N-1][Blue]+Math.min(paint(N-1, Red), paint(N-1, Green));
           }
        }
        return dp[N-1][color];
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        cost= new int[N][3];
        dp= new int[N][3];
        for(int i = 0; i < N; i++) {
			cost[i][Red] = in.nextInt();
			cost[i][Green] = in.nextInt();
			cost[i][Blue] = in.nextInt();
		}
       
        dp[0][Red] = cost[0][Red];
		dp[0][Green] = cost[0][Green];
		dp[0][Blue] = cost[0][Blue];
        System.out.println(Math.min(Math.min(paint(N, Green),paint(N, Blue)), paint(N, Red)));


        in.close();
    }
}
