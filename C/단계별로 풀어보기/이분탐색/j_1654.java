import java.util.*;

public class j_1654 {

    static long binary(long[] arr, int N,long sum){
        long start = arr[0]/(N/arr.length +1);
        long ans=-1;
        if(start==0){
            start=1;
        }

        long end = sum/N;
    
        long mid;
        long count;
        while(end-start>=0){
            // System.out.println("start : "+start+" end: "+end);
            count=0;
           
            mid = (start+end)/2;
            // System.out.println("mid : "+mid);
            for(int i=0;i<arr.length;i++){
                count = count+ arr[i]/mid;
            }
            
            if(count<N){
                end=mid-1;
            }
            else{
                ans = mid;
                start=mid+1;   
            }
        }


        return ans;

    }
    public static void main(String[] args){       
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();

        long arr[] = new long[K];
    
        for(int i=0;i<K;i++){
            arr[i]= in.nextInt();
        }

        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }

        System.out.println(binary(arr, N, sum));

        in.close();
    }
}
