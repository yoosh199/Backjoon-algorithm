import java.util.*;

public class j_10815 {

    public static int binary_search1(int[] arr,int n){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;

        while(end-start>=0){
            if(arr[mid]>n){
                end=mid-1;
            }
            else if(arr[mid]<n){
                start=mid+1;
            }
            else {
                return mid;
            }
            mid=(start+end)/2;
        }
        
        
        return -1;
    }
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);


        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        int N= in.nextInt();
        in.nextLine();

        
        String nn= in.nextLine();
        String[] n = nn.split(" ");
        int M = in.nextInt();
        in.nextLine();
        String mm = in.nextLine();
        String[] m = mm.split(" ");
        int[] n_arr = new int[N];
        for(int i=0;i<N;i++){
            n_arr[i]= Integer.parseInt(n[i]);
        }
        Arrays.sort(n_arr);
        for(int i=0;i<M;i++){
            if(binary_search1(n_arr,Integer.parseInt(m[i]))>=0){
                sb.append(1);
            }
            else{
                sb.append(0);
            }
            if(i<M-1){
                        sb.append(" ");
                    }
        }

        // for(int i=0;i<N;i++){
        //     hash.put(Integer.parseInt(n[i]) , 1);
        // }
        // for(int i=0;i<M;i++){
        //     if(hash.containsKey(Integer.parseInt(m[i]))){
        //         sb.append(1);
        //     }
        //     else{
        //         sb.append(0);
        //     }
        //     if(i<M-1){
        //         sb.append(" ");
        //     }
        // }

        System.out.printf(sb.toString());
        in.close();
    }

}