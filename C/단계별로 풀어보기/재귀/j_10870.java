import java.util.Scanner;

public class j_10870 {

    public static int pibo(int n){

        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        return pibo(n-1)+pibo(n-2);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pacto=1;

        
        
        System.out.println(pibo(n));
        
       
        in.close();
    }
    
}

