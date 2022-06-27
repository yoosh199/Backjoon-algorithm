import java.util.*;

public class j_1920 {
    

    static int binary(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        int mid;
        
        while(end-start>=0){
            mid = (start+end)/2;
            if(arr[mid]>x){
                end=mid-1;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }
            else {
                return 1;
            }
            
        }

        
        return 0;

    }

    public static void main(String[] args){       
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
        }

        int M = in.nextInt();
        Arrays.sort(arr);
        int arr2[]= new int[M];
        for(int i=0;i<M;i++){
            arr2[i]=in.nextInt();
        }


        for(int i=0;i<M;i++){
            System.out.println(binary(arr, arr2[i]));
        }


        in.close();
    }
}