import java.util.Scanner;


public class j_11729 {

    public static int hanoi(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            
            return 3;
        } 

        
        return 1 + 2*hanoi(n-1);
    }

    public static String hanoi_print(int n,String a,String b, String c){
        if(n==1){
            
            return "1 3\n";
        } 

        if(n==2){
            
            return a+" "+b+"\n"+a+" "+c+"\n"+b+" "+c+"\n";
        } 

        //규칙을 보면 n=4 일때 (1,3)을 기준의 위아래가 n=3일때에서 위는 3,2교환 밑에는 1,2 교환을 알수있다
        return hanoi_print(n-1,a,c,b)+a+" "+c+"\n"+hanoi_print(n-1,b,a,c);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(hanoi(n));
        System.out.printf(hanoi_print(n, "1", "2", "3"));

        in.close();
    }
}
