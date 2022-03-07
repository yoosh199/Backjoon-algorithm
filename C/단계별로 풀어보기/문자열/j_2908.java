import java.util.*;
import java.io.*;
public class j_2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
   
        int max = -1; 

        String two = in.readLine();
        String[] arr = two.split(" ");

        for(int i=2;i>-1;i--){
            if((int)arr[0].charAt(i)>(int)arr[1].charAt(i)){
                max=0;
                break;
            }
            else if((int)arr[0].charAt(i)<(int)arr[1].charAt(i)){
                max=1;
                break;
            }

        }
      
        for(int i =0;i<3;i++){
            out.write(arr[max].charAt(2-i));
        }
        out.flush();

        in.close();
    }
    
}
