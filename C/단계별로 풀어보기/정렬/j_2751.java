import java.util.Arrays;
import java.util.Scanner;

public class j_2751 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sb.append(arr[i]).append("\n");
            
        }
        System.out.printf(sb.toString());

        in.close();
    }

}
