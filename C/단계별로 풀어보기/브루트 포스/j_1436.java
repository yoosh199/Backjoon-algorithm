import java.util.Scanner;

public class j_1436 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int count=0;
        int x=1;
        int temp;
        int six;
        while(true){
            six=0;
            temp=x;
            while(temp>0){
                if(temp%10==6 && (temp/10)%10==6&& (temp/100)%10==6){
                    six++;
                }

                temp=temp/10;
            }
            if(six>=1){
                count++;
            }

            if(count==n)break;

            x++;
        }

        System.out.println(x);
        in.close();
    }
}
