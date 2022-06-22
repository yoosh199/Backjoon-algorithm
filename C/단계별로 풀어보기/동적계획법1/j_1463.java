import java.util.Scanner;

public class j_1463 {

 
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N= in.nextInt();

        int[] dp = new int[N+1];
        if(N>=2){
            dp[2]=1;
        }
     
        if(N>=3){
            dp[3]=1;
        }
       

        for(int i=4;i<=N;i++){
            
            int min= dp[i-1]+1;
            if(i%2==0){
                if(min>dp[i/2]+1){
                    min=dp[i/2]+1;
                }
               
            }
            if(i%3==0){
                if(min>dp[i/3]+1){
                    min=dp[i/3]+1;
                }
            }
            
            dp[i]=min;
        }
    
        System.out.println(dp[N]);
        in.close();
    }
}
