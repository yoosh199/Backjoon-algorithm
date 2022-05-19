import java.util.Scanner;

public class j_2447_new {

    public static void star(int x, int y, int n){
        if((x/n)%3 == 1 && (y/n)%3 == 1){
            System.out.print(" ");
        }else{
            if(n/3==0){
                System.out.print("*");
            }else{
                star(x,y,n/3);
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                star(i,j,n);
            }
            System.out.println();
        }
        in.close();
    }
}
