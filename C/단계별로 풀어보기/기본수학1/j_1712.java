import java.util.Scanner;

public class j_1712 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(b >=c){
            System.out.println(-1);
        }
        else {
            long x = (long)a/((long)c-(long)b);
            System.out.println((int)x+1);
        }

        //long float 차이 21억 이하여서 long 인가?



        in.close();
    }
    
}
