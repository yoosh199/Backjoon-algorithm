import java.util.Scanner;

public class j_1904 {
    static int f[]= new int[1000001];;

    static int fibonacci(int n) {
       

        for(int i=3;i<=n;i++){
            f[i]=(f[i-1]+f[i-2])%15746;

            
        }
        return f[n];
      
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
      
        f[0]=0;
        f[1]=1;
        f[2]=2;
        
      
        System.out.println(fibonacci(N));
        in.close();
    
    }
}
