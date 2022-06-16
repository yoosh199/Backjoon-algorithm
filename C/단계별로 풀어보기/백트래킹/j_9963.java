import java.util.*;

public class j_9963 {
    public static int N;
    public static int count=0;
    public static int arr[];
    public static boolean Possibility(int row){
        for(int i=0;i<row;i++){
            if(arr[i]==arr[row]){
                return false;
            }
            if(Math.abs(row-i)==Math.abs(arr[row]-arr[i])){
                return false;
            }

        }
        return true;
    }
    public static void queen(int depth){
        if(depth == N){
            count++;
            return;
        }
      



        for(int i=0;i<N;i++){
            arr[depth]=i;
            
		    if (Possibility(depth)) {
			    queen(depth + 1);
		    }
        }
        
       
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new int[N];

        queen(0);
        System.out.println(count);
        in.close();
    }
}
