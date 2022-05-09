import java.util.Scanner;

public class j_10872 {

    public static int pactolia(int n){

        if(n==1||n==0){
            return 1;
        }

        return n*pactolia(n-1);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pacto=1;

        
        
        System.out.println(pactolia(n));
        
       
        in.close();
    }
    
}
