import java.util.*;

public class j_2805 {
    public static void main(String[] args){       
        Scanner in = new Scanner(System.in);
        int N= in.nextInt();
        int M = in.nextInt();
        int max=-1;
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=in.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }

        }
        int min=0;
        int mid;
        long value;
        while(min<max){
            
            value=0;
            mid = (min+max)/2;
            for(int i=0;i<N;i++){
                if(arr[i]>=mid){
                    value = value+arr[i]-mid;
                }
            }
        
            if(value>=M){
                min=mid+1;
            }
            else {
                max=mid;
            }
        }

        System.out.println(min-1);
        
    }
}


// import java.util.*;

// public class j_2805 {
//     public static void main(String[] args){       
//         Scanner in = new Scanner(System.in);
//         int N= in.nextInt();
//         int M = in.nextInt();
//         int tall=-1;
//         int arr[] = new int[N];
//         for(int i=0;i<N;i++){
//             arr[i]=in.nextInt();
//             if(tall<arr[i]){
//                 tall=arr[i];
//             }

//         }
//         int start=0;
//         int end=tall;
//         long value;
//         int max=0;
//         int mid;
//         while(end-start>=0){
            
//             value=0;
//             mid = (start+end)/2;
//             for(int i=0;i<N;i++){
//                 if(arr[i]>=mid){
//                     value = value+arr[i]-mid;
//                 }
//             }
        
//             if(value>=M){
//                 max=mid;
//                 start=mid+1;
//             }
//             else {
//                 end=mid-1;
//             }
//         }

//         System.out.println(max);
        
//     }
// }
