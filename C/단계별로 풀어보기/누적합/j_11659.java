import java.util.*;

public class j_11659 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int arr[] = new int[N+1];
        int sum[]= new int[N+1];
        int a,b;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++){
            arr[i]=in.nextInt();
        }
        sum[0]=arr[0];
        for(int i=1;i<=N;i++){
            sum[i]=sum[i-1]+arr[i];
        }

        for(int i=0;i<M;i++){
            a=in.nextInt();
            b=in.nextInt();
            if(a==b){
                sb.append(arr[a]).append("\n");
            }
            else {
                sb.append(sum[b]-sum[a-1]).append("\n");
            }

        }

        System.out.printf(sb.toString());



        in.close();
    }
}