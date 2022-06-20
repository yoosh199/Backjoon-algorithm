import java.util.Scanner;

public class j_9461 {

    static long dp[]=new long[101];


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = in.nextInt();
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        dp[4]=2;
        dp[5]=2;
        for(int i=0;i<N;i++){
            int a= in.nextInt();
            for(int j=6;j<=a;j++){
                if(dp[j]==0){
                    dp[j]=dp[j-1]+dp[j-5];
                }
                
            }
            if(i==N-1){
                sb.append(dp[a]);
            }
            else{
                sb.append(dp[a]).append("\n");
            }
         
        }

        

       

        System.out.println(sb.toString());
        in.close();
    }
}
