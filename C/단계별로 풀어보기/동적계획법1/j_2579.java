import java.util.Scanner;

public class j_2579 {
    static int dp[]=new int[300];
    static int stair[];
    static int up(int n){
        
        if(n<0){
            return 0;
        }
       if(dp[n]==0){
        dp[n]= Math.max(up(n-2), up(n-3)+stair[n-1])+stair[n];
       }
      
            
    
        
        return dp[n];
    }
    
   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        stair = new int[N];

        for(int i=0;i<N;i++){
            stair[i]=in.nextInt();
        }
        dp[0]=stair[0];
        if(N>1){
            dp[1]=stair[0]+stair[1];
        }
       
        System.out.println(up(N-1));
        

        in.close();
    }
}
