import java.util.*;;

public class j_24416 {
    static int f[];
    static int N;
    public static int fib_count=0;
    public static int fib1_count=0;

    static int fib(int n) {
      
        if (n == 1 || n == 2){
            fib_count++;
            return 1;
        }
          
        else{
            return (fib(n - 1) + fib(n - 2));
        } 
    }

    static int fibonacci(int n) {
       

        f[1]=1;
        f[2]=1;

        for(int i=3;i<=N;i++){
            f[i]=f[i-1]+f[i-2];
            fib1_count++;

            
        }
        return f[n];
      
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        N = in.nextInt();
        f=new int[N+1];
        in.close();

        fib(N);
        fibonacci(N);
      
        System.out.printf("%d %d",fib_count,fib1_count);
      
    }
    
}
