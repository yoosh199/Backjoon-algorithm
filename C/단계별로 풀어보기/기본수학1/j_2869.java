
import java.io.*;
public class j_2869 {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = in.readLine();
        String[] arr=s.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]);
  
  
       
        double x = ((double)v-(double)a)/((double)a-(double)b);


        in.close();
      
        System.out.println((int)Math.ceil(x+1));

       
   
    }
    
}
