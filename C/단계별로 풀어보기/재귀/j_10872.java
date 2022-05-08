import java.util.Scanner;

public class j_10872 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pacto=1;

        
        while(n>0){
                pacto = n *pacto;
                n--;
        }
        
        System.out.println(pacto);
        
       
        in.close();
    }
    
}
