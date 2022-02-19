import java.util.Scanner;

public class j_11702 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String nn = in.nextLine();
        int sum=0;
        for(int i=0;i<n;i++){
            sum += (int)nn.charAt(i)-48;
        }

        System.out.println(sum);

        in.close();
    }
    
}
