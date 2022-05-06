import java.util.Scanner;
public class j_1085 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
      
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        int min = 1000;
        //상하좌우 다 계산하기
        //up
        if(h-y<min) min= h-y;

        //down
        if(y<min) min=y;

        //left
        if(x<min) min=x;

        //right
        if(w-x<min) min=w-x;

        System.out.println(min);

        in.close();
    }
}
