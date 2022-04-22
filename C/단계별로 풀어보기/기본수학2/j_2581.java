import java.util.Scanner;

public class j_2581 {

    public static int decimal(int x){
        int i;
        if(x==1){
            return 0;
        }
        for(i=2;i<x;i++){//x=2 일때 실행 안됨

           if(x%i==0){
               return 0;
           }

        }
        if(x==i){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int min = 0;
        int sum = 0;
        while(m <= n){
            if(decimal(m)==1){
        
                if(min ==0){
                    min=m;
                }
                sum+=m;
            }
            m++;

        }
        if(min==0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
           
        }
    

        in.close();
    }
    
}
