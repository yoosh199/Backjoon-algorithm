import java.util.Scanner;

public class j_1912 {
   
 
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        int N = in.nextInt();
        int dp[] = new int[N];
        dp[0]=0;
        
        int arr[]= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }
        dp[0]=arr[0];
        int max=dp[0];

        for(int i=1;i<N;i++){
            dp[i]= Math.max(dp[i-1]+arr[i], arr[i]);
            max=Math.max(dp[i], max);
        }
        System.out.println(max);
        in.close();
    }
}
