import java.util.*;

public class j_2630 {
    

    static int arr[][];
    static int blue=0;
    static int white=0;
    static int N;
    static void f(int row_start,int row_end,int col_start,int col_end){
        if(row_start==row_end){
            if(arr[row_start][col_start]==1){
                blue++;
            }
            else {
                white++;
            }
            return;
        }
        int sum=0;
        for(int i=row_start;i<=row_end;i++){
            for(int j=col_start;j<=col_end;j++){
                sum += arr[i][j];
            }
        }
        if(sum==0){
            white++;
            return;
        }
        else if(sum==(row_end+1-row_start)*(row_end+1-row_start)){
            blue++;
            return;
        }
        else {
            f(row_start,(row_start+row_end)/2,col_start,(col_start+col_end)/2);
            f(row_start,(row_start+row_end)/2,(col_start+col_end)/2+1,col_end);
            f((row_start+row_end)/2+1,row_end,col_start,(col_start+col_end)/2);
            f((row_start+row_end)/2+1,row_end,(col_start+col_end)/2+1,col_end);
        }

      

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        arr = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
            
                arr[i][j]=in.nextInt();
            }
         
        }

        f(0,N-1,0,N-1);
        System.out.println(white);
        System.out.println(blue);
        in.close();
    }
}