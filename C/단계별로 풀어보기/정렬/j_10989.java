import java.util.Scanner;

public class j_10989 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb= new StringBuilder();
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] counting = new int[n];
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            counting[i]=0;
        }

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
           counting[arr[i]-1]++;
        }

        for(int i=0;i<n-1;i++){
          
            counting[i+1] += counting[i];
        }


        for(int i=n-1;i>=0;i--){
          
            counting[arr[i]-1] -= 1;
            answer[counting[arr[i]-1]]= arr[i];
        }
        

        for(int i=0;i<n;i++){
          sb.append(answer[i]).append("\n");
        }
        System.out.printf(sb.toString());
        in.close();
    }
}
