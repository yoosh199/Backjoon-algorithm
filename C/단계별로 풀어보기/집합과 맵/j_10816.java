import java.util.*;

public class j_10816 {

    public static int binary_search(int[] arr, int n){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;

        while(end-start>=0){
            if(arr[mid]<n){
                start=mid+1;
            }
            else if(arr[mid]>n){
                end=mid-1;
            }else{
                return mid;
            }
            mid=(start+end)/2;
        }

        return -1;
    }
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); 
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String n= in.nextLine();
        String[] nn=n.split(" ");
        int[] nnn= new int[N];
        int M = in.nextInt();
        in.nextLine();
        String m = in.nextLine();
        String[] mm=m.split(" "); 
        for(int i=0;i<N;i++){
            nnn[i]=Integer.parseInt(nn[i]);
            if(hash.containsKey(nnn[i])){
                int k=hash.get(nnn[i]);
                hash.put(nnn[i], k+1);
            }
            else {
                hash.put(nnn[i],1);
            }
            
        }
        Arrays.sort(nnn);
        for(int i=0;i<M;i++){
            if(binary_search(nnn, Integer.parseInt(mm[i]))>=0){
                sb.append(hash.get(nnn[binary_search(nnn, Integer.parseInt(mm[i]))]));
                if(i<M-1){
                    sb.append(" ");
                }
            
            }
            else {
                sb.append(0);
                if(i<M-1){
                    sb.append(" ");
                }
            }
        }
        System.out.printf(sb.toString());
        in.close();
    }
}
