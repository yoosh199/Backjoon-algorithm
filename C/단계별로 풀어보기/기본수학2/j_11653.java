import java.io.*;

public class j_11653 {

    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String a = in.readLine();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(a);
        int i;
  
        if(n==1){
        }
        else if(n==2){
            sb.append(2).append("\n");
        }
        else {

            for(i=2;i*i<=n;i++){
                if(isPrime(i)==true){
                    while(n%i==0){
                        n=n/i;
                        sb.append(i).append("\n");
                    }
                  
                }
            }
            if(i*i>n&&n!=1){
                sb.append(n).append("\n");
            }

            // while(start<=(n/2)){
           
            //     if(isPrime(start)==true){
            //         while(n%start==0){
            //             n=n/start;
            //             sb.append(start).append("\n");
            //         }
            //     }
            //     start++;
            // }
            // if(start == (n/2)+1){
            //     sb.append(n).append("\n");
            // }       
        }
        
        System.out.print(sb.toString());
        in.close();
    }
    
}
