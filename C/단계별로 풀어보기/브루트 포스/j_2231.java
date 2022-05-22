import java.util.Scanner;

public class j_2231 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x;
        int sum;
        int answer=n;
        for(int i=0;i<n;i++){
            x= n-i;
            sum=n-i;
            while(x >0){
                
                sum=x%10+sum;
                x=x/10;
            }
            if(sum==n && n-i<answer){
                answer = n-i;
            }
        }

        if(answer==n){
            System.out.println(0);
        }
        else {
            System.out.println(answer);
        }
        in.close();
        
    }
    
}
