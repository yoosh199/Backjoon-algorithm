import java.util.*;

public class j_11399 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int arr[]= new int[N];
        int sum=0;
        int arr_sum[]= new int[N];
        for(int i =0;i<N;i++){
            arr[i]=in.nextInt();
        }

        Arrays.sort(arr);
        for(int i =0;i<N;i++){
            sum+=arr[i];
            arr_sum[i]=sum;
        }

        sum=0;
        for(int i =0;i<N;i++){
            sum+=arr_sum[i];
            
        }

        System.out.println(sum);

        in.close();
    }
}
