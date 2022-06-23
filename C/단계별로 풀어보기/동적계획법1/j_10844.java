import java.util.Scanner;

public class j_10844 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();

        long dp[][]= new long[N+1][10];
        int mod =1000000000;
        long result=0;
        for(int i=1;i<=9;i++){
            dp[1][i]=1;
        }
  
        for(int i=2;i<=N;i++){
           
            for(int j=0;j<=9;j++){
                if(j==0){
                    dp[i][1]=(dp[i-1][j]+dp[i][1])%mod;
                
                }
                else if(j==9){
                    dp[i][8]=(dp[i-1][j]+dp[i][8])%mod;
   
                }
                else {
                    dp[i][j-1]=(dp[i-1][j]+dp[i][j-1])%mod;
                    dp[i][j+1]=(dp[i-1][j]+dp[i][j+1])%mod;
    
                }
            }
            
         
        }
        for(int i = 0; i < 10; i++) {
			result += dp[N][i];
		}
        
        System.out.println(result%1000000000);
    
        in.close();
    }
}
