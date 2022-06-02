import java.util.*;

public class j_1427 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String st_n= Integer.toString(n);
        int[] arr = new int[st_n.length()]; 
      
        for(int i=0;i<st_n.length();i++){
            arr[i]=Character.getNumericValue(st_n.charAt(i));
        }
    
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d",arr[arr.length-1-i]);
        }

        in.close();
    }
}
